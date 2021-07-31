package com.itheima.demo9_ParameterMetaData;

import Utils.C3P0Utils;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 16:11
 */
public class Test {
    public static void main(String[] args)throws Exception {
        /*
             ParameterMetaData类:
                概述:表示参数元数据对象,可以用来获取sql语句参数的元数据
                获取参数元数据对象: 使用预编译sql语句对象调用方法获得
                      public ParameterMetaData  getParameterMetaData ();

                根据参数元数据对象获取参数的元数据:使用ParameterMetaData类的方法
                     - int getParameterCount(); 获得参数个数
                    - int getParameterType(int param) 获取指定参数的SQL类型。 (注:MySQL不支持获取参数类型)
         */
        // 1.获得连接
        Connection connection = C3P0Utils.getConnection();

        // 2.创建预编译sql语句对象
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        // 需求:获取sql语句参数的元数据
        // 3.获得参数元数据对象
        ParameterMetaData pmd = ps.getParameterMetaData();

        // 4.根据参数元数据对象获取参数的元数据
        int count = pmd.getParameterCount();// 获取参数的个数元数据
        System.out.println("参数的个数:"+count);// 2

        // 获取参数类型的元数据
        //int parameterType = pmd.getParameterType(1);// 运行报错
        //System.out.println(parameterType);

        //String parameterTypeName = pmd.getParameterTypeName(1); 运行报错

    }
}
