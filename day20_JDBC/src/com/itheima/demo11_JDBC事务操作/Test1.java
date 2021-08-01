package com.itheima.demo11_JDBC事务操作;

import com.itheima.Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 15:47
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        /*
            Connection接口的api:
                setAutoCommit(boolean autoCommit)  参数为false，表示关闭自动提交，相当于开启事务; 类似sql里面的 start transaction;
                void commit() 提交事务; 类似sql里面的 commit;
                void rollback() 回滚事务; 类似sql里面的 rollback;
         */
        // 练习:模拟zs账户-100的操作
        // 1.注册驱动,获得连接
        Connection connection = JDBCUtils.getConnection();

        // 2.手动开启事务
        connection.setAutoCommit(false);

        // 3.创建预编译sql语句对象
        String sql = "update account set money = money - ? where name = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 4.设置参数
        ps.setDouble(1,100);
        ps.setString(2,"zs");

        // 5.执行sql语句,处理结果
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);

        // 6.提交事务
        connection.commit();

        // 7.释放资源
        JDBCUtils.release(null, ps, connection);
    }
}
