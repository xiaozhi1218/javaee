package com.itheima.demo4_终极版本连接池;

import Utils.JDBCUtils;
import Utils.User;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 9:48
 */
public class Demo {
    @Test
    public void select()throws Exception{
        // 1.创建连接池,获得连接
        DataSource dataSource = new MyDataSource();

        System.out.println("获得连接之前:"+ MyDataSource.getCount());// 5
        // 获得连接
        Connection connection = dataSource.getConnection();// 被增强的连接---->换成增强的连接
        System.out.println("获得连接之后:"+ MyDataSource.getCount());// 4

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
        //dataSource.addBack(connection);// 不能调用,编译报错
        // 分析:DataSource接口中没有归还连接的方法;自定义的连接池也最好不要新增api
        // 所以:是否可以把Connection的close方法的功能从销毁连接改变为归还连接?
        // 解决方案: 1.继承重写   2.装饰者模式    3.动态代理
        //connection.close();// 增强的连接调用close方法

        // 5.释放资源
        JDBCUtils.release(resultSet, ps, connection);
        System.out.println("归还连接之后:"+ MyDataSource.getCount());// 5
    }

}
