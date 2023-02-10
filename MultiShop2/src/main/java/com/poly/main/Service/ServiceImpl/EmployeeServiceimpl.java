package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Employee;
import com.poly.main.Repository.EmployeeRepository;
import com.poly.main.Service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService {
	EmployeeRepository employeeRepository;

	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public <S extends Employee> S save(S entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public Page<Employee> findAll(Pageable pageable) {
		return employeeRepository.findAll(pageable);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAll(Sort sort) {
		return employeeRepository.findAll(sort);
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void flush() {
		employeeRepository.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public long count() {
		return employeeRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void delete(Employee entity) {
		employeeRepository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		employeeRepository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	@Override
	public Employee getById(Long id) {
		return employeeRepository.getById(id);
	}
	
}
