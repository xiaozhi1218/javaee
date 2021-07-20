package com.itheima.demo5_练习用户登录案例;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 10:24
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求:已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
         */
        // 1.已知用户名和密码,定义2个字符串表示
        String username = "admin";
        String password = "123456";

        // 2.由于总共三次机会,循环次数确定,使用for循环来完成
        for (int i = 0; i < 3; i++) {
            // 3.在循环中,用户键盘录入用户名和密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name = sc.next();
            System.out.println("请输入密码:");
            String pwd = sc.next();

            // 4.在循环中,判断用户输入的用户名和密码和已知的用户名和密码是否相同
            if (username.equals(name) && password.equals(pwd)) {
                // 5.在循环中,如果相同,就登录成功,并结束循环
                System.out.println("恭喜您,登录成功!");
                break;
            } else {
                // i=0  2次机会
                // i=1  1次机会
                // i=2  您的账号已被锁定,请充钱解锁!
                // 5.在循环中,如果失败,就显示提示信息
                if (i == 2){
                    System.out.println("很遗憾,登录失败,您的账号已被锁定,请充钱解锁!");
                }else{
                    System.out.println("很遗憾,登录失败,您还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
