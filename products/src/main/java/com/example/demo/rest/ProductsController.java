package com.example.demo.rest;



import com.example.demo.domain.Products;
import com.example.demo.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/products")
public class ProductsController{
	
	private ProductsService productsService;
	
	@Autowired
	public ProductsController(ProductsService productsService) {
		super();
		this.productsService = productsService;
	}
	
	
	@GetMapping("/getproducts")
	public ResponseEntity<List<Products>> getAllProducts(){
		return ResponseEntity.ok(this.productsService.readAllProducts());
	}
	
	@CrossOrigin
	@GetMapping("getProductsById/{id}")
	public ResponseEntity<Products> getProductsById(@PathVariable String id){
		return ResponseEntity.ok(this.productsService.findProductsById(id));
	}
	
	@CrossOrigin
	@GetMapping("getProductsByName/{name}")
	public ResponseEntity<List<Products>> getProductsByName(@PathVariable String name){
		return ResponseEntity.ok(this.productsService.findProductsByName(name));
	}
}