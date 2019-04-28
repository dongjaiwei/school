package com.xiangyuwenhua.school.entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    List<UserInfo> findAll();
    int addUser(UserInfo userInfo);
    int addThermometer(Thermometer thermometer);
}
