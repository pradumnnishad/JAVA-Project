package jspider;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MovieTicket m=new Ticket(10);
		while(true) {
			System.out.println("1. BookTicket\n2.cancelTicket\n3.CheckAvailability\n4.exit");
			System.out.println("enter choices");
			int choices=sc.nextInt();
			switch(choices) {
			case 1:
				System.out.println("enter number of ticket to book");
				m.bookTicket(sc.nextInt());
				break;
			case 2:
				System.out.println("enter number of ticket to cancel");
				m.cancelTicket(sc.nextInt());
				break;
			case 3:
				System.out.println(m.displayTicket()+" remaining ticket");
				break;
			case 4:
				System.out.println("thank you..!!! &&& visit again....");
				System.exit(0);
				break;
				default:
					System.out.println(m.displayErrorMessage());
					
			}
		}

	}

}
