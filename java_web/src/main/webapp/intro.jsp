<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>intro.jsp</title>
</head>
<body>
	<%--<H 1~6>, content: Hello JSP !!! 출력 --%>
	<h1>Hello JSP!!!</h1>
	<h2>Hello JSP!!!</h2>
	<h3>Hello JSP!!!</h3>
	<h4>Hello JSP!!!</h4>
	<h5>Hello JSP!!!</h5>
	<h6>Hello JSP!!!</h6>
	
	<%
		for(int i=0; i<6; i++){
			out.println("<h"+i+">Hello JSP !!!</h" + i + ">");
		}
	
	%>
	
	<script type="text/javascript">
		for(let i=0; i<6; i++){
			document.write("<h"+i+">Hello JSP !!!</h" + i + ">");
		}
	</script>

</body>
</html>