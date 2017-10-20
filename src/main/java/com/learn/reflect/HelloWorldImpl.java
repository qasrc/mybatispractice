package com.learn.reflect;

import org.apache.log4j.Logger;

/**
 * @author zhan
 * Created on 2017/10/20  15:30
 */
public class HelloWorldImpl implements HelloWorld{

    private static final Logger LOGGER = Logger.getLogger(HelloWorldImpl.class);
    @Override
    public void sayHello(String str) {
        LOGGER.info("要打印的内容：" + str);
    }
}
