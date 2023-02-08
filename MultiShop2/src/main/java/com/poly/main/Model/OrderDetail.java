package com.poly.main.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// luu thong tin chi tiet don hang

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
	private int orderDetailId;
	private int orderId;// orderDetail thuoc ve orderid
	private int productId;// product thuoc ve id nao
	private int quantity;
	private double unitPrice;
}
