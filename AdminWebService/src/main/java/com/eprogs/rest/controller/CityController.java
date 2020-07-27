package com.eprogs.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eprogs.common.bean.AreaBean;
import com.eprogs.common.bean.CityBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("/cities")
public class CityController {
	@Autowired
	BllGateway bllGateway;
@GetMapping("")
@CrossOrigin(origins = "http://localhost:4200")

	public List<CityBean> all() {
		
		return bllGateway.findCities();
	}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/{id}")
public CityBean findcityById(@PathVariable Integer id) {
	
	return bllGateway.getCity(id);
}

@PostMapping()
@CrossOrigin(origins = "http://localhost:4200")

public CityBean add(@RequestBody CityBean cityBean) {
	
	return bllGateway.addCity(cityBean);
}

@RequestMapping(value = "", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200")

public CityBean update(@RequestBody CityBean cityBean) {
	
	return bllGateway.updateCity(cityBean);
}
@DeleteMapping("/{id}")
@CrossOrigin(origins = "http://localhost:4200")

public void delete(@PathVariable Integer id) {
	
	bllGateway.deleteCity(id);
}
@GetMapping("/{id}/areas")
@CrossOrigin(origins = "http://localhost:4200")
public List<AreaBean> getCityAreas(@PathVariable Integer id){
	return bllGateway.getCityAreas(id);
}
}
