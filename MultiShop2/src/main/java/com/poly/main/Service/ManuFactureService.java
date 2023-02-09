package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Manufacture;

public interface ManuFactureService {

	Manufacture getById(Long id);

	void deleteAll();

	void delete(Manufacture entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	Optional<Manufacture> findById(Long id);

	List<Manufacture> findAll(Sort sort);

	List<Manufacture> findAll();

	Page<Manufacture> findAll(Pageable pageable);

	<S extends Manufacture> S save(S entity);

}
