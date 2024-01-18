package com.JpaPractice.service;

import com.JpaPractice.entities.Product;

public interface ProductService {

	// Create
	public Product createProduct(Product product);

	// Retrieve
	public Product retrieveProduct(Integer productId);

	// Update
	public Product updateProduct(Product product);

	// Delete
	public void deleteProduct(Product product);

	// Delete ProductById
	public void deleteProductById(Integer productId);

}
