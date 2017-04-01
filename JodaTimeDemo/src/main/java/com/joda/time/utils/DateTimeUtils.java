package com.joda.time.utils;


import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by zhangzh on 2017/3/24.
 */
public class DateTimeUtils {


    private static DateTimeFormatter format = DateTimeFormat.forPattern("yyyy年MM月dd日 HH:mm:ss");


    public static String getYyyyMmDd(long longTime) {

        return format.print(longTime);

    }

}
