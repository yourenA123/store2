package com.helper.store.config;

import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author sheamus
 * @date 2019.3.4
 */
@Configurable
public class StaticPeramConfiguration {
    /**
     * 设置超时时间-可自行调整
     */
    public final static String DEFAULT_CONNECT_TIMEOUT  = "sun.net.client.defaultConnectTimeout";
    public final static String DEFAULT_READ_TIMEOUT = "sun.net.client.defaultReadTimeout";
    public final static String TIMEOUT = "10000";

    /**
     * 短信API产品名称（短信产品名固定，无需修改）
     */
    public final static String PROJECT = "Dysmsapi";

    /**
     * 短信API产品域名（接口地址固定，无需修改）
     */
    public final static String DOMAIN = "dysmsapi.aliyuncs.com";


    /**
     * 你的accessKeyId,填你自己的 上文配置所得  自行配置
     */
    public final static String ACCESS_KEY_ID = "LTAI4Fqvp2EQQptj7PrVypkX";

    /**
     * 你的accessKeySecret,填你自己的 上文配置所得 自行配置
     */
    public final static String ACCESS_KEY_SECRET = "RykVsdi0gbw3wnxMwtJz7o28LbMLH5";

    /**
     * 必填:短信签名-可在短信控制台中找到
     * 阿里云配置你自己的短信签名填入
     */
    public final static String SIGN_NAME = "浙江昀翔网络科技有限公司";

    /**
     * 阿里云配置你自己的短信模板填入
     */
    public final static String TEMPLATE_CODE = "SMS_174650512";

}
