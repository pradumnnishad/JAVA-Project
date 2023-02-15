package jspiders;

import java.util.Comparator;

public class SortEmployeeBySal implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return (int) (e1.getSal()-e2.getSal());
		//or we can use below operation to perform.
		//		Double i=e1.getSal();
		//		Double j=e2.getSal();
		//		return i.compareTo(j);
		//if return type of getSal is non-primitive Double use
		//	return x.getSal().compareTo(y.getSal());
		//	x- > object to be inserted & y- > already existing object.

	}
}
