package com.baidu.web.impl;


import com.baidu.pojo.User;
import com.baidu.web.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> select() {
        List<User> users = jdbcTemplate.query("select * from sys_role ", new BeanPropertyRowMapper<User>(User.class));
        return users;
    }
}
