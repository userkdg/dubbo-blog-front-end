package com.isunday.blog.common.plugin;

import com.isunday.blog.common.utils.ConfigAESUtil;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * spring的xml中支持加密的配置文件
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static  final String[] propertyNames ={"master.jdbc.password","master.redis.password","slave.jdbc.password"};
    /**
     * 解密指定propertyName的加密属性值
     * @param propertyName
     * @param propertyValue
     * @return
     */
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        for (String p : propertyNames) {
            if (p.equalsIgnoreCase(propertyName)) {
                return ConfigAESUtil.AESDecode(propertyValue);
            }
        }
        return super.convertProperty(propertyName, propertyValue);
    }
}
