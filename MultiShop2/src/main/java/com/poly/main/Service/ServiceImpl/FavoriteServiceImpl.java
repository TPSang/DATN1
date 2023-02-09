package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.main.Entity.Favorite;
import com.poly.main.Repository.FavoriteRepository;
import com.poly.main.Service.FavoriteService;

@Service
public class FavoriteServiceImpl implements FavoriteService {
	FavoriteRepository favoriteRepository;

	public FavoriteServiceImpl(FavoriteRepository favoriteRepository) {
		super();
		this.favoriteRepository = favoriteRepository;
	}

	@Override
	public <S extends Favorite> S save(S entity) {
		return favoriteRepository.save(entity);
	}

	@Override
	public List<Favorite> findAll() {
		return favoriteRepository.findAll();
	}

	@Override
	public List<Favorite> findAll(Sort sort) {
		return favoriteRepository.findAll(sort);
	}

	@Override
	public Optional<Favorite> findById(Long id) {
		return favoriteRepository.findById(id);
	}

	@Override
	public void flush() {
		favoriteRepository.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return favoriteRepository.existsById(id);
	}

	@Override
	public long count() {
		return favoriteRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		favoriteRepository.deleteById(id);
	}

	@Override
	public void delete(Favorite entity) {
		favoriteRepository.delete(entity);
	}

	@Override
	public void deleteAllInBatch() {
		favoriteRepository.deleteAllInBatch();
	}

	@Override
	public void deleteAll() {
		favoriteRepository.deleteAll();
	}

	@Override
	public Favorite getById(Long id) {
		return favoriteRepository.getById(id);
	}
	
}
