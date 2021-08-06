package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;

import java.sql.SQLException;

/**
 * 包名:com.itheima.service
 *
 * @author Leevi
 * 日期2020-10-16  14:55
 */
public class UserService {
    private UserDao userDao =  new UserDao();

    /**
     * 处理注册
     * @param user
     * @throws SQLException
     */
    public void register(User user) throws SQLException {
        //调用dao层的方法保存用户信息
        userDao.saveUser(user);
    }

    public User login(String username,String password) throws SQLException {
        //根据用户名和密码校验登录
        return userDao.findUser(username,password);
    }
}
