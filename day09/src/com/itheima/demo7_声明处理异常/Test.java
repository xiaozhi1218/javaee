package com.itheima.demo7_声明处理异常;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 11:58
 */
public class Test {
    // 使用throws关键字将异常标识出来, 表示当前方法不处理异常，而是提醒调用者来处理
    public static void main(String[] args) throws ParseException {
        /*
            处理异常的目的: 为了让程序可以继续往下执行
            声明处理异常:
                概述:使用throws关键字将问题标识出来, 表示当前方法不处理异常，而是提醒给调用者,
                    让调用者来处理....最终会到虚拟机,虚拟机直接结束程序,打印异常信息。

                格式:
                    修饰符 返回值类型 方法名(形参列表) throws 异常类名1,异常类名2…{  // 可以抛出一个,也可以多个

                    }
                特点: 声明处理异常,处理完后,如果程序运行的时候出现异常,程序还是无法继续往下执行
                使用场景:  声明处理异常一般处理运行的时候不会出现异常的编译异常

         */
        //method1();

        // 举例:声明处理异常一般处理运行的时候不会出现异常的编译异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1999-10-10");
        System.out.println(date);

        // 举例:一般用来处理编译异常,让程序通过编译,但程序运行的时候出现异常,程序还是无法继续往下执行
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1999年10月10日");
        System.out.println(date);*/

        System.out.println("结束");

    }


    // 一次声明处理一个异常
    // 使用throws关键字将异常标识出来, 表示当前方法不处理异常，而是提醒调用者来处理
    public static void method1() throws ParseException{
        // 产生一个异常对象
        throw new ParseException("解析异常",1);
    }

    // 一次声明处理多个异常
    public static void method2(int num) throws ParseException,FileNotFoundException{
        // 产生一个异常对象
        if (num == 1){
            throw new ParseException("解析异常",1);
        }else{
            throw new FileNotFoundException("文件找不到异常");
        }
    }

}
