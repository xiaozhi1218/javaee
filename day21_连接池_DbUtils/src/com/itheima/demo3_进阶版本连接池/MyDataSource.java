package com.itheima.demo3_进阶版本连接池;

import Utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 9:49
 */
// 连接池类
public class MyDataSource implements DataSource {
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
    /*public Connection getCon(){
        Connection connection = pools.removeFirst();
        return connection;
    }*/

    /**
     * 获得连接的方法
     * @return
     * @throws SQLException
     */
    @Override
    public Connection getConnection() throws SQLException {
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



    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
