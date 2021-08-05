<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/15
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <%
        //从request域对象中取出errorMsg的值，并且显示在页面上
        String errorMsg = (String) request.getAttribute("errorMsg");
        if (errorMsg == null) {
            errorMsg = "";
        }

        String username = "";
        //获取名为username的cookie的值
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                }
            }
        }
    %>
    <div style="color: red"><%=errorMsg%></div>
    <form action="login" method="post">

        <%--将变量username的值显示到用户名输入框--%>
        用户名<input type="text" name="username" value="<%=username%>"><br>
        密码<input type="password" name="password"><br>
        验证码<input type="text" name="checkCode"><br>
        <img id="checkCode" src="checkCode"/>
        <a href="javascript:;" onclick="changeCheckCode()">换一换</a>
        <br>
        <input type="checkbox" name="remember">记住用户名<br>
        <input type="submit" value="提交">
    </form>
    <script>
        //声明一个方法，切换验证码图片
        function changeCheckCode() {
            //怎么切换验证码图片呢?  再一次请求验证码图片路径,也就是重新设置img标签的src
            //因为我们的访问路径没有改变，所以服务器认为我们发送的是同一次请求，所以服务器会返回一个状态码304，所以我们会从缓存中获取数据
            //如果每次访问的url路径有变化，就绝不会从缓存中获取数据
            document.getElementById("checkCode").setAttribute("src","checkCode?a="+new Date())
        }
    </script>
</body>
</html>
