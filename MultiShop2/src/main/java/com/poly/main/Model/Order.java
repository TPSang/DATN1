package com.poly.main.Model;
// mo ta thong tin don hang va anh sang bang order trong du lieu

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private int orderId;//id don hang
	private Date orderDate;//ngay len don hang
	private int customerId; // don hang nay thuoc ve khach hang nao
	private double amout;// tong tien don hang
	private short status; // tong tin don hang
}
