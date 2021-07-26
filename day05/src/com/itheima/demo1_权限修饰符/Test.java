package com.itheima.demo1_权限修饰符;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:17
 */
public class Test {
    public static void main(String[] args) {
        /*
            权限修饰符:
                概述:在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限，
                    public: 公共
                    protected:受保护
                    空: 默认
                    private: 私有的

                不同权限修饰符的访问能力:
                                本类中         同包中         不同包的子类      不同包的无关类
                   public        √              √               √                   √
                   protected     √              √               √                   ×
                   空            √              √               ×                    ×
                   private       √              ×               ×                   ×

                访问权限大小:  public >  protected  >  空   >  private

                使用:
                    类:  public
                    成员变量: private
                    成员方法: public
                    构造方法: public \ private(单列设计模式)
         */
        // 同包: 访问AAA类中的4个method方法
        AAA a = new AAA();
        a.method1();
        a.method2();
        a.method3();
        //a.method4();// 编译报错,没有访问权限
    }
}
