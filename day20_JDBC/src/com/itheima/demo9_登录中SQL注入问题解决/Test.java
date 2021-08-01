package com.itheima.demo9_登录中SQL注入问题解决;

import com.itheima.Utils.JDBCUtils;
import com.itheima.demo1_JDBC快速入门.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            PreparedStatement接口:
                概述: 预编译SQL语句对象，是Statemen接口的子接口。
                作用: 预编译sql语句,固定sql语句的格式,并且还可以执行sql语句
                api:
                    预编译sql语句:
                        使用Connection接口的方法
                        PreparedStatement prepareStatement(String sql) 预编译sql语句,从而得到预编译sql语句对象
                        参数sql表示预编译的sql语句,如果sql语句有参数通过?来占位
                        例如: select * from user where username = ? and password = ?;

                    为sql语句设置参数值:
                        预编译对象.set类型(int i,Object obj);参数1i:指的就是问号的索引(指第几个问号,从1开始),参数2就是值
                        例如: 预编译对象.setString(1,"zs");   预编译对象.setString(2,"123456");

                    执行sql语句:
                        ResultSet executeQuery(); 执行查询语句
                        int executeUpdate();执行增删改语句
         */
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

        // 2.2 创建预编译sql语句对象,对sql语句进行预编译
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 为sql语句设置参数
        ps.setString(1,username);
        ps.setString(2,password);

        // 2.3 执行sql语句,处理结果
        ResultSet resultSet = ps.executeQuery();

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
        JDBCUtils.release(resultSet, ps, connection);

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
