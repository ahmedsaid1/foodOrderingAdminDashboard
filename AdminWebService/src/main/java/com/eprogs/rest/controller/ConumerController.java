package com.eprogs.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eprogs.common.bean.ConsumerBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("consumers")
public class ConumerController {
	
	@Autowired
	BllGateway bllGateway;
	
	@PostMapping
	public ConsumerBean addConsumer(@RequestBody ConsumerBean consumerBean) {
		return bllGateway.addConsumer(consumerBean);
	}
@PutMapping
	public ConsumerBean updateConsumer(@RequestBody ConsumerBean consumerBean) {
		return bllGateway.updateConsumer(consumerBean);
	}
@DeleteMapping("{/id}")
	public void deleteConsumer(@PathVariable Integer id) {
		 bllGateway.deleteConsumer(id);
	}
@GetMapping("{/id}")
	public ConsumerBean getConsumer(@PathVariable Integer id) {
		return bllGateway.getConsumer(id);
	}
@GetMapping("{/name}")

	public ConsumerBean getConsumer(@PathVariable String name) {
		return bllGateway.getConsumer(name);
	}
@GetMapping
	public List<ConsumerBean> findConsumers(){
		return bllGateway.findConsumers();
	}

}
