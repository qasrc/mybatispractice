package com.learn.proxy;

import org.apache.log4j.Logger;

/**
 * @author zhan
 * Created on 2017/10/22  14:47
 */
public class PersonServiceImpl implements PersonService {

    private static final Logger LOGGER = Logger.getLogger(PersonServiceImpl.class);

    @Override
    public void say(String string) {
        LOGGER.info("我要说的话：" + string);
    }
}
