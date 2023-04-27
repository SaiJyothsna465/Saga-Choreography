package com.sai.saga.order.entity;

import com.sai.saga.common.event.OrderStatus;
import com.sai.saga.common.event.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PURCHASE_ORDER_TABLE")
public class PurchaseOrder {

	@Id
	@GeneratedValue
	private int id;
	private int userId;
	private int productId;
	private int price;
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
}