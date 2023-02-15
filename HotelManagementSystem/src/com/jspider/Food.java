package com.jspider;

public class Food {

	private int id;
	private String name;
	private int cost;
	private int quantity;
	
	Food(int id,String name,int cost,int quantity){
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	
}
