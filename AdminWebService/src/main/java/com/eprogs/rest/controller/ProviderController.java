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
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("providers")
public class ProviderController {
	@Autowired
	BllGateway bllGateway;
	
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public ProviderBean addProvider(@RequestBody ProviderBean providerBean) {
		return bllGateway.addProvider(providerBean);
		}
	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public ProviderBean updateProvider(@RequestBody ProviderBean providerBean ) {
		return bllGateway.updateProvider(providerBean);
	}
	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public ProviderBean getProvider(@PathVariable Integer id) {
		return bllGateway.getProvider(id);
	}
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public void deleteProvider(@PathVariable Integer id) {
		 bllGateway.deleteProvider(id);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")

	public List<ProviderBean> findProviders(){
		return bllGateway.findProviders();
	}

}
