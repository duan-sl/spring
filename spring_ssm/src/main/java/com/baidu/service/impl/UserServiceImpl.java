package com.baidu.service.impl;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import com.baidu.web.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;


    @Override
    public List<User> select() {
        List<User> userList = dao.select();
        return userList;
    }
}
