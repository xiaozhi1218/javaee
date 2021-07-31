package com.itheima.demo8_登录案例;

import com.itheima.Utils.JDBCUtils;
import com.itheima.demo1_JDBC快速入门.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 12:18
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            在控制台输入用户名和密码,查询数据库,如果数据库存在当前用户,显示登录成功!
            如果数据库不存在当前用户,显示登录失败!
         */
        // 1.获取用户输入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        // 2.根据用户输入的用户名和密码去数据库中查询记录(封装User对象)
        // 2.1 获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.2 创建执行sql语句对象
        Statement statement = connection.createStatement();

        // 2.3 执行sql语句,处理结果
        String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
        ResultSet resultSet = statement.executeQuery(sql);

        User user = null;
        while (resultSet.next()) {
            // 创建user对象
            user = new User();
            // 给属性赋值
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
        }

        // 2.4 释放资源
        JDBCUtils.release(resultSet, statement, connection);

        // 3.判断是否查询到了数据:(判断User是否为null)
        System.out.println(user);
        if (user != null) {
            // 3.1 如果查询到了,就显示登录成功!
            System.out.println("登录成功!");
        }else {
            // 3.2 如果没有查询到,就显示登录失败!
            System.out.println("登录失败!");
        }
    }
}
