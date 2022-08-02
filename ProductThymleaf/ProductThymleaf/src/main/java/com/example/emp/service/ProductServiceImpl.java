package com.example.emp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.entity.Product;
import com.example.emp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository prodrepo;
	
	public List<Product> findAll() {
		return prodrepo.findAll();
	}
	public Product findById(Integer id) {
		Optional<Product> p =  prodrepo.findById(id) ;
		Product prod  = null;
		
		if(p.isPresent())
			prod = p.get();
		
		return prod;
	}	
	public void deleteById(Integer id) {
		prodrepo.deleteById(id);
		
	}
	
	@Transactional
	public void save(Product prod) {
		prodrepo.save(prod);
		
	}
	

}
