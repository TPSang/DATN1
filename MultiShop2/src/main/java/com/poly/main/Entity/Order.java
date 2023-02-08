package com.poly.main.Entity;
// mo ta thong tin don hang va anh sang bang order trong du lieu

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="orders" )
public class Order implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;//id don hang
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;//ngay len don hang
	
	@Column(nullable = false)
	private int customerId; // don hang nay thuoc ve khach hang nao
	
	@Column(nullable = false)
	private double amout;// tong tien don hang
	
	@Column(nullable = false)
	private short status; // tong tin don hang
}
