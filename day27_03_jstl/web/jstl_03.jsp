<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foreach标签的最简单的使用</title>
</head>
<body>
    <%--
        forEach标签用用于循环遍历的:
            1. begin 表示开始循环的下标
            2. end 表示结束循环的下标
            3. step 表示循环的步长，默认是1
            4. 将结果存储到域对象时候的那个key，到时候我们要取出结果就是使用${var的值}
        目标1: 在页面上显示0-9
    --%>
    <c:forEach begin="0" end="9" step="1" var="i">
        ${i}<br/>
    </c:forEach>
</body>
</html>
