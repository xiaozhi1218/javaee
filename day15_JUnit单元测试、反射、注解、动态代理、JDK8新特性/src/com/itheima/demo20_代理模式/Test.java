package com.itheima.demo20_代理模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 16:27
 */
public class Test {
    public static void main(String[] args) {
        // 创建金莲被代理对象
        JinLian jl = new JinLian();
        // 创建王婆代理对象
        WangPo wp = new WangPo(jl);
        wp.happy();

    }
}
