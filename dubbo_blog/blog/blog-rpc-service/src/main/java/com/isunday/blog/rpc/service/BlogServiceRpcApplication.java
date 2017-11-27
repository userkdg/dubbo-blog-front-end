package com.isunday.blog.rpc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BlogServiceRpcApplication {
    /**
     * 服务启动类
     */
    private static Logger _log = LoggerFactory.getLogger(BlogServiceRpcApplication.class);

    public static void main(String[] args) {
        _log.info(">>>>>dubbo...........init 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext*.xml");
        _log.info(">>>>>dubbo...........start 启动完成 <<<<<");
    }

}
