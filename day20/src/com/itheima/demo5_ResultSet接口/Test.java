package com.itheima.demo5_ResultSet接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 10:32
 */
public class Test {
    public static void main(String[] args) {
        /*
            ResultSet接口:
                概述:封装结果集,查询结果表的对象;
                    提供一个游标，默认游标指向结果集第一行之前。
                    调用一次next()，游标向下移动一行。
                    提供一些get方法
                api:
                    boolean next();将光标从当前位置向下移动一行
                    int getInt(String colLabel)以int形式获取ResultSet结果集当前行指定列名值
                    float getFloat(String colLabel)以float形式获取ResultSet结果集当前行指定列名值
                    String getString(String colLabel)以String形式获取ResultSet结果集当前行指定列名值
                    Date getDate(String columnName);以Date形式获取ResultSet结果集当前行指定列名值

                    Object getObject(String columnName)以Object形式获取ResultSet结果集当前行指定列名值
                注意:查询的数据记得封装
                    一个程序对应一个数据库
                    一个类对应一张表
                    一个对象对应一条记录
         */
    }
}
