
package com.lance.spock.demo.dao;

import com.lance.spock.demo.entity.PersonEntity;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangzh on 2016/9/6.
 */

@Repository
public class Dao {

    public void insert(PersonEntity bean) {
        System.out.println("Dao insert person");
    }

    public void remove(String id) {
        System.out.println("Dao remove");
    }

    public void update(String name, int age) {
        System.out.println("Dao update");
    }

    public List<PersonEntity> finds(String name) {
        System.out.println("Dao finds");
        PersonEntity bean = new PersonEntity();
        bean.setPersonId("24336461423");
        bean.setPersonName("张三");
        bean.setAge(28);
        return Arrays.asList(bean);
    }

}
