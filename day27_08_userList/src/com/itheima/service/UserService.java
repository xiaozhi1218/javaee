package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * 包名:com.itheima.service
 *
 * @author Leevi
 * 日期2020-10-16  14:37
 */
public class UserService {
    private UserDao userDao = new UserDao();
    public List<User> findAll() throws SQLException {
        //调用dao层的方法，查询所有用户信息

        return userDao.findAll();
    }
}
