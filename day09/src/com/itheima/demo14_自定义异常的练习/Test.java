package com.itheima.demo14_自定义异常的练习;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:10
 */
public class Test {
    public static void main(String[] args) {
        // 需求:我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
        // 1.定义一个数组,存储一些已知用户名
        String[] names = {"jack", "rose", "jim", "tom"};

        // 2.用户输入要注册的用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个用户名:");
        String name = sc.next();

        // 3.循环遍历数组
        for (String s : names) {
            // 4.在循环中,判断用户输入的用户名和已知的用户名是否相同
            if (s.equals(name)) {
                // 5.如果相同,就抛出异常对象
                try {
                    throw new RegisterException("亲，该用户名已经被注册。");
                } catch (RegisterException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }

        // 6.如果不相同,就显示提示信息
        System.out.println("亲,恭喜您注册成功!");
    }
}
