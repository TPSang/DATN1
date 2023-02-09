package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Role;

public interface RoleService {

	Role getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(Role entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	void flush();

	Optional<Role> findById(Long id);

	List<Role> findAll(Sort sort);

	List<Role> findAll();

	Page<Role> findAll(Pageable pageable);

	<S extends Role> S save(S entity);

}
