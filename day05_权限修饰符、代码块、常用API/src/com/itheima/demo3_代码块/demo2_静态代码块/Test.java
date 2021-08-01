package com.itheima.demo3_代码块.demo2_静态代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:46
 */
public class Test {
    /*
         静态代码块:
            格式: static{}
            位置: 类中,方法外
            执行: 随着类的加载而执行,并且只执行一次
            使用场景: 例如读取配置文件中的数据,加载驱动,也就是说程序中只需要执行一次的代码就可以放在静态代码块中

            执行优先级:  静态代码块 >  构造代码块  >  构造方法
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

    }
}
