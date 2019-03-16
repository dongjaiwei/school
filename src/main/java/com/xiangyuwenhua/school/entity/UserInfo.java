package com.xiangyuwenhua.school.entity;



import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.swing.plaf.TextUI;
import java.io.Serializable;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private  String name;
    private String pwd;
    private int id;

    public UserInfo(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return StringUtils.isEmpty(pwd)?"空": DigestUtils.md5DigestAsHex(pwd.getBytes());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
