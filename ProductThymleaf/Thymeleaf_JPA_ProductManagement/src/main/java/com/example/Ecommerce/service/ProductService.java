package com.example.Ecommerce.service;

import java.util.List;

import com.example.Ecommerce.entity.Product;


public interface ProductService {
	public List<Product>findAll();

	public void save(Product prod);

	public void deleteById(Integer id);

	public Product findById(Integer id);

	public List<Product> searchBy(String name);
	
	public List<Product> findBycategoryid(Integer categoryid);

}
