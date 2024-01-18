package com.JpaPractice.service;

import com.JpaPractice.dao.ProductDAO;
import com.JpaPractice.dao.ProductDAOImpl;
import com.JpaPractice.entities.Product;

public class ProductServiceImpl implements ProductService {
  
	ProductDAO pdao=new ProductDAOImpl();

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
	
		return pdao.createProduct(product);
	}
	@Override
	public Product retrieveProduct(Integer productId) {
		return pdao.retrieveProduct(productId);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Product product) {
		pdao.deleteProduct(product);
	}

	@Override
	public void deleteProductById(Integer productId) {
		// TODO Auto-generated method stub
		pdao.deleteProductById(productId);
	}
}
