package com.example.demo.service;

import com.example.demo.domain.Products;
import com.example.demo.repo.ProductsRepository;
import com.example.demo.exceptions.ProductsNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductsService{
	
	private final ProductsRepository productsRepository;

	
	@Autowired
	public ProductsService(ProductsRepository productsRepository) {
		
		super();
		this.productsRepository = productsRepository;
		
	}
	
	
	
	public List<Products> readAllProducts(){
		List<Products> result = this.productsRepository.findAll();
		return result;
		
	}
	
	public Products findProductsById(String id) {
		return this.productsRepository.findById(id).orElseThrow(ProductsNotFoundException::new);
	}
	
	public List<Products> findProductsByName(String name) {
		return this.productsRepository.findProductsByName(name);
	}
	
	public List<Products> findProductsByCategory(String category) {
		return this.productsRepository.findProductsByCategory(category);
	}
	
	public List<Products> findProductsByTag(String tag) {
		return this.productsRepository.findProductsByTag(tag);
	}
}