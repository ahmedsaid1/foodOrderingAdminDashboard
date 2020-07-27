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

import com.eprogs.common.bean.ProviderBean;
import com.eprogs.common.bean.ProviderUserBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("providerUsers")
public class ProviderUserController {
	@Autowired
	BllGateway bllGateway;

	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public ProviderUserBean addProviderUser(@RequestBody ProviderUserBean providerUserBean) {
		return bllGateway.addProviderUser(providerUserBean);
	}

	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public ProviderUserBean updateProviderUser(@RequestBody ProviderUserBean providerUserBean) {
		return bllGateway.updateProviderUser(providerUserBean);
	}

	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public ProviderUserBean getProviderUser(@PathVariable Integer id) {
		return bllGateway.getProviderUser(id);
	}

	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public void deleteProviderUser(@PathVariable Integer id) {
		bllGateway.deleteProviderUser(id);
	}

	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public List<ProviderUserBean> findProviderUsers() {
		return bllGateway.findProviderUsers();
	}

}
