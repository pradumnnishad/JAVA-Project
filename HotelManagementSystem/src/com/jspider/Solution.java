package com.jspider;

import java.util.Scanner;

import com.customException.InvalidChoiceException;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome to the XYZ Hotel");
		System.out.println("--------------------------");
		Scanner sc=new Scanner(System.in);
		HotelManagementSystem hm=new HotelManagementSystemImpl();
		hm.addFood();
		System.out.println("-------------------");
		int input=1;
		while(input==1) {
		System.out.println("1.Order Food\n2.CheckOut");
		System.out.println("enter choice");
		int choice=sc.nextInt();
		System.out.println("-------------------");
		switch(choice) {
		case 1:
			hm.displayFood();
			hm.orderFood();
			break;
		case 2:
			hm.checkout();
			System.out.println("Thank You....!!!!");
			System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice!!!");
				}
				catch (InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
		}// end of switch 
		System.out.println("---------------------");
		System.out.println("Enter 1 to continue Any other number to exit");
		input=sc.nextInt();
		
	}  // end of while loop
		hm.checkout();
		System.out.println("Thank You...!!!");
	}

}
