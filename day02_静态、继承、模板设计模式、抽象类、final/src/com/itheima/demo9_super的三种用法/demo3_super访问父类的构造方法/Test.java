package com.itheima.demo9_super的三种用法.demo3_super访问父类的构造方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 11:35
 */
class Fu {
    private String name;
    private int age;

    public Fu() {
        System.out.println("Fu 空参构造");
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Fu 有参构造方法");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Zi extends Fu {
    public Zi() {
        // 访问父类的空参构造方法
        //super();
        System.out.println("Zi 空参构造方法");
    }

    public Zi(String name, int age) {
       //super(name,age);
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            super访问父类的构造方法:
                空参构造: super();
                有参构造: super(实参);
                    注意:
                        1.只能在子类的构造方法中访问父类的构造方法
                        2.在子类的构造方法中访问父类的构造方法必须放在第一行
                        3.在子类的构造方法中访问父类的构造方法就是为了给从父类继承过来的属性进行初始化
                        4.子类的构造方法默认会调用父类的空参构造方法
         */
        //Zi zi = new Zi();

        Zi zi = new Zi("热巴", 18);
        //System.out.println(zi.getName()+","+zi.getAge());
    }
}
