package com.example.demo.rest;


import com.example.demo.dto.ProductsDTO;
import com.example.demo.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductsController{
	
	private final ProductsService productsService;
	
	@Autowired
	public ProductsController(ProductsService productsService) {
		this.productsService = productsService;
	}
	
	@CrossOrigin
	@GetMapping("/getproducts")
	public ResponseEntity<List<ProductsDTO>> getAllProducts(){
		return ResponseEntity.ok(this.productsService.readAllProducts());
	}
	
	@CrossOrigin
	@GetMapping("getProductsById/{id}")
	public ResponseEntity<ProductsDTO> getProductsById(@PathVariable String id){
		return ResponseEntity.ok(this.productsService.findProductsById(id));
	}
}