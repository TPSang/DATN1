package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.User;

public interface UserService {

	void delete(User entity);

	void deleteById(Long id);

	<S extends User> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends User> S saveAndFlush(S entity);

	void flush();

	<S extends User> List<S> saveAll(Iterable<S> entities);

	Optional<User> findById(Long string);

	List<User> findAllById(Iterable<Long> ids);

	List<User> findAll(Sort sort);

	List<User> findAll();

	Page<User> findAll(Pageable pageable);

	<S extends User> S save(S entity);

}
