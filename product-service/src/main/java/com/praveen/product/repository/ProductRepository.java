package com.praveen.product.repository;
import com.praveen.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Long>{}
