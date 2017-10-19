package com.learn.po;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 角色
 *
 * @author zhan
 * Created on 2017/10/15  1:50
 */
@Alias("role")
public class Role implements Serializable {
    private Integer id;
    private String roleName;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
