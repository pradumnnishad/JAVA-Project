package jspiders;

import java.util.Scanner;

public class Solution {

	static Scanner sc=new Scanner(System.in);
	static int a;
	static int b;
		static void acceptNumber() {
			System.out.println("enter 1st number:");
			a=sc.nextInt();
			System.out.println("enter 2nd number");
			b=sc.nextInt();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new CalculatorImplementation();
		while(true) {
		System.out.println("1:Addition\n2:Substraction\n3:Multiplication");
		System.out.println("4:Division\n5:Exit");
		System.out.println("enter choices");
		int choice=sc.nextInt();
		if(choice>=1 && choice<=4) {
			acceptNumber();
		}
		switch(choice) {
		case 1: System.out.println(c.add(a, b));
		break;
		case 2:
			System.out.println(c.sub(a,b));
			break;
		case 3:System.out.println(c.mul(a,b));
			break;
		case 4: System.out.println(c.div(a,b));
			break;
		case 5:
			System.out.println("Thank You");
			System.exit(0);
			break;
		default:System.out.println(c.displayErrorMessage());
		
		}
		System.out.println("---------------------------------");
		
	}
	}

}
