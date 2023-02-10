package com.poly.main.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poly.main.Service.CategoryService;
import com.poly.main.BaseResponse.BaseResponse;
import com.poly.main.Entity.Category;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/getAll")
	public ResponseEntity<BaseResponse> getAll() {
		BaseResponse baseResponse = new BaseResponse();
		try {
			return ResponseEntity.ok().body(categoryService.getAll());
		} catch (Exception e) {
			// TODO: handle exception
			baseResponse.setCode("-1");
			baseResponse.setMessage("Failed to find data");
			return ResponseEntity.badRequest().body(baseResponse);
		}

	}

	@PostMapping("/create")
	public ResponseEntity<BaseResponse> create(@RequestBody Category category) {
		BaseResponse baseResponse = new BaseResponse();
		try {
			return ResponseEntity.ok().body(categoryService.create(category));
		} catch (Exception e) {
			// TODO: handle exception
			baseResponse.setCode("-1");
			baseResponse.setMessage("Failed to create ");
			return ResponseEntity.badRequest().body(baseResponse);
		}
	}

	@PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody Category category) {
		BaseResponse baseResponse = new BaseResponse();
		try {
			return ResponseEntity.ok().body(categoryService.update(category));
		} catch (Exception e) {
			// TODO: handle exception
			baseResponse.setCode("-1");
			baseResponse.setMessage("Failed to update ");
			return ResponseEntity.badRequest().body(baseResponse);
		}
	}

	@PostMapping("/delete")
	public ResponseEntity<BaseResponse> delete(@RequestParam("id") Optional<Long> id) {
		BaseResponse baseResponse = new BaseResponse();
		Long Cid = id.orElse(null);
		try {
			return ResponseEntity.ok().body(categoryService.delete(Cid));
		} catch (Exception e) {
			// TODO: handle exception
			baseResponse.setCode("-1");
			baseResponse.setMessage("Failed to delete ");
			return ResponseEntity.badRequest().body(baseResponse);
		}
	}
}