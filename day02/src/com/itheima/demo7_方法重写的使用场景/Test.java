package com.itheima.demo7_方法重写的使用场景;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 10:38
 */
class Fu{
    public void sport(){
        System.out.println("Fu 运动的方式跑步");
    }

    public void run(){
        System.out.println("Fu 第1圈");
        System.out.println("Fu 第2圈");
        System.out.println("Fu 第3圈");
    }
}

class Zi extends Fu{
    // 子类方法的实现和父类方法的实现完全不同
    @Override
    public void sport() {
        System.out.println("Zi 运动的方式游泳");
    }

    // 子类方法的实现要保留父类方法的功能,但要在父类功能的基础之上额外增加功能
    @Override
    public void run() {
        // 让父类的方法执行=====复制父类的代码过来
        super.run();// 调用父类的方法

        // 额外增加的代码
        System.out.println("Zi 第4圈");
        System.out.println("Zi 第5圈");
        System.out.println("Zi 第6圈");
        System.out.println("Zi 第7圈");
        System.out.println("Zi 第8圈");
        System.out.println("Zi 第9圈");
        System.out.println("Zi 第10圈");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            方法重写的使用场景:
                当父类的方法无法满足子类的需求的时候,子类就会去重写父类的方法
         */
        // 创建子类对象
        Zi zi = new Zi();
        // 调用运动的方法
        zi.sport();
        // 调用跑步的方法
        zi.run();


    }
}
