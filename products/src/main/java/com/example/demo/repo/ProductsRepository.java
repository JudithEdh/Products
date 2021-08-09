package com.example.demo.repo;



import com.example.demo.domain.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ProductsRepository extends JpaRepository<Products, String>{

	@Query("SELECT c FROM Products c WHERE c.Name like %?1% OR c.Title like %?1%")
	List<Products> findProductsByName(String name);
}


