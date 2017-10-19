package com.learn.cache;

import org.apache.ibatis.cache.Cache;
import org.apache.log4j.Logger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zhan
 * Created on 2017/10/19  16:15
 */
public class MyCache implements Cache {
    private static final Logger LOGGER = Logger.getLogger(MyCache.class);
    private String id;
    private ConcurrentHashMap<Object, Object> cache = new ConcurrentHashMap<>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void setId(String id) {
        this.id = id;
    }

    public MyCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        LOGGER.info("-------->获取缓存ID:" + id);
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        LOGGER.info("------>保存缓存信息");
        cache.put(key, value);
    }

    @Override
    public Object getObject(Object key) {
        LOGGER.info("------->根据key获取缓存信息");
        return cache.get(key);
    }

    @Override
    public Object removeObject(Object key) {
        LOGGER.info("------->根据key移除缓存信息");
        Object value = cache.get(key);
        cache.remove(key);
        return value;
    }

    @Override
    public void clear() {
        LOGGER.info("------>清空缓存 ");
        cache.clear();
    }

    @Override
    public int getSize() {
        LOGGER.info("获取缓存大小");
        return cache.size();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        LOGGER.info("获取读写锁");
        return readWriteLock;
    }
}
