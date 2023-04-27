package com.sai.saga.common.dto;

import com.sai.saga.common.event.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {
	private int userId;
	private int productId;
	private int amount;
	private int orderId;
	private OrderStatus orderStatus;
}
