package com.itheima.demo12_JDBC事务实现转账案例;

import com.itheima.Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 16:00
 */
public class Test {
    public static void main(String[] args) {
        // 需求:zs给ls转100, 使用事务进行控制
        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            // 1.注册驱动,获得连接
            connection = JDBCUtils.getConnection();

            // 2.手动开启事务
            connection.setAutoCommit(false);

            // 3.创建预编译sql语句对象
            String sql1 = "update account set money = money - ? where name = ?";
            String sql2 = "update account set money = money + ? where name = ?";
            ps1 = connection.prepareStatement(sql1);
            ps2 = connection.prepareStatement(sql2);

            // 4.设置参数
            // 5.执行sql语句
            // zs-100
            ps1.setDouble(1, 100);
            ps1.setString(2, "zs");
            int rows1 = ps1.executeUpdate();

            // 可能出现异常
            //System.out.println(1 / 0);

            // ls+100
            ps2.setDouble(1, 100);
            ps2.setString(2, "ls");
            int rows2 = ps2.executeUpdate();

            // 6.提交事务
            connection.commit();

        } catch (Exception e) {
            try {
                connection.rollback();// 回顾事务
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            // 7.释放资源
            JDBCUtils.release(null, ps1, connection);
            JDBCUtils.release(null, ps2, null);
        }
    }
}
