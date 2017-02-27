package com.lombok.demo;

import lombok.extern.java.Log;

/**
 * Created by zhangzh on 2017/2/8.
 */
@Log
public class LombokTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(27);
        student.setMale("man");
        student.setName("lance");
        student.setStudentNo("2017");

        System.out.println(student.toString());

        Student student2 = new Student();
        student2.setAge(27);
        student2.setMale("man");
        student2.setName("lance");
        student2.setStudentNo("2017");

        System.out.println(student.equals(student2));

        student2.setStudentNo("2018");

        System.out.println(student.equals(student2));

        log.info("lombok test");

    }
}
