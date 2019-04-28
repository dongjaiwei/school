package com.xiangyuwenhua.school.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/addThermometer")
    public int addThermometer(Thermometer thermometer) {
        return userService.addThermometer(thermometer);
    }


    @RequestMapping("/getThermometers")
    public List<Thermometer> getThermometers(@RequestParam("startTime") String startTime
            , @RequestParam("endTime") String endTime) {
        return userService.getThermometers(startTime, endTime);
    }

}
