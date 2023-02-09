package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.Order;
import com.poly.main.Repository.OrderRepository;
import com.poly.main.Service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
 OrderRepository orderRepository;

public OrderServiceImpl(OrderRepository orderRepository) {
	super();
	this.orderRepository = orderRepository;
}

@Override
public <S extends Order> S save(S entity) {
	return orderRepository.save(entity);
}

@Override
public List<Order> findAll() {
	return orderRepository.findAll();
}

@Override
public List<Order> findAll(Sort sort) {
	return orderRepository.findAll(sort);
}

@Override
public Optional<Order> findById(Long id) {
	return orderRepository.findById(id);
}

@Override
public void flush() {
	orderRepository.flush();
}

@Override
public boolean existsById(Long id) {
	return orderRepository.existsById(id);
}

@Override
public long count() {
	return orderRepository.count();
}

@Override
public void deleteById(Long id) {
	orderRepository.deleteById(id);
}

@Override
public void delete(Order entity) {
	orderRepository.delete(entity);
}

@Override
public void deleteAllInBatch() {
	orderRepository.deleteAllInBatch();
}

@Override
public void deleteAll() {
	orderRepository.deleteAll();
}

@Override
public Order getById(Long id) {
	return orderRepository.getById(id);
}
 
}
