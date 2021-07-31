package com.itheima.demo7_JDBC工具类的测试;

import com.itheima.Utils.JDBCUtils;
import com.itheima.demo1_JDBC快速入门.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 11:43
 */
public class JdbcCRUD {
    @Test
    // 往day20_1数据库的user表中添加一条记录
    public void insert() throws Exception{
    //public static void main(String[] args)throws Exception {
        Connection connection = JDBCUtils.getConnection();

        // 3.创建执行sql语句对象
        Statement statement = connection.createStatement();

        // 4.执行sql语句,处理结果
        String sql = "insert into user values(null,'zl','123456','赵六')";
        int rows = statement.executeUpdate(sql);
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, statement, connection);
    }

    @Test
    // 查询day20_1数据库的user表中所有记录
    public void select1() throws Exception{
        Connection connection = JDBCUtils.getConnection();

        // 3.创建执行sql语句对象
        Statement statement = connection.createStatement();

        // 4.执行sql语句,处理结果
        String sql = "select * from user";
        ResultSet resultSet = statement.executeQuery(sql);

        // 创建ArrayList集合,限制集合元素类型为User
        ArrayList<User> list = new ArrayList<>();

        while (resultSet.next()) {
            // 创建一个User对象,用来封装记录的列数据
            User use = new User();
            // 封装数据
            use.setId(resultSet.getInt("id"));
            use.setUsername(resultSet.getString("username"));
            use.setPassword(resultSet.getString("password"));
            use.setNickname(resultSet.getString("nickname"));

            // 添加对象到集合
            list.add(use);
        }

        // 5.释放资源
        JDBCUtils.release(resultSet, statement, connection);

        //...
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
}
