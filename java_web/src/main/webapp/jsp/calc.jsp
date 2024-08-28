<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num1=0, num2=0, num3=0, result=0;
	String opt = "?";
	
	//POST 방식일 때에 계산되도록
	if(request.getMethod().equals("POST")){
		num1 = Integer.parseInt(request.getParameter("num1")); //String 으로 넘기고 필요할때 변환한다, String 으로 냅두면 처리하지 않는다
		num2 = Integer.parseInt(request.getParameter("num2"));
		opt = request.getParameter("opt");
		
		if(opt.equals("+")) {
			result = num1+num2;
		}
		else if (opt.equals("-")) {
			result = num1-num2;
		}
		else if (opt.equals("*")) {
			result = num1*num2;
		}
		else if (opt.equals("/")) {
			result = num1/num2;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>calc.jsp</title>
</head>
<body>
	<h3>JSP 계산기</h3>
	<form name="form1" id="form1" action="calc.jsp" method="post">
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
	<h3>결과: <%out.println(num1); %><%=opt %><%=num2 %> = <%=result %></h3>
</body>
</html>