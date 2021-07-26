package com.itheima.demo10_finally代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 15:09
 */
public class Test {
    public static void main(String[] args) {
        /*
            finally 代码块:
                概述:在finally代码块中存放的代码都是一定会被执行的
                格式:
                    try{
                        可能会出现异常的代码

                    }catch(异常的类型 变量名){
                        处理异常的代码或者打印异常的信息
                    }finally{
                        无论异常是否发生,都会执行这里的代码(正常情况,都会执行finally中的代码,一般用来释放资源)
                    }

                执行步骤:
                 1.首先执行try中的代码,如果try中的代码出现了异常,那么就直接执行catch()里面的代码,执行完后会执行finally中的代码,然后程序继续往下执行
                 2.如果try中的代码没有出现异常,那么就不会执行catch()里面的代码,但是还是会执行finally中的代码,然后程序继续往下执行
         */
        System.out.println("开始");
        /*try {
            System.out.println(1/0);
        }catch (ArithmeticException e){
            System.out.println("catch 出现了异常");
            return;
            //System.exit(0);
        }finally {
            System.out.println("finally 无论是否发生异常都会执行");
        }*/

        System.out.println("================================");
        try {
            System.out.println(1/1);// 1
            return;
        }catch (ArithmeticException e){
            System.out.println("catch 出现了异常");
        }finally {
            System.out.println("finally 无论是否发生异常都会执行");
        }
        System.out.println("结束");
    }
}
