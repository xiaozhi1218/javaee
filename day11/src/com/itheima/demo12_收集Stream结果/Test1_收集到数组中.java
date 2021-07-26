package com.itheima.demo12_收集Stream结果;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 17:12
 */
public class Test1_收集到数组中 {
    public static void main(String[] args) {
        /*
            收集到数组中:
                Stream流的一个方法:
                    Object[] toArray() 返回一个包含此流的元素的数组。
         */
        // 传统方式操作集合:
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张杰");
        list.add("张三丰");
        // 需求:过滤过滤出姓张的并且长度为3的元素
        Stream<String> stream = list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3);

        // 需求:把stream流中的元素收集到数组中
        Object[] arr = stream.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
