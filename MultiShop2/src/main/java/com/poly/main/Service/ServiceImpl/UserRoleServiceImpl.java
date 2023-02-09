package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.UserRole;
import com.poly.main.Repository.UserRoleRepository;
import com.poly.main.Service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {
	UserRoleRepository userRoleRepository;

	public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
		super();
		this.userRoleRepository = userRoleRepository;
	}

	@Override
	public <S extends UserRole> S save(S entity) {
		return userRoleRepository.save(entity);
	}

	@Override
	public Page<UserRole> findAll(Pageable pageable) {
		return userRoleRepository.findAll(pageable);
	}

	@Override
	public List<UserRole> findAll() {
		return userRoleRepository.findAll();
	}

	@Override
	public List<UserRole> findAll(Sort sort) {
		return userRoleRepository.findAll(sort);
	}

	@Override
	public Optional<UserRole> findById(Long id) {
		return userRoleRepository.findById(id);
	}

	@Override
	public <S extends UserRole> List<S> saveAll(Iterable<S> entities) {
		return userRoleRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		userRoleRepository.flush();
	}

	@Override
	public <S extends UserRole> S saveAndFlush(S entity) {
		return userRoleRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return userRoleRepository.existsById(id);
	}

	@Override
	public <S extends UserRole> List<S> saveAllAndFlush(Iterable<S> entities) {
		return userRoleRepository.saveAllAndFlush(entities);
	}

	@Override
	public long count() {
		return userRoleRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		userRoleRepository.deleteById(id);
	}

	@Override
	public void delete(UserRole entity) {
		userRoleRepository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		userRoleRepository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		userRoleRepository.deleteAll();
	}

	@Override
	public UserRole getById(Long id) {
		return userRoleRepository.getById(id);
	}

	@Override
	public <S extends UserRole> List<S> findAll(Example<S> example, Sort sort) {
		return userRoleRepository.findAll(example, sort);
	}
		
}
