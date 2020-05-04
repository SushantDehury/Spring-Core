package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IRCTCLocalService;
@WebServlet("/controller")
public class MainIRCTCControllerServlet extends HttpServlet {
	ApplicationContext ctx = null;

	@Override
	public void init() {
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		IRCTCLocalService service = null;
		String result = null;
		RequestDispatcher rd = null;

		int trainId = Integer.parseInt(req.getParameter("trainId"));
		service = ctx.getBean("irctclocalservice", IRCTCLocalService.class);
		try {
			result = service.serchTrainShedule(trainId);
			// just Test propurse
			System.out.println(result);

			req.setAttribute("result", result);
			rd = req.getRequestDispatcher("/view_train.jsp");
			rd.forward(req, res);
		} catch (IllegalStateException el) {
			rd = req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
			return;
		} catch (Exception e) {
			rd = req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();

	}

}
