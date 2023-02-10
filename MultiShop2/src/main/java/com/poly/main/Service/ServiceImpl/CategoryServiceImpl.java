package com.poly.main.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.main.BaseResponse.BaseResponse;
import com.poly.main.Entity.Category;
import com.poly.main.Repository.CategoryRepository;
import com.poly.main.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public BaseResponse getAll() {
		return new BaseResponse("1", "Find Success Data", categoryRepository.findAll());
	}

	@Override
	public BaseResponse getById(Long id) {
		return new BaseResponse("1", "Find Success Data", categoryRepository.findById(id));
	}

	@Override
	public BaseResponse create(Category category) {
		categoryRepository.save(category);
		return new BaseResponse("1", "Create Success", category);
	}

	@Override
	public BaseResponse update(Category category) {
		if (categoryRepository.getById(category.getId()) != null) {
			categoryRepository.save(category);
			return new BaseResponse("1", "Update Success", category);
		}
		return new BaseResponse("-1","Update Fail !");
	}

	@Override
	public BaseResponse delete(Long id) {
		if(categoryRepository.getById(id)!= null) {
			categoryRepository.deleteById(id);
			return new BaseResponse("1","Delete Success");
		}
		return new BaseResponse("-1","Delete fail");
	}

	
	
}
