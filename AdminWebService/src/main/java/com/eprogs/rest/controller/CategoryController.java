package com.eprogs.rest.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eprogs.common.bean.CategoryBean;
import com.eprogs.common.bean.ProductBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	BllGateway bllGateway;
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public CategoryBean addCategory(@RequestBody CategoryBean categoryBean) {
		return bllGateway.addCategory(categoryBean);
	}
	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public CategoryBean updateCategory(@RequestBody CategoryBean categoryBean) {
		
		return bllGateway.updateCategory(categoryBean);
	}
	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

public CategoryBean getCategory(@PathVariable Integer id) {
	return bllGateway.getCategory(id);
}
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public void deleteCategory(@PathVariable Integer id) {
		bllGateway.deleteCategory(id);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public List<CategoryBean> findCategories(){
		return bllGateway.findCategories();
	}
	
	@GetMapping("/{id}/products")
	@CrossOrigin(origins = "http://localhost:4200")

	public Set<ProductBean> findproducts(@PathVariable Integer id){
		return bllGateway.findCatProducts(id);
	}
}
