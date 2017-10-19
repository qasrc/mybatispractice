package com.learn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工厂接口工具类
 *
 * @author zhan
 * Created on 2017/10/15  2:26
 */
public class SqlSessionFactoryUtil {

  private static SqlSessionFactory sqlSessionFactory = null;

    /**
     * 获取mybatis的sqlsessionfactory
     * @return factory工厂
     * @throws IOException
     */
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if (sqlSessionFactory == null) {
            String path = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(path);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;

    }

    /**
     * 打开一个会话
     */
    public static SqlSession openSqlSession() throws IOException {
        SqlSessionFactory sessionFactory = getSqlSessionFactory();
        return sessionFactory.openSession();
    }


}
