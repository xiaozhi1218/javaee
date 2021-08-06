<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转账页面</title>
</head>
<body>
    <form action="account" method="post">
        转出账户<input type="text" name="fromName"><br>
        转入账户<input type="text" name="toName"><br>
        转账金额<input type="text" name="money"><br>
        <input type="submit" value="转账">
    </form>
</body>
</html>
