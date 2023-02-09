package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Product;

public interface ProductService {

	Product getById(Long id);

	void deleteAll();

	void delete(Product entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	<S extends Product> S saveAndFlush(S entity);

	<S extends Product> List<S> saveAll(Iterable<S> entities);

	Optional<Product> findById(Long id);

	List<Product> findAll(Sort sort);

	List<Product> findAll();

	Page<Product> findAll(Pageable pageable);

	<S extends Product> S save(S entity);

}
