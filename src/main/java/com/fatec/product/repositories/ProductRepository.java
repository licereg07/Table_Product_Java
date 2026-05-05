package com.fatec.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
