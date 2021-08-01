package com.itheima.demo5_c3p0的使用.demo2_配置文件;

import Utils.JDBCUtils;
import Utils.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 11:16
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        /*
            配置文件:
                1.必须放在src路径下
                2.配置文件名必须为c3p0-config.xml
         */
        // 1.导入jar包
        // 2.创建连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

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
