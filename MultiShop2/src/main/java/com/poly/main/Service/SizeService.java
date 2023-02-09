package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Size;

public interface SizeService {

	Size getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(Size entity);

	void deleteById(Long id);

	long count();

	<S extends Size> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends Size> S saveAndFlush(S entity);

	void flush();

	<S extends Size> List<S> saveAll(Iterable<S> entities);

	Optional<Size> findById(Long id);

	List<Size> findAll(Sort sort);

	List<Size> findAll();

	Page<Size> findAll(Pageable pageable);

	<S extends Size> S save(S entity);

}
