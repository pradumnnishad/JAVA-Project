package com.jspider;

import java.util.Scanner;

import com.customexception.InvalidChoiceException;

public class Solution {
	public static void displayMenu() {
		System.out.println("1.Add Product\n2.Remove Product\n3.Remove All Product");
		System.out.println("4.Display Product\n5.Display All Product\n6.Update Product");
		System.out.println("7.Count Product\n8.Sort Product\n9.Exit");
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		DepartmentalStore dept=new DepartmentalStoreImp();
		System.out.println("Welcome To Departmental Store");
		System.out.println("---------------------------------");
		while(true) {
			displayMenu();
			System.out.println("enter the choice:");
			int choice=sc.nextInt(); // Integer.parseInt(sc.next());

			switch(choice) {
			case 1:
				dept.addProduct();
				break;
			case 2:
				dept.removeProduct();
				break;
			case 3:
				dept.removeAllProduct();
				break;
			case 4:
				dept.displayProduct();
				break;
			case 5:
				dept.displayAllProducts();
				break;
			case 6:
				dept.updateProduct();
				break;
			case 7:
				dept.countProduct();;
				break;
			case 8:
				dept.sortProduct();;
				break;
			case 9:
				System.out.println("Thank You...!!!! and Visit Again....!!!");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid choice");
				}
				catch(InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}

			}
			System.out.println("----------------------");
		}
	}

}
