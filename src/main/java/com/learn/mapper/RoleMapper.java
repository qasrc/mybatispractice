package com.learn.mapper;

import com.learn.po.Role;

/**
 * @author zhan
 * Created on 2017/10/15  1:57
 */
public interface RoleMapper {

    Role getRoleById(int id);

    int insertRole(Role role);

    Role getRole(int id);
}
