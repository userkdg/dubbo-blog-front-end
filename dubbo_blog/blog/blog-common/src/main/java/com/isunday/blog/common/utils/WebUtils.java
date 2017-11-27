package com.isunday.blog.common.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class WebUtils {

    private static final Logger _log = LoggerFactory.getLogger(WebUtils.class);

    public static String getStrParam(String p){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder
                .getRequestAttributes()).getRequest();

        if(StringUtils.isBlank(p)){
            _log.info("当前参数{}为null || empty ",p);
            p = "";
        }
        String backParam = request.getParameter(p);
        return backParam;
    }

    /**
     *
     * @return
     */
    public static synchronized Map<String,String> getAllParam(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder
                .getRequestAttributes()).getRequest();
        Map<String,String> m = Collections.synchronizedMap(new HashMap<String, String>());

        Enumeration paramNames = request.getParameterNames();

        while (paramNames.hasMoreElements()){
            String n = (String) paramNames.nextElement();
            String p = request.getParameter(n);
            m.put(n, p);
        }

        _log.info("所有参数{}的k/v", JSON.toJSON(m));
        return m;
    }
}
