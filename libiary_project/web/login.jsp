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
<%--    <link rel="stylesheet" href="./css/login.css">--%>
    <style>
        .input-item label{
            display: inline-block;
            width: 55px;
        }
        .input-radio label:first-child{
            margin-left: 55px;
        }
        .input-radio input:first-child{
            margin-right: 12px;
        }
        form input[type=submit]{
            width: 60px;
            margin-left: 85px;
            margin-top: 20px;
        }
    </style>
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
    <a id="register" href="./registerReader.jsp">注册用户</a>
</div>

</body>
</html>
