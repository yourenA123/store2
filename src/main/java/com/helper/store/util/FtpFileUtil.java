package com.helper.store.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class FtpFileUtil {

    private static final Logger log = LoggerFactory.getLogger(FtpFileUtil.class);

    private static final String FTP_ADDRESS = "121.196.205.160";

    private static final int FTP_PORT = 21;

    private static final String FTP_USERNAME = "sunftp";

    private static final String FTP_PASSWORD = "123456";

    private static final String FTP_BASEPATH = "/home/sunftp/ftpdir/user";

    public  static boolean uploadFile(String originFileName, InputStream input){
        boolean success = false;
        FTPClient ftp = new FTPClient();
        ftp.setControlEncoding("GBK");
        try {
            int reply;
            ftp.connect(FTP_ADDRESS, FTP_PORT);
            ftp.login(FTP_USERNAME, FTP_PASSWORD);
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return success;
            }
            ftp.enterLocalPassiveMode();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftp.makeDirectory(FTP_BASEPATH);
            ftp.changeWorkingDirectory(FTP_BASEPATH);
            ftp.storeFile(originFileName,input);
            input.close();
            ftp.logout();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return success;
    }

    public static InputStream downloadFile(String fileName) {
        InputStream in=null;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(FTP_ADDRESS, FTP_PORT);
            ftp.login(FTP_USERNAME, FTP_PASSWORD);
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new IOException("failed to connect to the FTP Server:" + FTP_ADDRESS);
            }
            ftp.enterLocalPassiveMode();
            ftp.changeWorkingDirectory(FTP_BASEPATH);
            FTPFile[] fs = ftp.listFiles();
            in=ftp.retrieveFileStream(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return in;
    }

    /**
     * 将InputStream转化为String输出到前台
     * @param str
     * @return
     * @throws IOException
     */
    public static String changeIOToString(String str) throws IOException {
        InputStream in = FtpFileUtil.downloadFile(str);
        byte[] bytes = new byte[in.available()];
        int length = in.read(bytes);
        String base64Image = new String(Base64.encodeBase64(bytes));
        if (in != null){
            in.close();
        }
        return base64Image;
    }
}
