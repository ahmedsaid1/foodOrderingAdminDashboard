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

import com.eprogs.common.bean.OrderItemBean;
import com.eprogs.spring.bll.BllGateway;

@RestController
@RequestMapping("orderItems")
public class OrderItemController {
	
	@Autowired
	BllGateway bllGateway;
	
	@PostMapping
	public OrderItemBean addOrderItemItem(@RequestBody OrderItemBean orderItemBean) {
		return bllGateway.addOrderItem(orderItemBean);
	}

	@PutMapping
	public OrderItemBean updateOrderItem(@RequestBody OrderItemBean orderItemBean) {
		return bllGateway.updateOrderItem(orderItemBean);
	}
@GetMapping("/{id}")
	public OrderItemBean getOrderItem(@PathVariable Integer id) {
		return bllGateway.getOrderItem(id);
	}
@DeleteMapping("/{id}")
	public void deleteOrderItem(@PathVariable Integer id) {
		 bllGateway.deleteOrderItem(id);
	}

@GetMapping
	public List<OrderItemBean> findOrderItems(){
		return bllGateway.findOrderItems();
	}

}
