package com.itheima.demo5_c3p0的使用.demo1_硬编码;

import Utils.JDBCUtils;
import Utils.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 11:16
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        // 1.导入jar包
        // 2.创建连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day21_1");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setInitialPoolSize(5);

        // 3.根据连接池获取连接
        Connection connection = dataSource.getConnection();

        // 4.创建预编译sql语句对象
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 5.设置参数
        ps.setInt(1,1 );

        // 6.执行sql语句,处理结果
        ResultSet resultSet = ps.executeQuery();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
        }
        System.out.println(user);
        // 7.释放资源
        JDBCUtils.release(resultSet,ps ,connection );
    }
}
