package com.learn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工厂接口工具类
 *
 * @author zhan
 * Created on 2017/10/15  2:26
 */
public class SqlSessionFactoryUtil {
    private static final Logger LOGGER = Logger.getLogger(SqlSessionFactoryUtil.class);
    public static void main(String[] args) throws IOException {
        String path = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(path);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        LOGGER.info(sqlSessionFactory.toString());
        System.out.println(sqlSessionFactory.getConfiguration().getMapperRegistry().getMappers());
        System.out.println(sqlSessionFactory.getConfiguration().getDatabaseId());
        //SqlSession sqlSession = sqlSessionFactory.openSession();
    }
}
