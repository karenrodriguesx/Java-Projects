package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private String order_number;
	private Date moment;
	private OrderStatus status;
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order () {
	}

	public Order(Integer id, String order_number, Date moment, OrderStatus status) {
		this.id = id;
		this.order_number = order_number;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	
	@Override
	public String toString() {
		return "\nOrder data: \nID: "+ id + "\nYou asked: " + order_number +"\nDate and hour: " + sdf.format(moment) + "\nStatus: " + status;
	}

	
	
	
}
