<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<form action="signin" method="post">
		account:<input type="text" name="account" /> password:<input
			type="password" name="password" /> <input type="submit" value="登录" />
	</form>
	================================================================================
	<s:form action="signin" namespace="/" method="post">
		<s:textfield name="account" label="account"></s:textfield>
		<s:password name="password" label="password"></s:password>

		<s:submit value="Sign in"></s:submit>
	</s:form>
</body>
</html>
