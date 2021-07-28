package com.itheima.demo16_给注解属性赋值的注意事项;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 14:58
 */
@interface MyAnnotation1{
    int[] arr();
}

@interface MyAnnotation2{
    String value();
}

@interface MyAnnotation3{
    String[] value();
}

@interface MyAnnotation4{
    String[] value() default {"黑马程序","传智播客"};
    int num() default 10;
}


public class Test {
    public static void main(String[] args) {
        /*
            给注解属性赋值的注意事项:
                - 一旦注解有属性了,使用注解的时候,属性必须有值
                - 若属性类型是一维数组的时候,当数组的值只有一个的时候可以省略{}
                - 如果注解中只有一个属性,并且属性名为value,那么使用注解给注解属性赋值的时候,注解属性名value可以省略
                - 注解属性可以有默认值  格式:属性类型 属性名() default 默认值;

         */
    }

    //@MyAnnotation4
    //@MyAnnotation4(value={"itheima"},num=100)
    @MyAnnotation4(value="itheima",num=100)
    public void show4(){

    }

    //@MyAnnotation3(value={"itcast","itheima"})
    //@MyAnnotation3({"itcast","itheima"})
    //@MyAnnotation3(value={"itcast"})
    //@MyAnnotation3(value="itcast")
    @MyAnnotation3("itcast")
    public void show3(){

    }

    //如果注解中只有一个属性,并且属性名为value,那么使用注解给注解属性赋值的时候,注解属性名value可以省略
    //@MyAnnotation2(value="itheima")
    @MyAnnotation2("itheima")
    public void show2(){

    }

    // 若属性类型是一维数组的时候,当数组的值只有一个的时候可以省略{}
    //@MyAnnotation1(arr={100})
    @MyAnnotation1(arr=100)
    public void show1(){

    }
}
