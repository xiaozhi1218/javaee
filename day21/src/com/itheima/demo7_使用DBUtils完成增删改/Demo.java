package com.itheima.demo7_使用DBUtils完成增删改;

import Utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 14:58
 */
public class Demo {
    @Test
    public void insert() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        // 2.调用update方法
        int rows = qr.update("insert into user values(null,?,?,?)", "ww", "123456", "老王");
        System.out.println("受影响的行数:"+rows);
    }

    @Test
    public void update() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        // 2.调用update方法
        int rows = qr.update("update user set password = ? where id = ?","abcdef",2);
        System.out.println("受影响的行数:"+rows);
    }

    @Test
    public void delete() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用update方法
        int rows = qr.update("delete from user where id = ?",4);
        System.out.println("受影响的行数:"+rows);
    }


}
