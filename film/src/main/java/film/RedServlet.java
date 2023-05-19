package film;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = ("/red"))
public class RedServlet extends HttpServlet{
	
	public RedServlet() {
		System.out.println("no args RedServlet consts");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service method");
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running get method");
		
		req.getRequestURL();
		
		System.out.println("IP Address:"+req.getRemoteAddr());
		
		Enumeration<String> enumeration=req.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String headerName=enumeration.nextElement();
			
			System.out.println(headerName+":"+req.getHeader(headerName));
		}
		
		System.out.println("----------------------------");
		
		resp.setContentType("text/plain");
		
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.print("this is red color");
	}
	
	

}
