package com.itheima.demo9_HashMap存储自定义类型;

import java.util.HashMap;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 15:18
 */
public class Test {
    public static void main(String[] args) {
        /*
            HashMap存储自定义类型:保证键唯一,就得重写键的hashCode和equals方法
                特点: 键值对存取无序,键唯一
         */
        // 创建HashMap集合,限制键的类型为Student,值的类型为String
        HashMap<Student, String> map = new HashMap<>();

        // 往集合中添加键值对
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 17);
        Student stu4 = new Student("赵六", 20);
        Student stu5 = new Student("张三", 18);

        map.put(stu1, "深圳");
        map.put(stu2, "北京");
        map.put(stu3, "上海");
        map.put(stu4, "广州");
        map.put(stu5, "宝安");
        System.out.println(map);
        System.out.println(map.size());
    }
}
