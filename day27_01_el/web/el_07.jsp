        <%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用EL表达式获取cookie中的数据</title>
</head>
<body>
    <%
        //因为jsp中内置session对象,所以请求中必定有一个名为JSESSIONID的cookie
        //目标: 获取名为JSESSIONID的cookie的值
        Cookie[] cookies = request.getCookies();
        String value = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONID")) {
                    value = cookie.getValue();
                }
            }
        }
    %>
    使用原始方式获取到的JSESSIONID的cookie的值为:<%=value%><br>

    使用EL表达式获取到的JSESSIONID的cookie的值为:${cookie.JSESSIONID.value}
</body>
</html>
