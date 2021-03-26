<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
</head>
<body>
<h3>这里是登录页面</h3>

<s:form action="Login" method="post">
<s:textfield name="username" label="用户名："/>
<s:textfield name="password" label="密码："/>
<s:submit value="登录"/><s:reset value="重置"/>
</s:form>
<input type="button" value="注册" onclick="window.open('Register.jsp')"/>

<h3>这里是结尾</h3>

</body>
</html>