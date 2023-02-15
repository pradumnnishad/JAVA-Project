package com.jspider;

public class Product {

	private String id;
	private String name;
	private int cost;
	private int quantity;
	private static int count=101;
	public Product(String name,int cost,int quantity){
		this.id="JSP"+count;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
		count++;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	@Override
	public String toString() {
		return "id: "+id+ "\nName: "+name+"\nCost: "+cost+"\nQuantity: "+quantity;
	}


}
