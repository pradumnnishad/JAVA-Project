package jspider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Student s1=new Student(101, "Ashish", 95);
		Student s2=new Student(105, "Jitesh", 98);
		Student s3=new Student(103, "Chira", 85);
		Student s4=new Student(102, "Kamal", 95);
		Student s5=new Student(104, "Siva", 99);
		Map<Integer,Student> map=new LinkedHashMap<Integer,Student>();
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		map.put(s5.getId(), s5);
		Set<Integer> s=map.keySet();
		
		for(int i:s) {
			System.out.println(i+" "+map.get(i));
		}
		System.out.println("------------------------");
		List<Student> l=new ArrayList<Student>();
		for(int i:s) {
//			l.add(map.get(i));
			Student obj=map.get(i);
			l.add(obj);
		}
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Sort by id\n2.Sort BY name\n3.Sort by Marks");
			System.out.println("Exit");
			System.out.println("enter choice to sort");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(l,new SortById());
				for(Student st:l) {
					System.out.println(st);
				}
				break;
			case 2:
				Collections.sort(l,new SortByName());
				for(Student st:l) {
					System.out.println(st);
				}
				break;
			case 3:
				Collections.sort(l,new SortbyMarks());
				for(Student st:l) {
					System.out.println(st);
				}
				break;
			case 4:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("invalid choice");
				
			}
		}
		
	}

}
