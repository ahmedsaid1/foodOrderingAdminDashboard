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

import com.eprogs.common.bean.ConsumerAddressBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("consumerAddresses")
public class ConsumerAddressControler {
	@Autowired
	BllGateway bllGateway;
	
	@PostMapping
	public ConsumerAddressBean addConsumerAddress(@RequestBody ConsumerAddressBean consumerAddressBean) {
		return bllGateway.addConsumerAddress(consumerAddressBean);
	}
@PutMapping
	public ConsumerAddressBean updateConsumerAddress(@RequestBody ConsumerAddressBean consumerAddressBean) {
		return bllGateway.updateConsumerAddress(consumerAddressBean);
	}
@DeleteMapping("{/id}")
	public void deleteConsumerAddress(@PathVariable Integer id) {
		 bllGateway.deleteConsumerAddress(id);
	}
@GetMapping("{/id}")
	public ConsumerAddressBean getConsumerAddress(@PathVariable Integer id) {
		return bllGateway.getConsumerAddress(id);
	}
@GetMapping("{/name}")

	public ConsumerAddressBean getConsumerAddress(@PathVariable String name) {
		return bllGateway.getConsumerAddress(name);
	}
@GetMapping
	public List<ConsumerAddressBean> findConsumerAddresss(){
		return bllGateway.findConsumerAddressList();
	}

}
