package pavan;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = ("/send"))
public class StartServlet  extends HttpServlet{
	public StartServlet() {
		System.out.println("No args StartServlet Const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service method");
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Running doPost Method");
		
		String name=req.getParameter("fname");
		System.out.println(name);
		
		resp.setContentType("text/html");
		String userName=req.getParameter("username");
		String userPass=req.getParameter("password");
		 PrintWriter out = resp.getWriter();
		
		if(userName.equals("servlet")) {
			RequestDispatcher dispatcher =req.getRequestDispatcher("NextPage.jsp");
			dispatcher.forward(req, resp);
		} else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
	        rd.include(req, resp);  
		}
		
	
	}
	

}
