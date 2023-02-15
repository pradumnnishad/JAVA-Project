package jspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1=new Employee("Pradumn", 99.99);
		Employee emp2=new Employee("Ashish", 2.5);
		Employee emp3= new Employee("Jitesh",10.5);

		//creating the instance of LinkedHashMap and upcasting from linkedHashMap to map.

		Map<String,Employee> map=new LinkedHashMap<String,Employee>();
		map.put(emp1.getName(), emp1);
		map.put(emp2.getName(), emp2);
		map.put(emp3.getName(), emp3);

		//Converting map into the set of keys

		Set<String> s=map.keySet();

		//creating the instance of ArrayList and upcasting from ArrayList to List.	

		List<Employee> l=new ArrayList<Employee>();

		//or we can also add Employee object

		//storing employee object from map to ArrayList.

		for(String str:s) {
			//or we can also add Employee object

			l.add(map.get(str));
		}

		//traversing the employee object from ArrayList

		while(true) {
			System.out.println("1.SortByName\n2.SortBySal\n3.Exit");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			System.out.println("enter choice");
			switch(choice) {
			case 1:
				Collections.sort(l,new SortEmployeeByName());
				for(Employee e:l) {
					System.out.println(e);
				}
				break;
			case 2:
				Collections.sort(l,new SortEmployeeBySal());
				for(Employee e:l) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Thak You");
				System.exit(0);
				break;
			default:
				try {
					throw new InvalidChoiceException("invalid choice");
				}
				catch(InvalidChoiceException i) {
					System.out.println(i.getMessage());
				}
			}
		}
	}

}
