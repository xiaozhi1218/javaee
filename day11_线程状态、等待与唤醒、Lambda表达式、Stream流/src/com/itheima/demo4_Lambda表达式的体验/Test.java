package com.itheima.demo4_Lambda表达式的体验;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 11:42
 */
public class Test {
    public static void main(String[] args) {
        /*
            Lambda表达式的体验:
                 - 实现Runnable接口的方式创建线程执行任务
                    1.创建实现类实现Runnable接口
                    2.在实现类中重写run方法,把线程需要执行的任务代码放入run方法中
                    3.创建实现类对象
                    4.创建Thread线程对象,并传入实现类对象
                    5.调用start方法启动线程,执行任务
                 以上5步一步也不能少,而前面三步就是为了创建一个任务对象,可以把线程任务传入线程中执行,所以必须依靠任务对象来传递任务

                为了简化创建实现类---匿名内部类的方式
                - 匿名内部类方式创建线程执行任务
                    1.创建Runnable的匿名内部类,重写run方法,把线程需要执行的任务代码放入run方法中
                    2.创建Thread线程对象,并传入匿名内部类
                    3.调用start方法启动线程,执行任务
                 这种方式还是得依靠Runnable任务对象来传递任务代码给线程执行
         */
        // 实现Runnable接口的方式创建线程执行任务
        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();

        //- 匿名内部类方式创建线程执行任务
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的方式 任务代码");
            }
        }).start();

        // 以上两种方式都得依靠Runnable实现类对象来传递任务代码给线程执行
        // 思考: 是否可以不需要依靠Runnable实现类对象来传递任务代码??
        // 解决: 可以的-->使用函数式编程(Lambda表达式)

        //- Lambda方式创建线程执行任务
        new Thread(() -> {
            System.out.println("Lambda的方式 任务代码");
        }).start();
        new Thread(() -> System.out.println("Lambda的方式 任务代码")).start();
    }
}
