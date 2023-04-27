package com.sai.saga.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.saga.common.dto.OrderRequestDto;
import com.sai.saga.order.entity.PurchaseOrder;
import com.sai.saga.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderservice;

	@PostMapping("/create")
	public PurchaseOrder createOrder(@RequestBody OrderRequestDto orderRequestDto) {
		return orderservice.createOrder(orderRequestDto);
	}

	@GetMapping("/")
	public List<PurchaseOrder> getorder() {
		return orderservice.getAllOrders();
	}

}