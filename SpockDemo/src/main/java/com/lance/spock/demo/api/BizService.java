/**
 * Created by zhangzh on 2017/2/25.
 */

package com.lance.spock.demo.api;

public interface BizService {

    String insert(String id, String name, int age);

    String remove(String id);

    String update(String name, int age);

    String finds(String name);

    boolean isAdult(int age) throws Exception;
}
