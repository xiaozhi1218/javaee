package com.itheima.demo6_druid的使用.demo2_配置文件;

import Utils.JDBCUtils;
import Utils.User;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 12:20
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        // 1.导入jar包
        // 2.创建连接池
        // 创建Properties对象
        Properties pro = new Properties();
        // 加载配置文件
        InputStream is = Demo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

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
