package com.helper.store.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.helper.store.config.StaticPeramConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author sheamus
 * @date 2019.3.4
 */
@Component
public class SmsUtil {
    private static final Logger log = LoggerFactory.getLogger(SmsUtil.class);
    private static String code ;

    public static String getPhonemsg(String mobile) {
        System.out.println(mobile);
        if (mobile == null || mobile == "") {
            log.info("手机号为空");
            return "isv.MOBILE_NUMBER_ILLEGAL";
        }
        System.setProperty(StaticPeramConfiguration.DEFAULT_CONNECT_TIMEOUT, StaticPeramConfiguration.TIMEOUT);
        System.setProperty(StaticPeramConfiguration.DEFAULT_READ_TIMEOUT, StaticPeramConfiguration.TIMEOUT);
        final String product = StaticPeramConfiguration.PROJECT;
        final String domain = StaticPeramConfiguration.DOMAIN;
        final String accessKeyId = StaticPeramConfiguration.ACCESS_KEY_ID;
        final String accessKeySecret = StaticPeramConfiguration.ACCESS_KEY_SECRET;
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                accessKeyId, accessKeySecret);
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product,
                    domain);
        } catch (ClientException e1) {
            e1.printStackTrace();
        }

        code = vCode();

        IAcsClient acsClient = new DefaultAcsClient(profile);
        SendSmsRequest request = new SendSmsRequest();
        request.setMethod(MethodType.POST);
        request.setPhoneNumbers(mobile);
        request.setSignName(StaticPeramConfiguration.SIGN_NAME);
        request.setTemplateCode(StaticPeramConfiguration.TEMPLATE_CODE);
        request.setTemplateParam("{\"name\":\""+mobile+"\",\"code\":\""+code+"\"}");
        request.setOutId("yourOutId");
        SendSmsResponse sendSmsResponse;
        try {
            sendSmsResponse = acsClient.getAcsResponse(request);
            if (sendSmsResponse.getCode() != null
                    && sendSmsResponse.getCode().equals("OK")) {
                log.info("获取验证码成功！！！");
            } else {
                log.info(sendSmsResponse.getCode());
                log.info("获取验证码失败...");
                return sendSmsResponse.getCode();
            }
        } catch (ServerException e) {
            e.printStackTrace();
            return "由于系统维护，暂时无法注册!";
        } catch (ClientException e) {
            e.printStackTrace();
            return "由于系统维护，暂时无法注册!";
        }
        return code;
    }

    /**
     * 生成6位随机数验证码
     * @return
     */
    public static String vCode(){
        String vCode = "";
        for (int i = 0; i < 6; i++) {
            vCode = vCode + (int)(Math.random() * 9);
        }
        return vCode;
    }
}
