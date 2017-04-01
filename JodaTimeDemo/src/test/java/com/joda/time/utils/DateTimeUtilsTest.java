package com.joda.time.utils;

import org.junit.Test;

/**
 * Created by zhangzh on 2017/3/24.
 */
public class DateTimeUtilsTest {
    @Test
    public void getYyyyMmDd() throws Exception {


        System.out.println(DateTimeUtils.getYyyyMmDd(System.currentTimeMillis()));

    }

}