package com.portfolio.course.entities;

import java.util.Objects;

public class OrderItem {
	
	private Product product;
	private Integer quantity;
	
	public OrderItem() {
		
	}
	
	
	
	
	public OrderItem(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}




	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}




	@Override
	public int hashCode() {
		return Objects.hash(product, quantity);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(product, other.product) && Objects.equals(quantity, other.quantity);
	}




	@Override
	public String toString() {
		return "OrderItem [product=" + product + ", quantity=" + quantity + "]";
	}
	
	public double subTotal() {
		double total;
		total = product.getPrice()*quantity;
		
		return total;
	}
	
	
	
	
}
