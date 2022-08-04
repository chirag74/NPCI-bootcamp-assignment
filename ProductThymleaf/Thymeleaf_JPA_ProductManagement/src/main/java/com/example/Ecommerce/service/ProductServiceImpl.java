package com.example.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce.entity.Product;
import com.example.Ecommerce.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public void save(Product prod) {
		// TODO Auto-generated method stub
		repository.save(prod);
	}
	
	public Product findById(Integer id) {
		Optional<Product>p = repository.findById(id);
		Product prod = null;
		
		if(p.isPresent())
			prod = p.get();
		
		return prod;
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}
	
	@Override
	public List<Product> searchBy(String name) {
		List<Product> results = null;
		if(name != null && (name.trim().length()>0))
			results = repository.findBynameContainsAllIgnoreCase(name);
		else
			results = findAll();
		return results;
	}

	@Override
	public List<Product> findBycategoryid(Integer categoryid) {
		// TODO Auto-generated method stub
		List<Product> results=null;
		if(categoryid!=0 && categoryid>0) {
			results=repository.findBycategoryid(categoryid);
			
		}
		else
			results=findAll();
		return results;
	}

}