package com.learn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhan
 * Created on 2017/11/04  14:06
 */
public class StudentProxy implements InvocationHandler {

    private Object proxyed;

    public Object getProxyed() {
        return proxyed;
    }

    public void setProxyed(Object proxyed) {
        this.proxyed = proxyed;
    }

    public StudentProxy(Object proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       // String className = proxy.getClass().getName();
        //System.out.println("类名：" + className);
        Object result = method.invoke(proxyed, args);
        if (String.valueOf(result).equals("test")) {
            return "已替换";
        }else{
            return result;
        }
    }
}
