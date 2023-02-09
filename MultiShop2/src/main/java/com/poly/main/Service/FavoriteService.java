package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.poly.main.Entity.Favorite;

public interface FavoriteService {

	Favorite getById(Long id);

	void deleteAll();

	void deleteAllInBatch();

	void delete(Favorite entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	void flush();

	Optional<Favorite> findById(Long id);

	List<Favorite> findAll(Sort sort);

	List<Favorite> findAll();

	<S extends Favorite> S save(S entity);

}
