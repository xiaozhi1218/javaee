<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>特殊情况</title>
</head>
<body>
    <%
        //如果域对象中的key是: aa.bb
        request.setAttribute("aa.bb","cc");
    %>
    获取存储在域对象中的key为aa.bb的值:${requestScope['aa.bb']}
</body>
</html>
