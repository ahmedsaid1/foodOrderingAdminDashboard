package com.eprogs.rest.controller;

import java.util.List;

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

import com.eprogs.common.bean.ProductBean;
import com.eprogs.spring.bll.BllGateway;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/products")
@Api(value = "Product",description = "Product API")
public class ProductController {
	@Autowired
	BllGateway bllGateway;

	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public ProductBean addProduct(@RequestBody ProductBean productBean) {
		return bllGateway.addProduct(productBean);
	}

	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public ProductBean updateProduct(@RequestBody ProductBean productBean) {
		return bllGateway.updateProduct(productBean);
	}

	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public ProductBean getProduct(@PathVariable Integer id) {
		return bllGateway.getProduct(id);
	}

	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public void deleteProduct(@PathVariable Integer id) {
		bllGateway.deleteProduct(id);
	}

	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
@ApiOperation(value = "View List of Products",response = ProductBean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,message = "successfully retrived list"),
			@ApiResponse(code = 401,message = "you are not authorized to view the resource"),
			@ApiResponse(code = 403,message = "Accising this resource is forbiden"),
			@ApiResponse(code = 404,message = "the resource is not found"),
	})
	public List<ProductBean> findProducts() {
		return bllGateway.findProducts();
	}

}
