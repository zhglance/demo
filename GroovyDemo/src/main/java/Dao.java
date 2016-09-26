package com.grrovy.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangzh on 2016/9/6.
 */
public class Dao {

    public void insert(BeanEntity bean){
           System.out.println("Dao insert");
    }

    public void remove(String id){
        System.out.println("Dao remove");
    }

    public void update(String name,String type){
        System.out.println("Dao update");
    }

    public List<BeanEntity> finds(String name){
        System.out.println("Dao finds");
        BeanEntity bean = new BeanEntity();
        bean.setBeanId("24336461423");
        bean.setBeanName("张三");
        bean.setBeanType("学生");
        return Arrays.asList(bean);
    }

}
