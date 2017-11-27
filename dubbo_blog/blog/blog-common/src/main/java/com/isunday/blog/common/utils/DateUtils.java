package com.isunday.blog.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
    private static final String DATE_FORMAT2 = "yyyy-MM-dd";

    private DateUtils(){};

    private static SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
    public static String getNowDate(){
        return format.format(new Date());
    }
}
