package com.itheima.demo20_代理模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 16:28
 */
public class WangPo implements Happy {

    JinLian jl;

    public WangPo(JinLian jl) {
        this.jl = jl;
    }

    @Override
    public void happy() {
        System.out.println("王婆以做头发的名义把金莲和西门约到房间...");
        jl.happy();
        System.out.println("王婆打扫战场...");
    }
}
