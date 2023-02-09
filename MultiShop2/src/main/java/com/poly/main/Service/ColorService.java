package com.poly.main.Service;

import java.util.List;
import java.util.Optional;

import com.poly.main.Entity.Color;

public interface ColorService {

	Color getById(Long id);

	void deleteAll();

	void delete(Color entity);

	void deleteById(Long id);

	long count();

	boolean existsById(Long id);

	void flush();

	Optional<Color> findById(Long id);

	List<Color> findAll();

	<S extends Color> S save(S entity);

}
