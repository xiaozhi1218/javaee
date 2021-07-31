package com.itheima.demo10_使用preparedStatement完成CRUD;

import com.itheima.Utils.JDBCUtils;
import com.itheima.demo1_JDBC快速入门.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 15:11
 */
public class Demo {
    @Test
    // 往day20_1数据库的user表中插入一条记录
    public void insert() throws Exception{
        // 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "insert into user values(null,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setString(1,"tq" );
        ps.setString(2,"123456" );
        ps.setString(3,"田七" );

        // 4.执行sql语句
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, ps, connection);
    }

    @Test
    // 修改day20_1数据库的user表中的id为7的密码为abcdef
    public void update() throws Exception{
        // 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "update user set password = ? where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setString(1,"abcdef" );
        ps.setInt(2,7 );

        // 4.执行sql语句
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, ps, connection);
    }

    @Test
    // 删除day20_1数据库的user表中的id为5
    public void delete() throws Exception{
        // 1.加载驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "delete from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setInt(1,5 );

        // 4.执行sql语句
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 5.释放资源
        JDBCUtils.release(null, ps, connection);
    }

    @Test
    // 查询day20_1数据库的user表中的所有数据
    public void select1() throws Exception{
        // 1.注册驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "select * from user";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数(不需要,因为sql语句没有参数)

        // 4.执行sql语句,处理结果
        ResultSet resultSet = ps.executeQuery();
        // 创建ArrayList集合,限制集合元素类型为User
        ArrayList<User> list = new ArrayList<User>();
        while (resultSet.next()) {
            // 创建User对象
            User user = new User();
            // 给属性赋值
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
            // 添加到集合中
            list.add(user);
        }

        // 5.释放资源
        JDBCUtils.release(resultSet, ps, connection);

        for (User user : list) {
            System.out.println(user);
        }
    }


    @Test
    // 查询day20_1数据库的user表中姓名为zs
    public void select2() throws Exception{
        // 1.注册驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "select * from user where username = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.设置参数
        ps.setString(1,"zs" );

        // 4.执行sql语句,处理结果
        ResultSet resultSet = ps.executeQuery();

        User user = null;

        while (resultSet.next()) {
            // 创建User对象
            user = new User();
            // 给属性赋值
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
        }

        // 5.释放资源
        JDBCUtils.release(resultSet, ps, connection);

        System.out.println(user);
    }

}
