package com.itheima.demo6_方法重写;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 10:21
 */
class Fu{
    public void method(){
        System.out.println("Fu method");
    }
}
class Zi extends Fu{

    @Override
    public void method() {
        System.out.println("Zi method");
    }

    public void show(){
        System.out.println("Zi show");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            方法重写:
                方法重写 ：子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），
                          会出现覆盖效果，也称为重写或者复写。声明不变，重新实现。
                注意事项:
                    1.一定要是父子类关系
                    2.子类中重写的方法返回值类型,方法名,参数列表一定要和父类一模一样
                    3.子类中重写的方法可以使用@Override注解进行标识,如果不是重写的方法使用@Override注解标识就会报错
                       建议开发中重写的方法使用@Override注解标识,这样可以提高代码的可读性
                    4.子类重写父类的方法的访问权限不能低于父类的访问权限
                        访问权限: public >  protected  >  默认(空)   >  private
         */
        Zi zi = new Zi();
        zi.method();
    }
}
