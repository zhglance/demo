package com.lombok.demo;


import lombok.*;

/**
 * Created by zhangzh on 2017/2/8.
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Data
public class Student {

    private String name;
    private int age;
    private String male;
    private String studentNo;
}
