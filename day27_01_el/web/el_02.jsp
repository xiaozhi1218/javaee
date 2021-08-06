<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取存储在域对象中的数组中的数据</title>
</head>
<body>
    <%
        //先往域对象中存储一个数组
        String[] arr = {"张三","李四","王五","赵六","田七","狗娃"};
        request.setAttribute("arr", arr);
    %>
    获取存储在域对象中的数组arr中的第五个元素的值: ${arr[4]}
</body>
</html>
