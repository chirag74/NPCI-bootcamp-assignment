package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.emp.entity.Product;
import com.example.emp.service.ProductService;

@Controller
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	ProductService entityManager;
	
	@GetMapping("/ProdList")
	public String findAll(Model model) {
		List<Product> prod = entityManager.findAll();
		model.addAttribute("PRODUCT",prod);
		return "home.html";
		
	}
	@GetMapping("/addProd")
	public String prodForm(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "form1.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT") Product prod) {
		entityManager.save(prod);
		return "redirect:/Product/ProdList";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("id") Integer id, Model model) {
		Product emp = entityManager.findById(id);
		model.addAttribute("PRODUCT",emp);
		return "form1.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("id") Integer id) {
		entityManager.deleteById(id);
		
		return "redirect:/Product/ProdList";
	}

}
