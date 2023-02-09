package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Order;

public interface OrderService {

	Order getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(Order entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	void flush();

	Optional<Order> findById(Long id);

	List<Order> findAll(Sort sort);

	List<Order> findAll();

	<S extends Order> S save(S entity);

}
