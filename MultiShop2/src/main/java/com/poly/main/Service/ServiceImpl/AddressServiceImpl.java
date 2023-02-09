package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.Address;
import com.poly.main.Repository.AddressRepository;
import com.poly.main.Service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	AddressRepository 	addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public <S extends Address> S save(S entity) {
		return addressRepository.save(entity);
	}

	@Override
	public Page<Address> findAll(Pageable pageable) {
		return addressRepository.findAll(pageable);
	}

	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public List<Address> findAll(Sort sort) {
		return addressRepository.findAll(sort);
	}

	@Override
	public Optional<Address> findById(Long id) {
		return addressRepository.findById(id);
	}

	@Override
	public void flush() {
		addressRepository.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return addressRepository.existsById(id);
	}

	@Override
	public long count() {
		return addressRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		addressRepository.deleteById(id);
	}

	@Override
	public void delete(Address entity) {
		addressRepository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		addressRepository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		addressRepository.deleteAll();
	}

	@Override
	public Address getById(Long id) {
		return addressRepository.getById(id);
	}
	
}
