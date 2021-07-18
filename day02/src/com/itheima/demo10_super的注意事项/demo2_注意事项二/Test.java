package com.itheima.demo10_super的注意事项.demo2_注意事项二;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 12:03
 */
class Fu{
    private String name;
    private int age;

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Fu 有参方法");
    }

    public Fu() {
        System.out.println("Fu 空参方法");
    }
}

class Zi extends Fu{
    public Zi(){
        // 默认:super();
        System.out.println("Zi 空参方法");
    }

    public Zi(String name,int age){
        // 默认:super();
        super(name,age);
        System.out.println("Zi 有参构造方法");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
              子类的构造方法默认会调用父类的空参构造方法
              如果父类中的没有空参构造方法,只定义了有参构造方法,会编译报错
         */
        Zi zi1 = new Zi();
        System.out.println("==========================================");
        Zi zi2 = new Zi("热巴",18);
    }
}
