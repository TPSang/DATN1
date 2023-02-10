package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Employee;

public interface EmployeeService {

	Employee getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(Employee entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	void flush();

	Optional<Employee> findById(Long id);

	List<Employee> findAll(Sort sort);

	List<Employee> findAll();

	Page<Employee> findAll(Pageable pageable);

	<S extends Employee> S save(S entity);

}
