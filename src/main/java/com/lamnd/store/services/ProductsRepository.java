package com.lamnd.store.services;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lamnd.store.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{
	List<Product> findByNameContainingIgnoreCase(String name, Sort sort);
}
