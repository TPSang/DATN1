package com.poly.main.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/categories")
public class CategoryController {
	@GetMapping("add")
	public String add() {
		return "admin/categories/add";
}
	@GetMapping("edit/{categoriesId}")
	public String edit() {
		return "admin/categories/edit";
	}
	@GetMapping("delete/{categoriesId}")
	public String delete() {
		return "redirect:/admin/categories/list";
	}
	@GetMapping("saveOrUpdate")
	public String saveOrUpdate() {
		return "admin/categories/list";
		
	}
	@GetMapping("")
	public String list() {
		return "admin/categories/list";
	}
	@GetMapping("search")
	public String search() {
		return "admin/categories/search";
	}
	
}
