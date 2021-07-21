package com.itheima.demo9_定义和使用含有泛型的接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:10
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义含有泛型的接口:
                public interface 接口名<泛型变量>{

                }

                泛型变量:任意字母,一般可以使用E

            使用含有泛型的接口: 确定接口泛型的具体数据类型
                1.通过实现类的方式确定接口泛型的具体数据类型
                    public class 类名 implements 接口名<具体的数据类型>{

                    }

                2.实现类实现接口的时候不确定接口泛型的具体数据类型,
                  而是创建实现类对象的时候确定接口泛型的具体数据类型
                   public class 类名<泛型变量> implements 接口名<泛型变量>{

                    }
         */
        // 创建实现类对象的时候确定接口泛型的具体数据类型
        Imp2<String> imp1 = new Imp2<>();
        imp1.method1("itheima");
        String s1 = imp1.method2("itcast");
        System.out.println(s1);// itcast

        System.out.println("==========================");
        Imp2<Integer> imp2 = new Imp2<>();
        imp2.method1(100);
        Integer i = imp2.method2(100);
        System.out.println(i);// 100

    }
}
