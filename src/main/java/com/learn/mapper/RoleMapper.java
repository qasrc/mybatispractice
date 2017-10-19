package com.learn.mapper;

import com.learn.po.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhan
 * Created on 2017/10/15  1:57
 */
public interface RoleMapper {

    Role getRoleById(int id);

    int insertRole(Role role);

    Role getRole(int id);

    List<Role> getRoleByName(@Param("name") String name);
}
