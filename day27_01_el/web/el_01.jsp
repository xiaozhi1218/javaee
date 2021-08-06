<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用el表达式获取存储在域对象中的简单类型的数据</title>
</head>
<body>
    <%
        //将数据存储到域对象
        application.setAttribute("msg", "applicationVal");//往servletContext中存放数据
        session.setAttribute("msg","sessionVal");//往session中存放数据
        request.setAttribute("msg","requestVal");//往request中存放数据

        //获取域对象中的数据，并且展示在页面上
    %>
    <%--
        获取application域中的key为msg的那个值
    --%>
    存放在application中的msg的值为:${applicationScope.msg}<br>
    存放在session中的msg的值为:${sessionScope.msg}<br>
    存放在request中的msg的值为:${requestScope.msg}<br>

    <%--
        这种写法:会先到范围最小的域对象中找，如果范围最小的域对象中没有，则逐渐增大域对象的范围
    --%>
    存放在域对象中的msg的值为:${msg}
</body>
</html>
