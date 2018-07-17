<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/account/save">
		女奴编号&nbsp;&nbsp;&nbsp;<input type="text" name="id">
		女奴名称&nbsp;&nbsp;&nbsp;<input type="text" name="name">
		女奴标价&nbsp;&nbsp;&nbsp;<input type="text" name="money">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="上架新到女奴">
	</form>
</body>
</html>