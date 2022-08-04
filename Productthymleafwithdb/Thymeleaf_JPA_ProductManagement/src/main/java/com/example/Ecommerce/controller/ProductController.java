package com.example.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Ecommerce.entity.Product;
import com.example.Ecommerce.service.ProductService;	

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/prodList")
	public String prodListView(Model model)
	{
		List<Product> product = prodService.findAll();
		model.addAttribute("PRODUCT",product);
		return "prod/product.html";
	}
	
	@GetMapping("/addProd")
	public String productForm(Model model)
	{
		model.addAttribute("PRODUCT",new Product());
		return "prod/productForm.html";
	}
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT") Product prod) {
		prodService.save(prod);
		return "redirect:/product/prodList";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("id") Integer id,Model model) {
		Product prod = prodService.findById(id);
		model.addAttribute("PRODUCT",prod);
		return "prod/productForm.html";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Integer id) {
		prodService.deleteById(id);
		return "redirect:/product/prodList";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("productName")String name, Model model) {
		List<Product> products = prodService.searchBy(name);
		model.addAttribute("PRODUCT",products);
		return "prod/product.html";
	}
	@GetMapping("/searchid")
	public String searchbyCategory(@RequestParam("CategoryID")Integer categoryid,Model model) {
		List<Product> products=prodService.findBycategoryid(categoryid);
		model.addAttribute("Product",products);
		return "prod/product.html";
	}
	
}
