package com.itheima.demo4_Junit断言;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 8:59
 */
public class Demo {

    @Test
    public void show(){
        int sum = sum(10,20);
        // 断言:预先判断某个条件一定成立，如果条件不成立，则直接报错。 使用Assert类中的assertEquals()方法
        /*
            第一个参数:期望的值
            第二个参数:实际的值
         */
        Assert.assertEquals(30,sum);
        System.out.println(sum);
    }


    /**
     * 求和
     * @param num1
     * @param num2
     */
    public int sum(int num1,int num2){
        return num1 + num2;
    }
}
