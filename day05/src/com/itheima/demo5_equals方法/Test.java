package com.itheima.demo5_equals方法;

import java.util.Objects;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 10:19
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@Override
    public boolean equals(Object obj) {
        // 自定义比较规则
        Person p = (Person) obj;
        return this.age == p.age && this.name.equals(p.name);
    }*/

    // 快捷键重写equals方法  alt+insert-->equals and hashCode
    @Override
    public boolean equals(Object o) {
        // 如果2个对象的地址值相同,就直接返回true,结束方法
        if (this == o) return true;
        // 如果传入的对象为null,就直接返回false,结束方法
        // 如果2个对象的类型不一致,就直接返回false,结束方法
        if (o == null || this.getClass() != o.getClass()) return false;
        // 来到这里,说明要比较的2个对象地址值不同,并且一定是Person类型
        Person person = (Person) o;// 向下转型
        //  比较所有属性是否相同
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
public class Test {
    public static void main(String[] args) {
        /*
            Object类的equals方法:
                public boolean equals(Object obj)：指示其他某个对象是否与此对象“相等”。
                源码:
                    public boolean equals(Object obj) {
                        return (this == obj);
                    }
                特点:
                    1.Object类的equals()方法默认比较的是2个对象的地址值是否相等(==比较)
                    2.由于java中所有类都是继承Object类,所以如果类中没有重写equals方法,默认就是地址值比较
                    3.如果希望进行对象的内容比较，即所有或指定的部分成员变量相同就判定两个对象相同，则可以重写equals方法
         */
        // 创建Object类对象
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);// false
        System.out.println(obj1.equals(obj2));// false  执行代码:obj1 == obj2

        System.out.println("======================");
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        // 在开发中,往往认为p1和p2是2个相同的对象,因为所有的属性值相同

        // Person类没有重写equals方法
        // 比较p1和p2是否相等
        //System.out.println(p1==p2);// false  比较2个对象的地址值
        //System.out.println(p1.equals(p2));// false  执行代码: p1 == p2

        // Person类重写equals方法
        // 比较p1和p2是否相等
        System.out.println(p1==p2);// false  比较2个对象的地址值
        System.out.println(p1.equals(p2));// true

        System.out.println(p1.equals(obj1));// false
        Person p3 = new Person(null,18);
        System.out.println(p3.equals(p1));// false
    }
}
