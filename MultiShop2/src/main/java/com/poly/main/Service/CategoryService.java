package com.poly.main.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.main.BaseResponse.BaseResponse;
import com.poly.main.Entity.Category;

@Service
public interface CategoryService {

	BaseResponse getAll();
	
	BaseResponse getById(Long id);
	
	BaseResponse create(Category category);
	
	BaseResponse update(Category category);

	BaseResponse delete(Long id);

}
