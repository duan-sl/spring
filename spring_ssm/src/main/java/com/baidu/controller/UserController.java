package com.baidu.controller;


import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/ds")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public void save(){
        System.out.println("=================");
        List<User> userList = userService.select();
        System.out.println(userList);
    }

    @GetMapping("/test")
    public String test(){
        return "<h1>ok</h1>";
    }
}
