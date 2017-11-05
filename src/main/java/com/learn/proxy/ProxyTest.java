package com.learn.proxy;

/**
 * @author zhan
 * Created on 2017/10/22  14:56
 */
public class ProxyTest {

    public static void main(String[] args) {
        MyClassProxy classProxy = new MyClassProxy(PersonService.class);
        PersonServiceImpl personServiceImpl = new PersonServiceImpl();
        PersonService personService = (PersonService) classProxy.bind(personServiceImpl);
        personService.say("HELLO WORLD");
    }
}
