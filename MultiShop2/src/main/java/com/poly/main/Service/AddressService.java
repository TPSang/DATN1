package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Address;

public interface AddressService {

	Address getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(Address entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	void flush();

	Optional<Address> findById(Long id);

	List<Address> findAll(Sort sort);

	List<Address> findAll();

	Page<Address> findAll(Pageable pageable);

	<S extends Address> S save(S entity);

}
