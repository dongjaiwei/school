package com.xiangyuwenhua.school.entity;



import java.util.List;


public interface UserService {
    List<UserInfo> findAll();
    int addUser(UserInfo userInfo);
    int addThermometer(Thermometer thermometer);
    List<Thermometer> getThermometers(String startTime,String endTime);
}
