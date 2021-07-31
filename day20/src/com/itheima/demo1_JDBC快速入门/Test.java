package com.itheima.demo1_JDBC快速入门;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 9:50
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1.创建java项目,导入mysql驱动jar包
        // 2.加载驱动
        //DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.jdbc.Driver");

        // 3.获得连接
        String url = "jdbc:mysql://127.0.0.1:3306/day20_1";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);

        // 4.获得执行sql语句对象
        Statement statement = connection.createStatement();

        // 5.执行sql语句,处理结果
        ResultSet resultSet = statement.executeQuery("select * from user");

        // 创建一个ArrayList集合,限制集合中元素的类型为User
        ArrayList<User> list = new ArrayList<>();

        while (resultSet.next()) {
            //System.out.println(resultSet.getObject("id"));
            //System.out.println(resultSet.getObject("username"));
            //System.out.println(resultSet.getObject("password"));
            //System.out.println(resultSet.getObject("nickname"));
            //System.out.println(resultSet.getObject(1));
            //System.out.println(resultSet.getObject(2));
            //System.out.println(resultSet.getObject(3));
            //System.out.println(resultSet.getObject(4));
            //System.out.println(resultSet.getInt("id"));
            //System.out.println(resultSet.getString("username"));
            //System.out.println(resultSet.getString("password"));
            //System.out.println(resultSet.getString("nickname"));
            //System.out.println("=================================================");
            // 创建user对象,封装遍历出来的这条记录每列的数据
            User use = new User();
            // 给属性赋值
            use.setId(resultSet.getInt("id"));
            use.setUsername(resultSet.getString("username"));
            use.setPassword(resultSet.getString("password"));
            use.setNickname(resultSet.getString("nickname"));

            // 添加到集合中
            list.add(use);
        }

        // 6.释放资源
        if (resultSet != null) {
            resultSet.close();
        }

        if (statement != null) {
            statement.close();
        }

        if (connection != null) {
            connection.close();
        }

        System.out.println(list);
    }
}
