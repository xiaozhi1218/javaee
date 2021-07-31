package com.itheima.demo1_复习JDBC的CRUD;

import Utils.JDBCUtils;
import Utils.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 8:32
 */
public class Demo {

    @Test
    public void insert() throws Exception{
        // 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "insert into user values(null,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setString(1,"zl" );
        ps.setString(2,"123456" );
        ps.setString(3,"老赵" );

        // 4.执行sql语句,处理结果
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, ps,connection );
    }

    @Test
    public void update() throws Exception{
        // 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "update user set password = ? where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setString(1,"abcdef" );
        ps.setInt(2,2 );

        // 4.执行sql语句,处理结果
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, ps,connection );
    }

    @Test
    public void delete() throws Exception{
        /// 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "delete from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setInt(1,3 );

        // 4.执行sql语句,处理结果
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, ps,connection );
    }

    @Test
    public void select()throws Exception{
        // 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

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
        // 5.释放资源
        JDBCUtils.release(resultSet, ps, connection);
    }


}
