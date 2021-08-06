package com.itheima.dao;

import com.itheima.pojo.User;
import com.itheima.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * 包名:com.itheima.dao
 *
 * @author Leevi
 * 日期2020-10-16  14:54
 */
public class UserDao {
    private QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());

    /**
     * 保存用户信息
     * @param user
     */
    public void saveUser(User user) throws SQLException {
        //3. 使用dbutils将user中的数据存储到表中
        String sql = "insert into user values (null,?,?,?,?,?,?,0)";
        queryRunner.update(sql,user.getUsername(),user.getPassword(),
                user.getAddress(),user.getNickname(),user.getGender(),user.getEmail());
    }

    public User findUser(String username, String password) throws SQLException {
        String sql = "select * from user where username=? and password=?";

        return queryRunner.query(sql,new BeanHandler<>(User.class),username,password);
    }
}
