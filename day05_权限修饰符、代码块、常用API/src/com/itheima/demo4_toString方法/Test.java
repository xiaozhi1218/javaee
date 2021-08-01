package com.itheima.demo4_toString方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 10:07
 */
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@Override
    public String toString() {
        // 自定义返回的字符串内容格式
        return name+","+age;
    }*/

    @Override
    public String toString() {
        // 使用快捷键生成默认格式(alt+insert)
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            Object类的toString方法:
                public String toString()：返回该对象的字符串表示
                特点:
                    1.toString方法返回的字符串内容格式为: 类的全路径+@+十六进制数的地址值
                    2.直接打印对象名,其实就是打印对象调用toString方法返回的字符串内容
                问题: 如果打印对象的时候,不希望打印的是地址值这种形式的字符串,那么应该怎么办?
                解决: 重写toString方法---->可以自定义返回的字符串内容格式,也可以使用快捷键生成默认格式(alt+insert 推荐)
         */
        // 创建Object对象
        Object obj = new Object();
        System.out.println(obj.toString());// java.lang.Object@50cbc42f
        System.out.println(obj);// java.lang.Object@50cbc42f
        // 结论: 直接打印对象名,其实就是打印对象调用toString方法返回的字符串内容

        System.out.println("====================================");
        // Person类没有重写toString方法
       /* // 创建Person对象
        Person p1 = new Person("张三",18);
        System.out.println(p1);// com.itheima.demo4_toString方法.Person@282ba1e
        // p1调用toString方法,因为java中所有的类都继承了Object类
        System.out.println(p1.toString());// com.itheima.demo4_toString方法.Person@282ba1e*/

       // Person类重写toString方法
        // 创建Person对象
        Person p1 = new Person("张三",18);
        System.out.println(p1);// Person{name='张三', age=18}
        // p1调用toString方法,因为java中所有的类都继承了Object类
        System.out.println(p1.toString());// Person{name='张三', age=18}
    }
}
