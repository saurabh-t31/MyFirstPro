package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class serveletmy
 */
@WebServlet("/myservlet")
public class serveletmy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveletmy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getParameter("username");
		String str2 = request.getParameter("pass");
		String str3 = request.getParameter("bt1");
		
		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		
		int ans;
		
		if(str3.equals("1")) ans = num1+num2 ;
		else if(str3.equals("2")) ans = num1 -num2;
		else if(str3.equals("3")) ans = num1*num2;
		else ans = num1/num2;
		
//		response.getWriter().append("Ans is: "+ans);
		response.sendRedirect("index.jsp?ans="+ans);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Do post s caliing");

		
	}

}
