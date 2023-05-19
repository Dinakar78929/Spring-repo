package dinakar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class DinakarServlet extends HttpServlet {

	public DinakarServlet() {
		System.out.println("no args DinakarServlet consts");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Calling service method");
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling DinakarServlet doGet method");

		req.getRequestURL();
		System.out.println("IP address" + req.getRemoteAddr());

		Enumeration<String> enumeration = req.getHeaderNames();

		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();

			System.out.println(headerName + ":" + req.getHeader(headerName));
		}

		String name = req.getParameter("countryName");
		System.out.println("Name:" + name);
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>");
		printWriter.println("Hello");
		printWriter.print("</br>");
		printWriter.println(name);
		printWriter.print("</h1>");
		printWriter.print("</body>");
		printWriter.print("</html>");

	}
}
