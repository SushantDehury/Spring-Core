package com.nt.service;

import com.nt.bo.ProductBO;
import com.nt.dao.ProductDAO;
import com.nt.dto.ProductDTO;

public class ProductServiceImpl implements ProductService {
	private ProductDAO dao;

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public String processResut(ProductDTO dto) throws Exception {
		// b.logic

		ProductBO bo = null;
		int result = 0;
		float discount = dto.getProductPrice() / 100 * 20;
		float total = dto.getProductPrice() - discount;
		// sent BO class obj
		bo = new ProductBO();
		bo.setProductName(dto.getProductName());
		bo.setProductPrice(dto.getProductPrice());
		bo.setDiscount(discount);
		bo.setTotal(total);
		result = dao.insert(bo);
		if (result == 0)
			return "Recourd insertation fail";
		else
			return "Record insert Succeeded";
	}

}
