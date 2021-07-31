package com.itheima.demo10_ResultSetMetaData类;

import Utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 16:20
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
             ResultSetMetaData类:
                概述:表示结果集的元数据对象,用来获取结果集的元数据
                使用:
                    获取结果集元数据对象: 使用ResultSet结果集的方法
                        public ResultSetMetaData getMetaData();

                    根据结果集元数据对象获取结果集的元数据:使用ResultSetMetaData的方法
                        - getColumnCount(); 获取结果集中列项目的个数
                        - getColumnName(int column); 获得数据指定列的列名
                        - getColumnTypeName();获取指定列的SQL类型
                        - getColumnClassName();获取指定列SQL类型对应于Java的类型
         */
        // 1.获得连接
        Connection connection = C3P0Utils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "select * from user";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 3.执行sql语句,处理结果
        ResultSet resultSet = ps.executeQuery();// 结果集对象

        // 需求:获取结果集中的元数据
        // 4.获取结果集元数据对象
        ResultSetMetaData metaData = resultSet.getMetaData();// 结果集元数据对象

        // 1.获取结果集中列的个数
        int count = metaData.getColumnCount();
        System.out.println("结果集列的个数:"+count);// 结果集元数据   4

        // 2.获取结果集中列的名字
        for (int i = 1; i <= count; i++) {
            System.out.println("列名:"+metaData.getColumnName(i));
        }
        System.out.println("==============================");

        // 3.获取结果集中列的类型(sql)
        for (int i = 1; i <= count; i++) {
            System.out.println("列的类型:"+metaData.getColumnTypeName(i));
        }
        System.out.println("==============================");

        // 4.获取结果集中列的类型(java)
        for (int i = 1; i <= count; i++) {
            System.out.println("列的类型:"+metaData.getColumnClassName(i));
        }


    }
}
