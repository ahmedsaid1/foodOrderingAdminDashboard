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

import com.eprogs.common.bean.AreaBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("/areas")
public class AreaController {

	@Autowired
	BllGateway bllGateway;
@GetMapping("")
@CrossOrigin(origins = "http://localhost:4200")
	public List<AreaBean> all() {
		
		return bllGateway.findAreas();
	}

@GetMapping("/{id}")
@CrossOrigin(origins = "http://localhost:4200")

public AreaBean findAreaById(@PathVariable Integer id) {
	
	return bllGateway.getArea(id);
}

@PostMapping()
@CrossOrigin(origins = "http://localhost:4200")

public AreaBean add(@RequestBody AreaBean areaBean) {
	
	return bllGateway.addArea(areaBean);
}

@PutMapping
@CrossOrigin(origins = "http://localhost:4200")

public AreaBean update(@RequestBody AreaBean AreaBean) {
	
	return bllGateway.updateArea(AreaBean);
}
@DeleteMapping("/{id}")
@CrossOrigin(origins = "http://localhost:4200")
public void delete(@PathVariable Integer id) {
	
	bllGateway.deleteArea(id);
}
}
