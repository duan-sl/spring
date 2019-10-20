package com.baidu.web;

import com.baidu.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> select();
}
