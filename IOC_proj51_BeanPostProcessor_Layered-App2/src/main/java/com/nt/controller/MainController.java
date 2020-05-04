package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.CollegeService;

@WebServlet("/controller")
public class MainController extends HttpServlet {
	ApplicationContext ctx = null;
	CollegeService service = null;

	@Override
	public void init() {
		// create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service = ctx.getBean("service", CollegeService.class);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s1 = null;
		StudentDTO sdto = null;
		EmployeeDTO edto = null;
		String result = null;
		RequestDispatcher rd = null;
		// read form data
		s1 = req.getParameter("s1");
		if (s1.equalsIgnoreCase("student")) {
			try {
				sdto = new StudentDTO();
				sdto.setPname(req.getParameter("sname"));
				sdto.setCourse(req.getParameter("course"));

				result = service.generateStudentInsert(sdto);
				req.setAttribute("result", result);
				rd = req.getRequestDispatcher("/view_result.jsp");
				rd.forward(req, res);
			} catch (Exception e) {
				e.printStackTrace();
				rd = req.getRequestDispatcher("/error.jsp");
				rd.forward(req, res);
				return;
			}
		} else {
			try {
				edto = new EmployeeDTO();
				edto.setPname(req.getParameter("pname"));
				edto.setDesg(req.getParameter("desg"));

				result = service.generateEmployeeInsert(edto);
				req.setAttribute("result", result);
				rd = req.getRequestDispatcher("/view_result.jsp");
				rd.forward(req, res);
			} catch (Exception e) {
				e.printStackTrace();
				rd = req.getRequestDispatcher("/error.jsp");
				rd.forward(req, res);
				return;
			}
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
