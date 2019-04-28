package com.xiangyuwenhua.school.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class TestBootController {

    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public List<UserInfo> getUser() {
        return userService.findAll();
    }

    @RequestMapping("/addUser")
    public int addUser(UserInfo userInfo) {

        return userService.addUser(userInfo);
    }

    @RequestMapping("/addTM")
    public int addTM(Thermometer thermometer){
       return userService. addThermometer(thermometer);
    }


}
