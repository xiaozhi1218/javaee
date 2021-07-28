package com.itheima.demo23_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:14
 */
class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Test1_构造方法引用 {
    public static void main(String[] args) {
        /*
            构造方法的引用: 类名::new

            方法引用使用步骤:
                1.分析Lambda表达式大括号中的代码是否就是调用某个方法
                2.如果是,就使用方法引用替换Lambda表达式,如果不是,就不能替换
                3.分析引用的方法的类型
                4.确定方法的类型后,根据该方法引用的格式来引用即可
         */
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("杨紫");
        list.add("迪丽热巴");
        list.add("陈钰琪");

        // 需求: 把集合中的元素转换为Person对象,打印输出
        // 获取流,映射,forEach
        //list.stream().map((String name)->{return new Person(name);}).forEach((Person p)->{System.out.println(p);});

        // 以上map方法中的Lambda表达式大括号中的代码就是调用Person类的构造方法,所以符合方法引用替换Lambda表达式
        list.stream().map(Person::new).forEach((Person p)->{System.out.println(p);});

    }
}
