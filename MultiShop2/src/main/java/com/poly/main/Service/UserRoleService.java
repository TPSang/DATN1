package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.UserRole;

public interface UserRoleService {

	<S extends UserRole> List<S> findAll(Example<S> example, Sort sort);

	UserRole getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(UserRole entity);

	void deleteById(Long id);

	long count();

	<S extends UserRole> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends UserRole> S saveAndFlush(S entity);

	void flush();

	<S extends UserRole> List<S> saveAll(Iterable<S> entities);

	Optional<UserRole> findById(Long id);

	List<UserRole> findAll(Sort sort);

	List<UserRole> findAll();

	Page<UserRole> findAll(Pageable pageable);

	<S extends UserRole> S save(S entity);

}
