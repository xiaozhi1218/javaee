package com.itheima.demo9_Throwable获取异常信息的方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 14:47
 */
public class Test {
    public static void main(String[] args) {
        /*
            Throwable获取异常信息的方法:
            - public String getMessage():获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
            - public String toString():获取异常的类型和异常描述信息(不用)。
            - public void printStackTrace():打印异常的跟踪栈信息并输出到控制台。
         */
        System.out.println("开始");

        try {
            System.out.println(1/0);// 报异常,产生一个异常对象

        }catch (ArithmeticException e){
            /*System.out.println("出现了异常");
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.toString());*/
            e.printStackTrace();

        }

        System.out.println("结束");
    }
}
