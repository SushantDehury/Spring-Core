package com.nt.controller;

import com.nt.dto.ProductDTO;
import com.nt.service.ProductService;
import com.nt.vo.ProductVO;

public class ProductController {
	private ProductService service;

	public void setService(ProductService service) {
		this.service = service;
	}

	public String Generrator(String ProductName, String ProductPrice) throws Exception {
		ProductVO vo = null;
		ProductDTO dto = null;
		String result = null;
		// create vo class obj
		vo = new ProductVO();
		vo.setProductName("productName");
		vo.setProductPrice("productPrice");
		// convert vo to dto class obj
		dto = new ProductDTO();
		dto.setProductName(vo.getProductName());
		dto.setProductPrice(Float.parseFloat(vo.getProductPrice()));
		result = service.processResut(dto);
		return result;
	}
}
