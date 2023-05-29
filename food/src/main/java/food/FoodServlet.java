package food;

import java.io.IOException;
import java.net.HttpCookie;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationSessionCookieConfig;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/fav"))
public class FoodServlet extends HttpServlet {
	public FoodServlet() {
		System.out.println("no args- FoodServlet const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service method");
		super.service(arg0, arg1);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running post method");
		req.setAttribute("food", req.getParameter("favfood"));
		req.setAttribute("place", req.getParameter("favplace"));
		req.setAttribute("person", req.getParameter("favperson"));

		String[] laptops = { "Hp", "Dell", "Lenovo", "Acer", "Asus" };
		req.setAttribute("laptop1", laptops[0]);
		req.setAttribute("laptop2", laptops[1]);
		req.setAttribute("laptop3", laptops[2]);
		req.setAttribute("laptop4", laptops[3]);
		req.setAttribute("laptop5", laptops[4]);
		
		System.out.println("--------Getting cookies in list----");
		Cookie cookie[]=req.getCookies();
		for (Cookie cookie2 : cookie) {
			System.out.println(req.getRemoteAddr()+" "+req.getParameter("favfood")+ cookie2);
		}
		
		HttpSession session=req.getSession();
		session.setAttribute("color", req.getParameter("favcolor"));
		
		
		ServletContext context=req.getServletContext();
		context.setAttribute("company", "Xworkz");
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/InfoDisplay.jsp");
		dispatcher.forward(req, resp);

	}
}
