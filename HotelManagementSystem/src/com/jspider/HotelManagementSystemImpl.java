package com.jspider;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customException.InvalidQuantityException;

public class HotelManagementSystemImpl implements HotelManagementSystem {

	Scanner sc=new Scanner(System.in);
	Map<Integer, Food> db=new LinkedHashMap<Integer,Food>();
	int totalCost=0;
	@Override
	public void addFood() {
		db.put(1, new Food(1,"Chicken Biryani",250,5));
		db.put(2, new Food(2,"Egg Biryani",200,1));
		db.put(3, new Food(3,"Mashroom Biryani",300,2));
		db.put(4, new Food(4,"Panner",130,3));
		db.put(5, new Food(5,"Chicken 65",100,2));
		System.out.println("Food Menu is Created");
	}
	@Override
	public void displayFood() {
		Set<Integer> s=db.keySet();
		for(Integer i:s) {
			System.out.println("Enter "+i+" -->"+db.get(i));
		}
	}
	@Override
	public void orderFood() {
//		1.get the food object base on id/choice-->get
//		2.accept quantity ->set new Quantity
//		3.calculate cost.
//		4.cost-->totaBill
//		5.InvalidQuantityException
		System.out.println("Select Food:");
		int id=sc.nextInt();
		Food food=db.get(id);
		System.out.println("ordering "+food.getName());
		System.out.println("enter quantity:");
		int quantity=sc.nextInt();
		
		if(quantity<=food.getQuantity()) {
			food.setQuantity(food.getQuantity()-quantity);
			int currentCost=food.getCost()*quantity;
			totalCost+=currentCost;
			System.out.println("ordered "+quantity+" "+food.getName()+
					" with the cost of Rs."+currentCost);
		}
		else {
		try {
			throw new InvalidQuantityException("Sorry only "+food.getQuantity()+" "+food.getName()+" are available");
		}
		catch(InvalidQuantityException e) {
			System.out.println(e.getMessage());
		}
		}
	}
	@Override
	public void checkout() {
		if(totalCost!=0) {
			System.out.println("Total Bill: Rs."+totalCost);
		}
		else {
			System.out.println("No food items are available");
		}
	}
	
}
