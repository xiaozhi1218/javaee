package com.itheima.demo11_TreeMap集合;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 15:30
 */
public class Test {
    public static void main(String[] args) {
        /*
            TreeMap集合: 键唯一,值可以重复,如果键重复了,值就覆盖,可以根据键对键值对进行排序
                public TreeMap()									根据键按照默认规则进行排序
                public TreeMap(Comparator<? super K> comparator) 	通过比较器指定规则排序
         */
        // 按照键的默认规则排序: ---->升序
        // 创建TreeMap集合,限制键的类型为Integer,值的类型为String
        TreeMap<Integer, String> map = new TreeMap<>();

        // 往map集合中添加键值对
        map.put(300, "深圳");
        map.put(100, "北京");
        map.put(200, "广州");
        map.put(500, "上海");
        map.put(400, "武汉");
        map.put(400, "深圳");
        System.out.println(map);

        System.out.println("+=================================");

        // 按照指定规则排序: ---->降序
        // 创建TreeMap集合,限制键的类型为Integer,值的类型为String
        TreeMap<Integer, String> map1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                    前减后: 升序
                    后减前: 降序
                    前:第一个参数  后:第二个参数
                 */
                return o2 - o1;
            }
        });

        // 往map集合中添加键值对
        map1.put(300, "深圳");
        map1.put(100, "北京");
        map1.put(200, "广州");
        map1.put(500, "上海");
        map1.put(400, "武汉");
        map1.put(400, "深圳");
        System.out.println(map1);
    }
}
