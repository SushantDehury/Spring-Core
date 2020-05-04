package com.nt.Client;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeSerchController;
import com.nt.vo.EmployeeVO;


public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext pContainer = null, cContainer = null;
		EmployeeSerchController controller = null;
		List<EmployeeVO> listVO = null;
		pContainer = new ClassPathXmlApplicationContext("com/nt/cfgs/business-bean.xml");
		cContainer = new ClassPathXmlApplicationContext(new String[] { "com/nt/cfgs/presentation-bean.xml" },pContainer);

		try {
			controller = cContainer.getBean("empController", EmployeeSerchController.class);
			listVO = controller.getEmpByDesg(new String[] { "CLERK", "MANAGER" });
			listVO.forEach(bo -> {
				System.out.println(bo.getSno() + "		" + bo.getEmpno() + "		" + bo.getEname() + "		"
						+ bo.getJob() + "		" + bo.getDeptno());
			});
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((AbstractApplicationContext) cContainer).close();
			((AbstractApplicationContext) cContainer).close();
		}

	}

}
