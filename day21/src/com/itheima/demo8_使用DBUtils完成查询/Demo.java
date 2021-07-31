package com.itheima.demo8_使用DBUtils完成查询;

import Utils.C3P0Utils;
import com.bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 15:08
 */
public class Demo {
    /*
        api:
            public queryRunner(DataSource ds);
            query(String sql, ResultSetHandler<T> rsh, Object... params) 执行查询语句
                参数ResultSetHandler是一个接口,表示结果集处理者(对查询结果的封装):
                ResultSetHandler接口的实现类:
                    ArrayHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个Object数组中
                    BeanHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个javaBean对象中
                    MapHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个Map集合中

                    ArrayListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个Object数组中,然后把这些数组添加到List集合中
                    BeanListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个javaBean对象中,然后把这些javaBean对象添加到List集合中
                    MapListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个Map集合中,然后把这些Map集合添加到List集合中
                    KeyedHandle:适合查询结果是多条记录的,会把每条记录的数据封装到一个Map集合中,然后把这些Map集合添加到另一个Map集合中

                    ColumnListHandler:适合查询结果是单列多行的,会把该列的所有数据存储到List集合中

                    ScalarHandler:适合查询结果是单个值的,会把这个值封装成一个对象
     */
    // 查询结果是一条记录的---数组
    @Test
    public void select1() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        Object[] arr = qr.query("select * from user where id = ?", new ArrayHandler(), 1);
        System.out.println(Arrays.toString(arr));
    }

    // 查询结果是一条记录的---JavaBean
    @Test
    public void select2() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        User user = qr.query("select * from user where id = ?", new BeanHandler<User>(User.class), 1);
        System.out.println(user);

    }

    // 查询结果是一条记录的---Map集合
    @Test
    public void select3() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        Map<String, Object> map = qr.query("select * from user where id = ?", new MapHandler(), 1);
        System.out.println(map);

    }

    // 查询结果是多条记录的---->数组
    @Test
    public void select4() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        List<Object[]> list = qr.query("select * from user", new ArrayListHandler());
        for (Object[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }
    }
    // 查询结果是多条记录的---->javaBean
    @Test
    public void select5() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        List<User> list = qr.query("select * from user", new BeanListHandler<User>(User.class));
        for (User user : list) {
            System.out.println(user);
        }
    }

    // 查询结果是多条记录的---->Map集合
    @Test
    public void select6() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        List<Map<String, Object>> list = qr.query("select * from user", new MapListHandler());
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    // 查询结果是多条记录的---->Map集合
    @Test
    public void select7() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        Map<Object, Map<String, Object>> map = qr.query("select * from user", new KeyedHandler());
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            Map<String, Object> m = map.get(key);
            System.out.println(key+"="+m);
        }
    }

    // 查询结果是单列多行----List集合
    @Test
    public void select8() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        List<Object> list = qr.query("select username from user", new ColumnListHandler());
        System.out.println(list);
    }

    // 查询结果是单个值----对象
    @Test
    public void select9() throws Exception{
        // 1.创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        // 2.调用query方法
        Long count = (Long)qr.query("select count(*) from user", new ScalarHandler());
        System.out.println(count);
    }
}
