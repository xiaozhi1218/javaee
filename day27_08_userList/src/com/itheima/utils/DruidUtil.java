package com.itheima.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 包名:com.itheima.utils
 *
 * @author Leevi
 * 日期2020-07-06  11:45
 */
public class DruidUtil {
    private static DataSource dataSource;
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal();
    static {
        try {
            //1. 创建Properties对象
            Properties properties = new Properties();
            //2. 将配置文件转换成字节输入流
            InputStream is = DruidUtil.class.getClassLoader().getResourceAsStream("druid.properties");
            //3. 使用properties对象加载is
            properties.load(is);
            //druid底层是使用的工厂设计模式，去加载配置文件，创建DruidDataSource对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据源
     * @return
     */
    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * 获取连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        //从ThreadLocal中获取连接
        Connection connection = threadLocal.get();
        if (connection == null) {
            //说明threadLocal中还未存放连接,那么我们就从连接池拿出一个连接存储到ThreadLocal中
            connection = dataSource.getConnection();
            threadLocal.set(connection);
        }
        return connection;
    }
}
