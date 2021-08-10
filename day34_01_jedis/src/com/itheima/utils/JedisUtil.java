package com.itheima.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * 包名:com.itheima.utils
 * @author Leevi
 * 日期2020-10-26  15:42
 * 使用jedis的步骤:
 * 1. 拷贝jar包
 * 2. 拷贝配置文件
 * 3. 拷贝工具类
 */
public class JedisUtil {
    private static JedisPool jedisPool;
    static {
        //读取jedisconfig.properties配置文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jedisconfig");
        Integer maxTotal = Integer.valueOf(resourceBundle.getString("jedis.maxTotal"));
        Integer maxIdle = Integer.valueOf(resourceBundle.getString("jedis.maxIdle"));
        Integer maxWaitMillis = Integer.valueOf(resourceBundle.getString("jedis.maxWaitMillis"));
        String host = resourceBundle.getString("jedis.host");
        Integer port = Integer.valueOf(resourceBundle.getString("jedis.port"));
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        //使用jedis连接池
        jedisPool = new JedisPool(jedisPoolConfig,host,port);
    }

    /**
     * 从连接池获取连接
     * @return
     */
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
