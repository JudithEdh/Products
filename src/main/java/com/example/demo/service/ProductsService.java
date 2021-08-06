package com.example.demo.service;

import com.example.demo.domain.Products;
import com.example.demo.dto.ProductsDTO;
import com.example.demo.repo.ProductsRepository;
import com.example.demo.exceptions.ProductsNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsService{
	
	private final ProductsRepository productsRepository;
	private final ModelMapper mapper;
	
	@Autowired
	public ProductsService(ProductsRepository productsRepository, ModelMapper mapper) {
		
		this.productsRepository = productsRepository;
		this.mapper = mapper;
	}
	
	private ProductsDTO mapToDTO (Products products) {
		return this.mapper.map(products, ProductsDTO.class);
	}
	
	public List<ProductsDTO> readAllProducts(){
		return this.productsRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public ProductsDTO findProductsById(String id) {
		return this.mapToDTO(this.productsRepository.findById(id).orElseThrow(ProductsNotFoundException::new));
	}
	
}