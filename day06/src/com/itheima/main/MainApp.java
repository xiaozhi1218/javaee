package com.itheima.main;


import com.itheima.domain.Person;
import com.itheima.domain.Student;
import com.itheima.domain.Teacher;
import com.itheima.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/12 10:07
 */
public class MainApp {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 创建ArrayList集合,限制集合元素的类型为Student
        ArrayList<Student> stuList = new ArrayList<>();
        // 创建ArrayList集合,限制集合元素的类型为Teacher
        ArrayList<Teacher> teaList = new ArrayList<>();

        // 循环生成主菜单
        while (true) {
            System.out.println("=================================================");
            System.out.println("1.学生信息管理系统  2.教师信息管理系统  3.系统退出");
            System.out.println();
            System.out.println("请输入功能序号:");
            int op = sc.nextInt();
            // 判断用户选择的功能序号
            switch (op) {
                case 1:
                    // 进入学生信息管理系统
                    studentManage(stuList, sc);
                    break;
                case 2:
                    // 进入教师信息管理系统
                    teacherManage(teaList, sc);
                    break;
                case 3:
                    System.out.println("谢谢您,欢迎下次再来!");
                    System.exit(0);
                default:
                    System.out.println("您输入有误,请重新输入!");
                    break;
            }

        }
    }

    /**
     * 学生信息管理
     *
     * @param list
     * @param sc
     */
    public static void studentManage(ArrayList<Student> list, Scanner sc) {
        // 循环生成二级菜单
        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("【学生信息管理】：");
            System.out.println("1.添加学生  2.查询学生  3.修改学生  4.删除学生  5.返回");
            System.out.println();
            System.out.println("请输入功能序号：");
            int op = sc.nextInt();
            // 判断
            switch (op) {
                case 1:
                    // 添加学生
                    addStudent(list, sc);
                    break;
                case 2:
                    // 查询学生
                    selectStudent(list);
                    break;
                case 3:
                    // 修改学生
                    updateStudent(list, sc);
                    break;
                case 4:
                    // 删除学生
                    deleteStudent(list, sc);
                    break;
                case 5:
                    // 返回一级菜单
                    return;
                default:
                    System.out.println("您输入有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 添加学生
     *
     * @param list
     * @param sc
     */
    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        // 1.输入学生信息
        System.out.println("请输入姓名:");
        String name = sc.next();

        System.out.println("请输入性别:");
        String sex = sc.next();

        System.out.println("请输入出生日期:");
        String birthday = sc.next();

        // 2.创建学生对象
        Student stu = new Student();

        // 3.把输入的信息封装到学生对象上
        //Utils.sid++;
        stu.setId(Utils.sid);
        stu.setName(name);
        stu.setSex(sex);
        stu.setBirthday(birthday);
        stu.setAge(Utils.birthdayToAge(birthday));

        // 4.把学生对象添加到集合中
        list.add(stu);

        System.out.println("【添加成功！】");
    }

    /**
     * 查询学生
     *
     * @param list
     */
    public static void selectStudent(ArrayList<Student> list) {
        // 1.判断集合中是否有学生对象
        // 2.如果没有学生对象,就显示提示信息
        if (list.size() == 0) {
            System.out.println("【没有数据！】");
            return;
        }
        // 3.如果有学生对象,把集合中所有的元素按照指定格式打印输出
        Utils.printArrayList(list);
    }

    /**
     * 修改学生
     *
     * @param list
     * @param sc
     */
    public static void updateStudent(ArrayList<Student> list, Scanner sc) {
        // 1.输入要修改的学生编号
        System.out.println("请输入要修改的学生编号：");
        int sid = sc.nextInt();

        // 2.判断要修改的学生编号是否存在
        for (int i = 0; i < list.size(); i++) {
            // 2.1 获取遍历出来的学生对象
            Student stu = list.get(i);
            // 2.2 判断遍历出来的学生对象的id和输入的id是否相同
            if (stu.getId() == sid) {
                // 4.如果存在，就修改（保留原有信息的功能）
                System.out.println("您要修改的学生信息是：");
                Utils.printPerson(stu);

                System.out.println("请输入新的姓名（保留原值输入0）：");
                String name = sc.next();

                System.out.println("请输入新的性别（保留原值输入0）：");
                String sex = sc.next();

                System.out.println("请输入新的出生日期，格式为yyyy-MM-dd（保留原值输入0）：");
                String birthday = sc.next();

                // 判断输入的信息
                if (!"0".equals(name)) {
                    stu.setName(name);
                }

                if (!"0".equals(sex)) {
                    stu.setSex(sex);
                }

                if (!"0".equals(birthday)) {
                    stu.setBirthday(birthday);
                    // 修改年龄
                    stu.setAge(Utils.birthdayToAge(birthday));
                }

                // 修改完了,就结束方法
                System.out.println("【成功】学生信息修改成功！");
                return;
            }
        }


        // 3.来到这里,说明要修改的学生编号一定不存在，就显示提示信息，结束方法
        System.out.println("【错误信息】：您要修改的学生编号" + sid + "不存在!");
    }

    /**
     * 删除学生
     *
     * @param list
     * @param sc
     */
    public static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        // 1.输入要删除的学生编号
        System.out.println("请输入要删除的学生编号：");
        int sid = sc.nextInt();

        // 2.判断要删除的学生编号是否存在
        for (int i = 0; i < list.size(); i++) {
            // 获取遍历出来的学生对象
            Student stu = list.get(i);
            // 判断遍历出来的学生对象的id和要修改的学生id是否相同
            if (stu.getId() == sid) {
                // 3.如果存在，就删除
                System.out.println("您要删除的学生信息是：");
                Utils.printPerson(stu);

                // 确认删除
                System.out.println("【确认】您确定要删除这条信息吗（y/n）:");
                String next = sc.next();

                // 判断用户输入
                if (next.equalsIgnoreCase("n")) {
                    // 如果输入的是n，就取消删除
                    System.out.println("【取消】删除操作已被取消");
                }
                if (next.equalsIgnoreCase("y")) {
                    // 如果输入的是y，就删除
                    list.remove(i);
                    System.out.println("【成功】删除成功！");
                }
                // 删除完了，直接结束方法
                return;
            }
        }
        // 4.如果不存在，就显示提示信息，结束方法
        System.out.println("【错误信息】：您要删除的学生编号" + sid + "不存在!");
    }

    /**
     * 教师信息管理
     *
     * @param teaList
     * @param sc
     */
    private static void teacherManage(ArrayList<Teacher> teaList, Scanner sc) {

    }


    private static void method03() {
        ArrayList<Student> stuList = new ArrayList<>();
        Student stu1 = new Student(1, "张三", "男", "1999-10-10", 20);
        Student stu2 = new Student(2, "张三", "男", "1999-10-10", 20);
        Student stu3 = new Student(3, "张三", "男", "1999-10-10", 20);
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        Utils.printArrayList(stuList);

        System.out.println("+==========================");
        ArrayList<Teacher> teaList = new ArrayList<>();
        Teacher tea1 = new Teacher(1, "张三", "男", "1999-10-10", 20);
        Teacher tea2 = new Teacher(2, "张三", "男", "1999-10-10", 20);
        Teacher tea3 = new Teacher(3, "张三", "男", "1999-10-10", 20);
        teaList.add(tea1);
        teaList.add(tea2);
        teaList.add(tea3);
        Utils.printArrayList(teaList);

        // 多态: 父类的引用指向子类的对象
        //ArrayList<Person> list = new ArrayList<Teacher>();// 编译报错
    }

    private static void method02() {
        Student stu = new Student(1, "张三", "男", "1999-10-10", 20);
        Teacher tea = new Teacher(1, "张三", "男", "1999-10-10", 20);
        //Utils.printPerson(stu);
        Utils.printPerson(tea);
    }

    private static void method01() {
        System.out.println(Utils.birthdayToAge("1999-10-10"));
        System.out.println(Utils.birthdayToAge("1999-04-04"));
        System.out.println(Utils.birthdayToAge("1999-09-10"));
        System.out.println(Utils.birthdayToAge("1999-09-13"));
        System.out.println(Utils.birthdayToAge("2000-10-09"));
        System.out.println(Utils.birthdayToAge("2999-09-13"));
        System.out.println(Utils.birthdayToAge(null));
    }
}
