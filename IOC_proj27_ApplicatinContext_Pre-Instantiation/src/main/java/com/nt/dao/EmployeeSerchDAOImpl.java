package com.nt.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeSerchDAOImpl implements EmployeeSerchDAO {
	private DataSource ds;

	public EmployeeSerchDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<EmployeeBO> findEmployeeDesg(String cond) throws Exception {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		EmployeeBO bo = null;
		List<EmployeeBO> listBO = null;
		// get connection from connection obj
		con = ds.getConnection();
		// creatre simple statement obj
		st = con.createStatement();
		rs = st.executeQuery( "select empno,ename,job,deptno from emp where job in"+cond+"order by job");
		listBO = new ArrayList();
		while (rs.next()) {
			bo = new EmployeeBO();
			bo.setEmpno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setDeptno(rs.getInt(4));
			listBO.add(bo);
		}
		return listBO;
	}

}
