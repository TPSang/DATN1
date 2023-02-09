package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.main.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
