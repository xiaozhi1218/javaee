package com.itheima.demo13_集合嵌套;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 16:19
 */
public class Test3_Map嵌套Map {
    public static void main(String[] args) {
        /*
            Map嵌套Map
         */
        // 创建Map集合对象
        Map<String, String> map1 = new HashMap<>();
        map1.put("it001", "迪丽热巴");
        map1.put("it002", "古力娜扎");

        // 创建Map集合对象
        Map<String, String> map2 = new HashMap<>();
        map2.put("heima001", "蔡徐坤");
        map2.put("heima002", "李易峰");

        // 创建Map集合,把以上2个Map集合作为值存储到这个map集合中
        Map<String, Map<String, String>> map = new HashMap<>();

        // 往集合中添加键值对
        map.put("传智播客",map1);
        map.put("黑马程序员",map2);

        System.out.println(map);
        System.out.println(map.size());// 2

        // 循环遍历
        // 获取map集合的所有键
        Set<String> keys = map.keySet();// 传智播客 黑马程序员
        // 循环遍历所有的键
        for (String key : keys) {
            // 根据key找值
            Map<String, String> valueMap = map.get(key);
            // 获取valueMap集合的所有键
            Set<String> keySet = valueMap.keySet();// map1所有的键或者map2所有的键
            for (String k : keySet) {
                System.out.println(k+","+valueMap.get(k));
            }
        }

    }
}
