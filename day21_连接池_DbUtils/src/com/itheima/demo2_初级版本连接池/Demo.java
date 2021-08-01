package com.itheima.demo2_初级版本连接池;

import Utils.JDBCUtils;
import Utils.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 9:48
 */
public class Demo {
    @Test
    public void update() throws Exception{
        // 1.创建连接池,获得连接
        MyDataSource dataSource = new MyDataSource();

        System.out.println("获得连接之前:"+MyDataSource.getCount());// 5
        // 获得连接
        Connection connection = dataSource.getAbc();
        System.out.println("获得连接之后:"+MyDataSource.getCount());// 4

        // 2.创建预编译sql语句对象
        String sql = "update user set password = ? where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setString(1,"123456" );
        ps.setInt(2,2 );

        // 4.执行sql语句,处理结果
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 归还连接
        dataSource.addBack(connection);

        // 5.释放资源
        JDBCUtils.release(null, ps,null );

        System.out.println("归还连接之后:"+MyDataSource.getCount());// 5

    }

    @Test
    public void select()throws Exception{
        // 1.创建连接池,获得连接
        MyDataSource dataSource = new MyDataSource();

        System.out.println("获得连接之前:"+MyDataSource.getCount());// 5
        // 获得连接
        Connection connection = dataSource.getAbc();
        System.out.println("获得连接之后:"+MyDataSource.getCount());// 4

        // 2.创建预编译sql语句对象
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setInt(1,1 );

        // 4.执行sql语句,处理结果(封装)
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
        // 归还连接
        dataSource.addBack(connection);

        // 5.释放资源
        JDBCUtils.release(resultSet, ps, null);
        System.out.println("归还连接之后:"+MyDataSource.getCount());// 5
    }

}
