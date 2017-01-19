package com.aop.impl;

import com.aop.api.Service;

/**
 * Created by zhangzh on 2016/8/5.
 */
public class ServiceImpl implements Service {
    public void save(String info) {
        System.out.println("save info:" + info);
    }
}
