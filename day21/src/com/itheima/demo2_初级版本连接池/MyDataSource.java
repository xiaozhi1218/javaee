package com.itheima.demo2_初级版本连接池;

import Utils.JDBCUtils;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 9:49
 */
// 连接池类
public class MyDataSource {
    // 创建LinkedList集合(池子),用来存储连接
    private static LinkedList<Connection> pools = new LinkedList<>();

    static {
        // 创建一批连接,存储在连接池中
        for (int i = 0; i < 5; i++) {
            try {
                // 创建连接
                Connection connection = JDBCUtils.getConnection();
                // 添加到集合中
                pools.add(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取连接的方法
     * @return 连接对象
     */
    public Connection getAbc(){
        Connection connection = pools.removeFirst();
        return connection;
    }

    /**
     * 归还连接的方法
     * @param connection
     */
    public void addBack(Connection connection){
        pools.addLast(connection);
    }

    /**
     * 获取连接池中连接的个数
     * @return
     */
    public static int getCount(){
        return pools.size();
    }

}
