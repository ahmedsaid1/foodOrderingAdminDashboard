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

import com.eprogs.common.bean.AdminUserBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("adminUsers")
public class AdminUserController {
	@Autowired
	BllGateway bllGateway;
	
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public AdminUserBean addAdminUser(@RequestBody AdminUserBean adminUserBean) {
		return bllGateway.addAdminUser(adminUserBean);
	}
@PutMapping
@CrossOrigin(origins = "http://localhost:4200")

	public AdminUserBean updateAdminUser(@RequestBody AdminUserBean adminUserBean) {
		return bllGateway.updateAdminUser(adminUserBean);
	}
@DeleteMapping("/{id}")
@CrossOrigin(origins = "http://localhost:4200")

	public void deleteAdminUser(@PathVariable Integer id) {
		 bllGateway.deleteAdminUser(id);
	}
	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public AdminUserBean getAdminUser(@PathVariable Integer id) {
		return bllGateway.getAdminUser(id);
	}
	@GetMapping("/{name}/1")
	@CrossOrigin(origins = "http://localhost:4200")

	public AdminUserBean getAdminUser(@PathVariable String name) {
		return bllGateway.getAdminUser(name);
	}
@GetMapping
@CrossOrigin(origins = "http://localhost:4200")

	public List<AdminUserBean> findAdminUsers(){
		return bllGateway.findAdminUsers();
	}
}
