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

import com.eprogs.common.bean.OrderBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("orders")
public class OrderController {
	@Autowired
	BllGateway bllGateway;
	
	@PostMapping
	public OrderBean addOrder(@RequestBody OrderBean ordertBean) {
		return bllGateway.addOrder(ordertBean);
	}

	@PutMapping
	public OrderBean updateOrder(@RequestBody OrderBean ordertBean) {
		return bllGateway.updateOrder(ordertBean);
	}
@GetMapping("/{id}")
	public OrderBean getOrder(@PathVariable Integer id) {
		return bllGateway.getOrder(id);
	}
@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable Integer id) {
		 bllGateway.deleteOrder(id);
	}

@GetMapping
	public List<OrderBean> findOrders(){
		return bllGateway.findOrders();
	}

}
