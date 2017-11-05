package com.learn.proxy;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhan
 * Created on 2017/10/22  14:51
 */
public class MyClassProxy<T> implements InvocationHandler {

    private Class<T> interfaces;

    private static final Logger LOGGER = Logger.getLogger(MyClassProxy.class);

    public MyClassProxy(Class<T> interfaces){
        this.interfaces = interfaces;
    }


    private Object target;

    public Object bind(Object targe) {
        this.target = targe;
        return Proxy.newProxyInstance(targe.getClass().getClassLoader(),
                targe.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        LOGGER.info("准备");
        result = method.invoke(target, args);
        LOGGER.info("结束");
        return result;
    }
}
