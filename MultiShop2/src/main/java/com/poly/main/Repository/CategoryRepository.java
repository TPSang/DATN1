package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.main.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
