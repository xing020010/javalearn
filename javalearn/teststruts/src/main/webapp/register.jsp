<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<s:head />
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>
中文测试
	<s:form action="register">

		<s:textfield key="personBean.firstName" />
		<s:textfield key="personBean.lastName"  />
		<s:textfield key="personBean.email"  />
		<s:textfield key="personBean.age"  />

		<s:submit />

	</s:form>
</body>
</html>