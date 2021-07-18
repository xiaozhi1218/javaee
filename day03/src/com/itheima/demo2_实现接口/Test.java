package com.itheima.demo2_实现接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:19
 */
interface IA{
    void methodA();
}
interface IB{
    void methodB();
}
// 实现接口
abstract class Imp1 implements IA,IB{

}
 class Imp2 implements IA,IB{

     @Override
     public void methodA() {

     }

     @Override
     public void methodB() {

     }
 }

// 继承的同时,又实现接口
class Fu{}
abstract class Imp3 extends Fu implements IA,IB{

}
class Imp4 extends Fu implements IA,IB{

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}

public class Test {
    public static void main(String[] args) {
        /*
            实现接口:
                实现概述:类和接口之间的关系就叫做实现关系,实现接口的类叫做实现类,实现类似于继承
                实现格式:
                    1.实现类可以实现一个接口,也可以同时实现多个接口
                        public class 实现类 implements 接口名1,接口名2,...{

                        }
                        注意:类实现接口后，必须重写接口中所有的抽象方法，否则该类必须是一个“抽象类”。

                    2.实现类继承的同时,又实现接口
                        public class 实现类 extends 父类名 implements 接口名1,接口名2,...{

                        }
         */
    }
}
