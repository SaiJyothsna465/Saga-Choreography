package com.sai.saga.common.event;

import java.util.Date;
import java.util.UUID;

import com.sai.saga.common.dto.OrderRequestDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderEvent implements Event {
	
	private UUID eventId = UUID.randomUUID();
	private Date eventDate = new Date();
	private OrderRequestDto orderRequestDto;
	private OrderStatus orderStatus;

	public OrderEvent(OrderRequestDto orderRequestDto, OrderStatus orderStatus) {
		this.orderRequestDto = orderRequestDto;
		this.orderStatus = orderStatus;
	}

	@Override
	public UUID getEventId() {
		return eventId;
	}

	@Override
	public Date getDate() {
		return eventDate;
	}

}
