package com.xworkz.bag.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bag.dto.BagDTO;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class BagServlet extends HttpServlet {
	
	BagService service=new BagServiceImpl();
	public BagServlet() {
		System.out.println("No args BagServlet const");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dopost method ");
		
		BagDTO bagDTO=new BagDTO();
		bagDTO.setBrand(req.getParameter("brand"));
		bagDTO.setColor(req.getParameter("color"));
		bagDTO.setType(req.getParameter("type"));
		
		System.out.println(bagDTO.toString());
		try {
		boolean save1=service.validateAndSave(bagDTO);
		System.out.println("saved:"+save1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ShowData.jsp");
		dispatcher.forward(req, resp);
		
	}

}
