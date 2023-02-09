package com.poly.main.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poly.main.Entity.Color;
import com.poly.main.Repository.ColorRepository;
import com.poly.main.Service.ColorService;

@Service
public class ColorServiceImpl implements ColorService {
	ColorRepository colorRepository ;

	public ColorServiceImpl(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	@Override
	public <S extends Color> S save(S entity) {
		return colorRepository.save(entity);
	}

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}

	@Override
	public Optional<Color> findById(Long id) {
		return colorRepository.findById(id);
	}

	@Override
	public void flush() {
		colorRepository.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return colorRepository.existsById(id);
	}

	@Override
	public long count() {
		return colorRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		colorRepository.deleteById(id);
	}

	@Override
	public void delete(Color entity) {
		colorRepository.delete(entity);
	}

	@Override
	public void deleteAll() {
		colorRepository.deleteAll();
	}

	@Override
	public Color getById(Long id) {
		return colorRepository.getById(id);
	}
	
}
