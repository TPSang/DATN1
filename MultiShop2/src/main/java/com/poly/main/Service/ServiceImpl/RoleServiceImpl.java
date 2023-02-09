package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.Role;
import com.poly.main.Repository.RoleRepository;
import com.poly.main.Service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	RoleRepository roleRepository;

	public RoleServiceImpl(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}

	@Override
	public <S extends Role> S save(S entity) {
		return roleRepository.save(entity);
	}

	@Override
	public Page<Role> findAll(Pageable pageable) {
		return roleRepository.findAll(pageable);
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public List<Role> findAll(Sort sort) {
		return roleRepository.findAll(sort);
	}

	@Override
	public Optional<Role> findById(Long id) {
		return roleRepository.findById(id);
	}

	@Override
	public void flush() {
		roleRepository.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return roleRepository.existsById(id);
	}

	@Override
	public long count() {
		return roleRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		roleRepository.deleteById(id);
	}

	@Override
	public void delete(Role entity) {
		roleRepository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		roleRepository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		roleRepository.deleteAll();
	}

	@Override
	public Role getById(Long id) {
		return roleRepository.getById(id);
	}
	
}
