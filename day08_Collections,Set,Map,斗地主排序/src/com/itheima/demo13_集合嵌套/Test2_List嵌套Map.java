package com.itheima.demo13_集合嵌套;

import java.util.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 16:14
 */
public class Test2_List嵌套Map {
    public static void main(String[] args) {
        /*
            List嵌套Map:说明List集合中的元素是Map集合
         */
        // 创建Map集合对象
        Map<String,String> map1 = new HashMap<>();
        map1.put("it001","迪丽热巴");
        map1.put("it002","古力娜扎");

        // 创建Map集合对象
        Map<String,String> map2 = new HashMap<>();
        map2.put("heima001","蔡徐坤");
        map2.put("heima002","李易峰");

        // 创建List集合,存储map1,map2
        List<Map<String, String>> list = new ArrayList<>();

        // 往集合中添加元素
        list.add(map1);
        list.add(map2);

        System.out.println(list);// [{it002=古力娜扎, it001=迪丽热巴}, {heima001=蔡徐坤, heima002=李易峰}]
        System.out.println(list.size());// 2

        // 循环遍历
        for (Map<String, String> map : list) {
            //System.out.println(map);
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.println(key+","+map.get(key));
            }
//            Set<Map.Entry<String, String>> entry = map.entrySet();
//            for (Map.Entry<String, String> entry1 : entry) {
//                System.out.println(entry1.getKey() + "," + entry1.getValue());
//            }
        }

    }
}
