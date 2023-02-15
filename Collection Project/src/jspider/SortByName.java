package jspider;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o3, Student o4) {
		// TODO Auto-generated method stub
		return o3.getName().compareTo(o4.getName());
	}

	

}
