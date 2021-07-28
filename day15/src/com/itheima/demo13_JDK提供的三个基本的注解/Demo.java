package com.itheima.demo13_JDK提供的三个基本的注解;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 12:09
 */
@SuppressWarnings("all")
class Fu{
    public void show(){

    }
}
class Zi extends Fu{
    @Override
    public void show(){

    }
}
public class Demo {
    public static void main(String[] args) {
        /*
            JDK提供的三个基本的注解:
                	@Override:描述方法的重写.
                    @SuppressWarnings:压制\忽略警告.
                    @Deprecated:标记过时
         */
        @SuppressWarnings("all")
        int num;
    }

    @Deprecated
    public static void method1(){

    }

    public static void method2(){

    }
}
