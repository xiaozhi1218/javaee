package com.itheima.dao;

import com.itheima.pojo.User;
import com.itheima.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 包名:com.itheima.dao
 *
 * @author Leevi
 * 日期2020-10-16  14:39
 */
public class UserDao {
    private QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
    public List<User> findAll() throws SQLException {
        String sql = "select * from user";
        return queryRunner.query(sql,new BeanListHandler<>(User.class));
    }
}
