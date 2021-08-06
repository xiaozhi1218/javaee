<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl的choose标签的使用介绍</title>
</head>
<body>
    <%--
        jstl的choose标签的作用:用于代替if... else if ... else if .... else
    --%>
    <%
        request.setAttribute("score",120);
    %>
    <c:choose>
        <c:when test="${score >=90 && score <= 100}">
            优秀
        </c:when>
        <c:when test="${score >= 80 && score < 90}">
            良好
        </c:when>
        <c:when test="${score >= 60 && score < 80}">
            及格
        </c:when>
        <c:when test="${score >= 0 && score < 60}">
            不及格
        </c:when>
        <c:otherwise>
            成绩输入有误
        </c:otherwise>
    </c:choose>
</body>
</html>
