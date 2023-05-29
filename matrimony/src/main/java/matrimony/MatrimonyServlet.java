package matrimony;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class MatrimonyServlet extends HttpServlet {
	public MatrimonyServlet() {
		System.out.println("no args MatrimonyServlet const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running MatrimonyServlet service method");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Running doPost Method");

		String name = req.getParameter("full_name");
		System.out.println("Name:" + name);
		String family = req.getParameter("family_background");
		System.out.println("About Family:" + family);
		String gender = req.getParameter("gender");
		System.out.println("Gender:" + gender);
		
		String age = req.getParameter("age");
		System.out.println("age:" + age);
		String religion = req.getParameter("religion");
		System.out.println("religion:" + religion);
		String caste = req.getParameter("caste");
		System.out.println("caste:" + caste);
		String education = req.getParameter("education");
		System.out.println("education:" + education);
		String occupation = req.getParameter("occupation");
		System.out.println("occupation:" + occupation);
		String income = req.getParameter("income");
		System.out.println("income:" + income);
		String height = req.getParameter("height");
		System.out.println("height:" + height);
		String marital_status = req.getParameter("marital_status");
		System.out.println("marital_status:" + marital_status);
		String ethnicity = req.getParameter("ethnicity");
		System.out.println("ethnicity:" + ethnicity);
		String nationality = req.getParameter("nationality");
		System.out.println("nationality:" + nationality);
		String language = req.getParameter("language");
		System.out.println("language:" + language);
		String residence = req.getParameter("residence");
		System.out.println("residence:" + residence);
		String family_background = req.getParameter("family_background");
		System.out.println("family_background:" + family_background);
		String hobbies = req.getParameter("hobbies");
		System.out.println("hobbies:" + hobbies);
		String interests = req.getParameter("interests");
		System.out.println("interests:" + interests);
		String expectations = req.getParameter("expectations");
		System.out.println("expectations:" + expectations);
		String image = req.getParameter("image");
		System.out.println("image:" + image);
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		dispatcher.forward(req, resp);
	}
}
