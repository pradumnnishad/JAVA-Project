package jspider;

import java.util.Comparator;

public class SortbyMarks implements Comparator<Student> {

	@Override
	public int compare(Student o5, Student o6) {
		// TODO Auto-generated method stub
		return o5.getMarks()-o6.getMarks();
	}

}
