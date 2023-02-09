package com.poly.main.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.User;
import com.poly.main.Repository.UserRepository;
import com.poly.main.Service.UserService;
@Service
public class UserServiceImpl implements UserService {
	UserRepository repository;

	public UserServiceImpl(UserRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public <S extends User> S save(S entity) {
		return repository.save(entity);
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public <S extends User> List<S> saveAll(Iterable<S> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public void flush() {
		repository.flush();
	}

	@Override
	public <S extends User> S saveAndFlush(S entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}

	@Override
	public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repository.saveAllAndFlush(entities);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(User entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		repository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public User getById(Long id) {
		return repository.getById(id);
	}
	

}
