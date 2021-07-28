package com.itheima.demo17_元注解;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 15:12
 */
@MyAnnotation1
public class Test {
    //@MyAnnotation1  // 编译报错
    int num;

    @MyAnnotation1
    public static void main(String[] args) {
        /*
            元注解:
                概述:定义在注解上的注解
                @Target:表示该注解作用在什么上面(位置),默认注解可以在任何位置. 值为:ElementType的枚举值
                	METHOD:方法
		            TYPE:类 接口
		            FIELD:字段
		            CONSTRUCTOR:构造方法声明
                    LOCAL_VARIABLE: 局部变量

                @Retention:定义该注解保留到那个代码阶段, 值为:RetentionPolicy类型,==默认只在源码阶段保留==
                    SOURCE:只在源码上保留(默认)
		            CLASS:在源码和字节码上保留
		            RUNTIME:在所有的阶段都保留

                .java (源码阶段) ----编译---> .class(字节码阶段) ----加载内存--> 运行(RUNTIME)
         */
        //@MyAnnotation1 // 编译报错
        String str;
    }
}
