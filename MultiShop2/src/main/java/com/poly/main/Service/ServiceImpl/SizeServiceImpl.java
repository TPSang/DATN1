package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.Size;
import com.poly.main.Repository.SizeRepository;
import com.poly.main.Service.SizeService;

@Service
public class SizeServiceImpl implements SizeService {
	SizeRepository sizeRepository;

	public SizeServiceImpl(SizeRepository repository) {
		super();
		this.sizeRepository = repository;
	}

	@Override
	public <S extends Size> S save(S entity) {
		return sizeRepository.save(entity);
	}

	@Override
	public Page<Size> findAll(Pageable pageable) {
		return sizeRepository.findAll(pageable);
	}

	@Override
	public List<Size> findAll() {
		return sizeRepository.findAll();
	}

	@Override
	public List<Size> findAll(Sort sort) {
		return sizeRepository.findAll(sort);
	}

	@Override
	public Optional<Size> findById(Long id) {
		return sizeRepository.findById(id);
	}

	@Override
	public <S extends Size> List<S> saveAll(Iterable<S> entities) {
		return sizeRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		sizeRepository.flush();
	}

	@Override
	public <S extends Size> S saveAndFlush(S entity) {
		return sizeRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return sizeRepository.existsById(id);
	}

	@Override
	public <S extends Size> List<S> saveAllAndFlush(Iterable<S> entities) {
		return sizeRepository.saveAllAndFlush(entities);
	}

	@Override
	public long count() {
		return sizeRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		sizeRepository.deleteById(id);
	}

	@Override
	public void delete(Size entity) {
		sizeRepository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		sizeRepository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		sizeRepository.deleteAll();
	}

	@Override
	public Size getById(Long id) {
		return sizeRepository.getById(id);
	}
	
}
