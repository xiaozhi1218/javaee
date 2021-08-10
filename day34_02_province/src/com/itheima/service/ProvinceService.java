package com.itheima.service;

import com.alibaba.fastjson.JSON;
import com.itheima.dao.ProvinceDao;
import com.itheima.pojo.Province;
import com.itheima.utils.JedisUtil;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * 包名:com.itheima.service
 * @author Leevi
 * 日期2020-10-26  15:58
 * 优化前: 业务层直接掉dao层的方法查询mysql数据库
 *
 * 优化后:
 * 1. 从redis中查询省份信息
 * 2. 如果查询不到则调用dao层的方法到mysql数据库查询，将查询到的数据存储到redis
 * 3. 如果查询到了，就直接使用redis中的数据
 */
public class ProvinceService {
    private ProvinceDao provinceDao = new ProvinceDao();
    public List<Province> findAll() throws Exception {
        //1. 从redis中查询省份信息
        Jedis jedis = JedisUtil.getJedis();
        String jsonStr = jedis.get("province:list");

        //2. 判断jsonStr是否为null
        if (jsonStr == null) {
            //说明redis中没有存储省份信息
            //调用dao层的方法查询省份信息
            List<Province> provinceList = provinceDao.findAll();
            //将provinceList转换成jsonStr
            jsonStr = JSON.toJSONString(provinceList);
            //将jsonStr存储到redis
            jedis.set("province:list",jsonStr);
        }

        //3. 将jsonStr转换成List<Province>
        List<Province> list = JSON.parseArray(jsonStr, Province.class);

        jedis.close();
        return list;
    }
}
