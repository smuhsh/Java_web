package app.labs.servlet.bean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet2
 */
@WebServlet("/servlet/CalcServlet2")
public class CalcServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
			
		//요청처리
		int result=0;
		
		int num1 = Integer.parseInt(request.getParameter("num1")); //String 으로 넘기고 필요할때 변환한다, String 으로 냅두면 처리하지 않는다
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opt = request.getParameter("opt");
		
		//서비스
		CalcService calc = new CalcService(num1, num2, opt);
		result = calc.getResult();
		
		// VIEW : JSP 처리
		//클라이언트가 웹서버에 요청하면 이 서블릿에서 간 다음에 제어권을 넘기는 것이다 그 때 사용하는게 RequestDispatcher 이다
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/servlet/calc2.jsp");
		request.setAttribute("result", Integer.toString(result));
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
