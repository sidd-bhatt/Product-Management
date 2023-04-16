package com.app.service;

import java.util.List;

import com.app.entities.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public String deleteProduct(Integer id);
	public Product saveProduct(Product product);
	public Product editProduct(Product product, Integer id);

}
