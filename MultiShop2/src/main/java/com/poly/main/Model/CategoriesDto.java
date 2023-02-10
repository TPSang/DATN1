package com.poly.main.Model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import com.poly.main.Entity.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class CategoriesDto implements Serializable {
	@NotEmpty
	private int id;
	@NotEmpty
	@Min(value = 5)
	private String name;

	private MultipartFile image;
	
}
