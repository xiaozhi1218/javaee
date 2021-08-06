<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用forEach标签遍历集合中的数据</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        request.setAttribute("list", list);
    %>
    <%--
        取出域对象中的集合，并且遍历出每一个数据，然后进行展示
            1. begin 开始遍历的下标，如果是进行遍历则可以不写，默认是
            2. end 结束遍历的下标，如果是进行遍历则可以不写，默认是遍历到最后一个
            3. step 步长，默认是1
            4. var 将遍历结果存储到域对象时候的key
            5. items 要遍历的数据

        取出域对象中的集合，然后将集合中的数据展示到表格中
            varStatus属性:
            遍历出来的每一个元素都拥有这一些状态，比如: index(下标)、count(序号、计数)、first(是否是第一个)
            last(是否是最后一个)、current(当前元素)
            这些状态会被封装到一个对象中，这个对象又会被存储到page域对象中，而varStatus就是指定这个封装了
            状态的对象存储进域对象时候的key
    --%>
    <table border="1" cellspacing="0" width="500">
        <tr>
            <th>下标</th>
            <th>序号</th>
            <th>姓名</th>
            <th>是否是第一个元素</th>
            <th>是否是最后一个元素</th>
        </tr>
        <c:forEach items="${list}" var="name" varStatus="vst">
            <tr>
                <td>${vst.index}</td>
                <td>${vst.count}</td>
                <td>${vst.current}</td>
                <td>${vst.first}</td>
                <td>${vst.last}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
