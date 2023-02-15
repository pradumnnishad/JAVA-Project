package jspider;

import java.util.Scanner;

public class Solution {

	static Scanner sc=new Scanner(System.in);
	public static void acceptNumber() {
		
	}
	public static void main(String[] args) {
		Bank b=new BankFunction(0);
		while(true) {
		System.out.println("1.Deposit\n2.Withdraw\n3.checkBalance\n4.Exit");
		System.out.println("enter choices");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter amount to be deposit");
			b.deposit(sc.nextInt());
			break;
		case 2:
			System.out.println("enter amount to be withdrawn");
			b.withdraw(sc.nextInt());
			break;
		case 4:
			System.out.println(b.getBalance());
			break;
		case 5:
			System.out.println("thank you");
			System.exit(0);
			break;
			default: 
				System.out.println(b.displayErrorMessage());
		}
		}
//		System.out.println("*******End Of Switch Statement************");
	}

}
