package com.itheima.utils;

import javax.servlet.http.Cookie;

/**
 * 包名:com.itheima.utils
 *
 * @author Leevi
 * 日期2020-10-15  09:49
 */
public class CookieUtil {
    /**
     * 创建并且设置cookie
     * @param name
     * @param value
     * @param maxAge
     * @param path
     * @return
     */
    public static Cookie createAndSetCookie(String name,String value,int maxAge,String path){
        //1. 将str存储到cookie中
        Cookie cookie = new Cookie(name,value);

        //设置有效期
        //如果设置为0表示清除某个cookie
        cookie.setMaxAge(maxAge);

        //设置cookie的路径，一般设置为当前项目: request.getContextPath()
        cookie.setPath(path);

        return cookie;
    }

    /**
     * 根据cookie的name获取cookie的value
     * @param cookies
     * @param name
     * @return
     */
    public static String getCookieValue(Cookie[] cookies,String name){
        //2. 遍历出每一个cookie
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                //cookie是由键值对组成的，所以我们可以使用cookie获取name和value
                if (cookie.getName().equals(name)) {
                    return cookie.getValue();
                }
            }
        }
        //没有对应的cookie值
        return null;
    }
}
