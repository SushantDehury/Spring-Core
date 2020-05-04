package com.nt.beans;

public class Shopping {
	private Order order;
	private String ordersType;
	private int totalOrder;
	private int totalprice;
	private String local;
	
	public void setLocal(String local) {
		this.local = local;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void setOrdersType(String ordersType) {
		this.ordersType = ordersType;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "Shopping [order=" + order + ", ordersType=" + ordersType + ", totalOrder=" + totalOrder
				+ ", totalprice=" + totalprice + ", local=" + local + "]";
	}
	
	

}
