package com.lance.spock.demo.service.impl;

import com.lance.spock.demo.api.BizService;
import com.lance.spock.demo.dao.Dao;
import com.lance.spock.demo.entity.PersonEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangzh on 2016/9/6.
 */

@Service
public class BizServiceImpl implements BizService {


    @Autowired
   private Dao dao;

    public String insert(String id, String name, int age) {

        if (StringUtils.isAnyBlank(id, name)) {
            return "";
        }

        PersonEntity bean = new PersonEntity();
        bean.setAge(age);
        bean.setPersonId(id);
        bean.setPersonName(name);
        dao.insert(bean);

        return name;
    }

    public String remove(String id) {
        if (StringUtils.isBlank(id)) {
            return "";
        }
        dao.remove(id);

        return id;
    }


    public String update(String name, int age) {
        if (StringUtils.isAnyBlank(name)) {
            return "";
        }
        dao.update(name, age);
        return name;
    }


    public String finds(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        }
        List<PersonEntity> beans = dao.finds(name);

        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (PersonEntity bean : beans) {
            sb.append(bean.getAge()).append("#");
        }

        return sb.toString();
    }


    public boolean isAdult(int age) throws Exception {

        if(age < 0) {
            throw new Exception("age is less than zero.");
        }

        return age >= 18;
    }


    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

}
