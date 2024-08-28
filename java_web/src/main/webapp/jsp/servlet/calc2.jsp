<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String result1 = (String)request.getAttribute("result");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>calc2.jsp</title>
</head>
<body>
	<h3>JSP 계산기</h3>
	<form name="form1" id="form1" action="${pageContext.request.contextPath}/servlet/CalcServlet2" method="post">
		<input type="number" name="num1" size="5" min="0" max="100" required />
		<select name="opt">
			<option value="+" selected>+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<input type="number" name="num2" size="5" min="0" max="100" required />
		<button type="submit">계산</button>
		<button type="reset">초기화</button>
	</form>
	<h3><%=result1 %></h3>
<%-- 	<h3>${result }</h3> --%>
</body>
</html>