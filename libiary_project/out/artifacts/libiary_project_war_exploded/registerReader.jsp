<%--
  Created by IntelliJ IDEA.
  User: lili
  Date: 2020/5/4
  Time: 10:43 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <link rel="stylesheet" href="./css/registerReader.css">
</head>
<body>
 <div class="wrap">
     <div class="input-item">
         <span>用户名：</span>
         <input type="text" name="username">
     </div>
     <div class="input-item">
         <span>密码：</span>
         <input type="password" name="password">
     </div>
     <div class="input-item">
         <span>真实姓名：</span>
         <input type="text" name="realname">
     </div>
     <div class="input-item">
         <span>电话：</span>
         <input type="text" name="telephone">
     </div>
     <div class="input-item">
         <span>专业：</span>
         <input type="text" name="major">
     </div>
     <div class="input-item">
         <span>年级：</span>
         <input type="text" name="grade">
     </div>
     <div class="btn-wrap">
         <button id="register">注册</button>
         <button id="back">返回</button>
     </div>
 </div>
 <script src="./lib/jquery.min.js"></script>
 <script>
     //注册用户
     $("#register").click(function(e){
         let register = {
             username:$("input[name=username]").val(),
             password:$("input[name=password]").val(),
             name:$("input[name=realname]").val(),
             telephone:$("input[name=telephone]").val(),
             major:$("input[name=major]").val(),
             grade:$("input[name=grade]").val(),
         }
         let params = "?username="+$("input[name=username]").val()+
                      "&password="+$("input[name=password]").val()+
                      "&name="+$("input[name=realname]").val()+
                      "&major="+$("input[name=realname]").val()+
                      "&grade="+$("input[name=grade]").val()+
                      "&telephone="+$("input[name=telephone]").val()
         registerReader(params);
     });
     //返回上一页
     $("#back").click(function(e){
         location.href = "/login.jsp";
     });
     //提交到后端
     function registerReader(params){
         $.ajax({
             method:"get",
             url:"/register-reader"+params,
             contentType:'application/json',
             success:function(data){
                 console.log("register success");
             },
             error:function(error){
                 console.log("register failed");
             }
         })
     }
 </script>
</body>
</html>
