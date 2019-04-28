package com.xiangyuwenhua.school.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserInfo> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int addUser(UserInfo userInfo) {
        userMapper.addUser(userInfo);
        return userInfo.getId();
    }



    @Override
    public int addThermometer(Thermometer thermometer) {
        userMapper.addThermometer(thermometer);
        return thermometer.getId();
    }

}

