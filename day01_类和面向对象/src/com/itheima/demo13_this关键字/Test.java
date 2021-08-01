package com.itheima.demo13_this关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 15:36
 */
public class Test {
    public static void main(String[] args) {
        /*
            问题1:set方法的形参名不能起到知名达意(不符合标识符命名规范)
            解决1:把形参名修改成符合命名规范
            问题2:set方法的形参名改为符合命名规范后,发现set方法无法给成员变量赋值
            解决2:使用this关键字来区别同名的成员变量和局部变量
                格式: this.成员变量名
                this表示谁: 哪个对象调用this所在的方法,this就表示哪个对象

           结论:
                1.如果成员方法中有与成员变量同名的局部变量,那么就需要使用this关键字来区分
                2.如果成员方法中没有与成员变量同名的局部变量,那么就不需要使用this关键字来区分(直接使用成员变量即可)
         */
        // 创建Student对象
        Student stu1 = new Student();

        // 访问成员变量
        // 隐藏属性后的方式
        stu1.setName("冰冰");
        stu1.setAge(-18);
        System.out.println(stu1.getName()+","+stu1.getAge());// 冰冰,-1

        Student stu2 = new Student();
        stu2.setName("空空");
        System.out.println(stu2.getName()+","+stu2.getAge());// 空空,0

    }
}
