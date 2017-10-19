package com.learn;

import com.learn.mapper.RoleMapper;
import com.learn.po.Role;
import com.learn.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/10/19  9:37
 */
public class MybatisTest {

    private static final Logger LOGGER = Logger.getLogger(MybatisTest.class);

    @Test
    public void test() throws IOException {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        LOGGER.info("进行第一次查询 ");
        Role role = roleMapper.getRoleById(1);
        LOGGER.info(role.toString());
        LOGGER.info("相同的条件进行第二次查询");
        Role role1 = roleMapper.getRoleById(1);
        sqlSession.commit();
        LOGGER.info(role1);
        LOGGER.info("创建一个新的session");
        SqlSession session = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper roleMapper1 = session.getMapper(RoleMapper.class);
        LOGGER.info("相同的条件进行第三次查询");
        Role role2 = roleMapper1.getRoleById(1);
        sqlSession.commit();
        LOGGER.info(role2);
        //根据角色名称查询角色
        List<Role> role3 = roleMapper1.getRoleByName("1");
        LOGGER.info(role3);

    }
}
