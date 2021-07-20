package com.itheima.demo16_ArrayList类构造方法;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 15:48
 */
class Student{

}
public class Test {
    public static void main(String[] args) {
        /*
            ArrayList类构造方法:
                    public ArrayList() 构造一个初始容量为 10 的空列表。

                    基本数据类型            对应            包装类类型
                    byte                                    Byte
                    short                                   Short
                    int                                     Integer
                    long                                    Long
                    float                                   Float
                    double                                  Double
                    boolean                                 Boolean
                    char                                    Character
         */
        // 创建ArrayList集合对象,限制集合中元素的类型为String类型
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();

        // 创建ArrayList集合对象,限制集合中元素的类型为Student类型
        ArrayList<Student> list3 = new ArrayList<>();

        //  创建ArrayList集合对象,限制集合中元素的类型为int类型
        //ArrayList<int> list4 = new ArrayList<int>();// 编译报错
        //  集合中存储基本数据类型
        // 创建ArrayList集合对象,限制集合中元素的类型为Integer类型
        ArrayList<Integer> list5 = new ArrayList<>();// 存储int类型的数据

        // 创建ArrayList集合对象,不限制集合中元素的类型
        ArrayList list6 = new ArrayList();// 存储任意类型的对象

    }
}
