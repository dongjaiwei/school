package com.xiangyuwenhua.school.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @Autowired
    private UserService userService;
    @RequestMapping("/getuser")
    public List<UserInfo> getUser() {
        return userService.findAll();
    }

    @RequestMapping("/addUser")
    public int addUser(UserInfo userInfo) {
        //System.out.printf("name-->"+name +":   pwd-->"+pwd+"\n");
        return userService.addUser(userInfo);
    }

}
