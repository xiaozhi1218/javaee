package com.itheima.service;

import com.itheima.dao.AccountDao;
import com.itheima.utils.DruidUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 包名:com.itheima.service
 * @author Leevi
 * 日期2020-10-16  11:14
 * 对某个功能添加事务，有三步:
 * 1. 开启事务: 业务逻辑开始之前, connection.setAutoCommit(false)
 * 2. 提交事务: 业务逻辑执行完没有出现异常的时候, connection.commit()
 * 3. 回滚事务: 业务逻辑执行过程中出现异常, connection.rollback()
 *
 * 开启事务的连接Connection和操作SQL语句的Connection应该是同一个Connection
 */
public class AccountService {
    private AccountDao accountDao = new AccountDao();
    public void transfer(String fromName,String toName,Double money) {
        Connection connection = null;
        try {
            //开启事务
            connection = DruidUtil.getConnection();
            connection.setAutoCommit(false);

            //2. 处理转账
            //2.1 转出账户扣款
            accountDao.updateAccount(-money, fromName);

            //转账过程中出现异常
            int num = 10 / 0;

            //2.2 转入账户收款
            accountDao.updateAccount(money, toName);

            //提交事务
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            try {
                connection.rollback();

                //将异常还是要抛出去
                throw new RuntimeException(e.getMessage());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
