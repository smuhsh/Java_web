package app.labs.servlet.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/servlet/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //저 위에 있는 주석과 @가 머냐면 산출물의 각각의 메서드가 무슨 일을하는지 기능을 말하는 것이다 JavaDoc 라는 유틸리티가 HTML 으로 바꿔주는데 api문서라고 한다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int result=0;
		
		int num1 = Integer.parseInt(request.getParameter("num1")); //String 으로 넘기고 필요할때 변환한다, String 으로 냅두면 처리하지 않는다
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opt = request.getParameter("opt");
		
		/*
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
		*/
		
		CalcService calc = new CalcService(num1, num2, opt);
		result = calc.getResult();
		
		response.setContentType("text/html;charset=utf-8"); //text를 보낼것인데 html 으로 처리해라 → MINE TYPE
		PrintWriter out = response.getWriter();
		
		String html = "<h1>계산결과</h1><h3>"+num1 + opt + num2 + "=" + result +"</h3>";
		out.println(html);
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
