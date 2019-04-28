package com.xiangyuwenhua.school.entity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {

    List<UserInfo> findAll();
    int addUser(UserInfo userInfo);
    int addThermometer(Thermometer thermometer);
    List<Thermometer> getThermometers(@Param("start") String startTime, @Param("end") String endTime);
}
