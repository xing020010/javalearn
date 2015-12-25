<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>
	<s:form action="memberregister">

		<s:textfield label="用户名" name="member.username" />
		<s:textfield label="密码" name="member.password" />


		<s:submit />

	</s:form>
</body>
</html>