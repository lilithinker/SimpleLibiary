<%--
  Created by IntelliJ IDEA.
  User: lili
  Date: 2020/5/4
  Time: 10:38 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="./css/login.css">
</head>
<body>
<div>
    <form action="/login" method="post">
        <div class="input-item">
            <label>用户名:</label>
            <input type="text" name="username" required="required">
        </div>
        <div class="input-item">
            <label>密码:</label>
            <input type="password" name="password" required="required">
        </div>
        <div class="input-radio">
            <label for="role1">读者</label>
            <input type="radio" id="role1" name="role" value="reader" required="required">

            <label for="role2">管理员</label>
            <input type="radio" id="role2" name="role" value="admin" required="required">
        </div>
        <input type="submit" value="登陆">
    </form>
</div>

</body>
</html>