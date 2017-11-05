package com.learn.proxy;

import java.lang.reflect.Proxy;

/**
 * @author zhan
 * Created on 2017/11/04  14:11
 */
public class StudentProxyTest {
    public static void main(String[] args) {
        Student student = new BoyStudent();
        Student studentProxy = (Student) Proxy.newProxyInstance(student.getClass().getClassLoader(),
                new Class[]{Student.class}, new StudentProxy(student));
        String s = studentProxy.getStr("123");
        System.out.println(s);
    }
}
