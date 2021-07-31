package com.itheima.demo11_自定义DBUtils增删改;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 16:31
 */
public class MyQueryRunner {

    private DataSource dataSource;

    public MyQueryRunner(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 增删改的方法
     *
     * @param sql  sql语句
     * @param args 参数
     * @return 受影响的行数
     */
    public int update(String sql, Object... args) throws SQLException {
        // 1.非空判断
        if (dataSource == null) {
            return -1;
        }

        if (sql == null) {
            return -1;
        }

        // 2.获得连接
        Connection connection = dataSource.getConnection();

        // 3.创建预编译sql语句对象
        PreparedStatement ps = connection.prepareStatement(sql);

        // 4.获取sql语句参数的元数据对象
        ParameterMetaData pmd = ps.getParameterMetaData();

        // 5.根据参数的元数据对象获取参数的个数
        int count = pmd.getParameterCount();

        // 6.循环遍历
        for (int i = 1; i <= count; i++) {
            // 7.在循环中,设置参数的值setObject()
            ps.setObject(i, args[i-1]);
        }

        // 8.执行sql语句
        int rows = ps.executeUpdate();

        // 9.返回sql语句的结果
        return rows;
    }
}
