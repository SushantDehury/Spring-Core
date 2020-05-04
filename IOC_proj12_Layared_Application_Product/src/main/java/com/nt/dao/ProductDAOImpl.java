package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.ProductBO;

public class ProductDAOImpl implements ProductDAO {
	private DataSource ds;
	private static final String PRODUCT = "INSERT INTO PRODUCT(PRODUCTID,PRODUCTNAME,PRODUCTPRICE,DISCOUNT,TOTAL) VALUES(PRODUCT_ID_SEQ.NEXTVAL,?,?,?,?)";

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(ProductBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		// create connection
		con = ds.getConnection();
		// create preparedStatement
		ps = con.prepareStatement(PRODUCT);
		// setr Query param value
		ps.setString(1, bo.getProductName());
		ps.setFloat(2, bo.getProductPrice());
		ps.setFloat(3, bo.getDiscount());
		ps.setFloat(4, bo.getTotal());
		result=ps.executeUpdate();
		return result;
	}

}
