package com.itheima.demo4_枚举;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 9:46
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            枚举
                概述:枚举是一种引用数据类型,用来表示固定值的一种数据类型
                格式:
                    public enum 枚举名{
                        枚举值,枚举值,...
                    }
                使用:
                    给枚举类型的变量赋值:  枚举名 变量名 = 枚举名.枚举值;
                    获取枚举值:枚举名.枚举值
         */
        // 定义一个Sex枚举类型的变量,并赋值
        Sex s1 = Sex.boy;
        Sex s2 = Sex.girl;
        Sex s3 = Sex.yao;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
