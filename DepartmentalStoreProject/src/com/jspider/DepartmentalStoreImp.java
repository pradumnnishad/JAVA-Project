package com.jspider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customexception.InvalidChoiceException;
import com.customexception.ProductNotFoundException;

import sortingLogic.SortProductByCost;
import sortingLogic.SortProductById;
import sortingLogic.SortProductByName;
import sortingLogic.SortProductByQuantity;

public class DepartmentalStoreImp implements DepartmentalStore{
	Scanner sc=new Scanner(System.in);
	Map<String,Product> db=new LinkedHashMap<String,Product>();
	@Override
	public void addProduct() {

		System.out.println("enter the product:");
		String name=sc.next();
		System.out.println("enter the cost of product:");
		int cost=sc.nextInt();
		System.out.println("enter how much quantity need:");
		int quantity=sc.nextInt();

		Product pro=new Product(name, cost, quantity);
		db.put(pro.getId(), pro);
		System.out.println("Product added successfully");

	}
	@Override
	public void removeProduct() {
		System.out.println("enter the product id:");
		String id=sc.next();
		id=id.toUpperCase();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("product is removed");
		}
		else {
			try {
				throw new ProductNotFoundException("Product not found");
			}
			catch(ProductNotFoundException p) {
				System.out.println(p.getMessage());
			}
		}
	}
	@Override
	public void removeAllProduct() {
		db.clear();
		System.out.println("products are deleted");
	}
	@Override
	public void displayProduct() {

		System.out.println("enter Student id");
		String id=sc.next();
		id=id.toUpperCase();
		if(db.containsKey(id)) {
			//			we can also get in below format
			System.out.println(db.get(id));
			//			Product pro=db.get(id);
			//			System.out.println("Product id is:"+pro.getId());
			//			System.out.println("Product name is:"+pro.getName());
			//			System.out.println("Product cost is:"+pro.getCost());
			//			System.out.println("Product quantity is:"+pro.getQuantity());
		}
		else {
			try {
				throw new ProductNotFoundException("Product not available");
			}
			catch(ProductNotFoundException p) {
				System.out.println(p.getMessage());
			}
		}
	}
	@Override
	public void displayAllProducts() {

		Set<String> s=db.keySet();
		System.out.println("products are:-");
		for(String str:s) {
			System.out.println(db.get(str));
			System.out.println("-----------------");
			//			Product p=db.get(str);
			//			System.out.println(p);
		}
	}
	@Override
	public void updateProduct() {
		System.out.println("enter the choice");
		String id=sc.next().toUpperCase();
		if(db.containsKey(id)) {
			Product pro=db.get(id);
			while(true) {
				System.out.println("enter the choice");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("enter the name to change product");
					String name=sc.next();
					pro.setName(name);
					System.out.println("name of product is updated");
					break;
				case 2:
					System.out.println("enter the cost to change");
					int cost=sc.nextInt();
					pro.setCost(cost);
					System.out.println("cost of product is updated");
					break;
				case 3:
					System.out.println("enter quantity to change");
					int quantity=sc.nextInt();
					pro.setQuantity(quantity);
					System.out.println("quantity of product is updated");
					break;
				case 4:
					System.out.println("thank you...!!!!");
					System.exit(0);
					break;
				default:
					try {
						throw new InvalidChoiceException("Invalid choice");
					}
					catch(InvalidChoiceException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
		else {
			try {
				throw new ProductNotFoundException("Product not found ");

			}
			catch(ProductNotFoundException p) {
				System.out.println(p.getMessage());
			}
		}


	}
	@Override
	public void countProduct() {

		System.out.println(db.size()+" items are available in your cart");	
	}
	@Override
	public void sortProduct() {
		Set<String> s=db.keySet();

		List<Product> pro=new ArrayList<Product>();
		for(String str:s) {
			pro.add(db.get(str));
		}
		System.out.println("1.Sort in ascending order\n2.Sort in Descending order");
		System.out.println("enter input");
		int input=sc.nextInt();
		if(input==1) {
		System.out.println("1.Sort By Product ID\n2.Sort By Product name");
		System.out.println("3.Sort Product by cost\n4.Sort Product by Quantity");
		System.out.println("5.Exit");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(pro,new SortProductById());
			display(pro);
			break;
		case 2:
			Collections.sort(pro,new SortProductByName());
			display(pro);
			break;
		case 3:
			Collections.sort(pro,new SortProductByCost());
			display(pro);
			break;
		case 4:
			Collections.sort(pro,new SortProductByQuantity());
			display(pro);
			break;
		case 5:
			System.out.println("Thank you...!!!");
			System.exit(0);
			break;
		default:
			try {
				throw new InvalidChoiceException("Invalid choice");
			}
			catch(InvalidChoiceException e) {
				System.out.println(e.getMessage());
			}
		}
		}
		else if(input==2){
			System.out.println("1.Sort By Product ID\n2.Sort By Product name");
			System.out.println("3.Sort Product by cost\n4.Sort Product by Quantity");
			System.out.println("5.Exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(pro,new SortProductById());
				Collections.reverse(pro);
				display(pro);
				break;
			case 2:
				Collections.sort(pro,new SortProductByName());
				Collections.reverse(pro);
				display(pro);
				break;
			case 3:
				Collections.sort(pro,new SortProductByCost());
				Collections.reverse(pro);
				display(pro);
				break;
			case 4:
				Collections.sort(pro,new SortProductByQuantity());
				Collections.reverse(pro);
				display(pro);
				break;
			case 5:
				System.out.println("Thank you...!!!");
				System.exit(0);
				break;
			default:
				try {
					throw new InvalidChoiceException("Invalid choice");
				}
				catch(InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	private static void display(List<Product> prod) {
		for(Product p:prod) {
			System.out.println(p);
		}
	}
}
