package Utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 11:33
 */
public class C3P0Utils {
    // 创建c3p0连接池对象
    private static final ComboPooledDataSource DATA_SOURCE = new ComboPooledDataSource();

    /**
     * 获得连接的方法
     * @return  连接
     * @throws Exception
     */
    public static Connection getConnection() throws Exception{
        Connection connection = DATA_SOURCE.getConnection();
        return connection;
    }

    /**
     * 获得连接池的方法
     * @return
     */
    public static DataSource getDataSource(){
        return DATA_SOURCE;
    }

    /**
     * 释放资源
     *
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
