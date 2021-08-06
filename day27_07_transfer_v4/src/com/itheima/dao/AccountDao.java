package com.itheima.dao;

import com.itheima.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * 包名:com.itheima.dao
 * @author Leevi
 * 日期2020-10-16  11:17
 * 持久层只负责数据库的增删改查
 */
public class AccountDao {
    private QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());

    /**
     * 修改帐户金额的方法
     *
     * @param money
     * @param name
     * @throws SQLException
     */
    public void updateAccount(Double money, String name) throws SQLException {
        String sql = "update account set money=money+? where name=?";

        queryRunner.update(DruidUtil.getConnection(),sql,money,name);
    }
}
