package com.itheima.demo18_内部类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 15:40
 */
// 外部类
public class Body {

    public void methodW1(){
        // 访问内部类的成员
        //Body.Heart bh = new Body().new Heart();
        Heart bh = new Heart();
        System.out.println(bh.numN);// 10
        bh.methodN1();// 内部类的成员方法 methodN1
    }

    // 成员变量
    private int numW = 100;

    // 成员方法
    private void methodW2(){
        System.out.println("外部类的成员方法 methodW2");
    }


    // 内部类
    public class Heart{
        // 成员变量
        int numN = 10;

        // 成员方法
        public void methodN1(){
            System.out.println("内部类的成员方法 methodN1");
        }

        public void methodN2(){
            // 访问外部类的成员
            System.out.println(numW);
            methodW2();
        }
    }


}
