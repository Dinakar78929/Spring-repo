package bodyparts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class BodyServlet extends HttpServlet{
public BodyServlet() {
	System.out.println("No args BodyServlet const");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running bodyparts service method");
		super.service(req, resp);
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	System.out.println("Running doPost Method");
	
	String name=req.getParameter("full_name");
	System.out.println("Name:"+name);
	String family=req.getParameter("family_background");
	System.out.println("About Family:"+family);
	String gender=req.getParameter("gender");
	System.out.println("Gender:"+gender);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("Display.jsp");
	dispatcher.forward(req, resp);
	}
}
