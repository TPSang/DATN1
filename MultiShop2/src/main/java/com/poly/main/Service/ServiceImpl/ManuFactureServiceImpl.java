package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.Manufacture;
import com.poly.main.Repository.ManuFactureRepository;
import com.poly.main.Service.ManuFactureService;

@Service
public class ManuFactureServiceImpl implements  ManuFactureService {
	ManuFactureRepository manuFactureRepository;

	public ManuFactureServiceImpl(ManuFactureRepository manuFactureRepository) {
		super();
		this.manuFactureRepository = manuFactureRepository;
	}

	@Override
	public <S extends Manufacture> S save(S entity) {
		return manuFactureRepository.save(entity);
	}

	@Override
	public Page<Manufacture> findAll(Pageable pageable) {
		return manuFactureRepository.findAll(pageable);
	}

	@Override
	public List<Manufacture> findAll() {
		return manuFactureRepository.findAll();
	}

	@Override
	public List<Manufacture> findAll(Sort sort) {
		return manuFactureRepository.findAll(sort);
	}

	@Override
	public Optional<Manufacture> findById(Long id) {
		return manuFactureRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return manuFactureRepository.existsById(id);
	}

	@Override
	public long count() {
		return manuFactureRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		manuFactureRepository.deleteById(id);
	}

	@Override
	public void delete(Manufacture entity) {
		manuFactureRepository.delete(entity);
	}

	@Override
	public void deleteAll() {
		manuFactureRepository.deleteAll();
	}

	@Override
	public Manufacture getById(Long id) {
		return manuFactureRepository.getById(id);
	}
	
}
