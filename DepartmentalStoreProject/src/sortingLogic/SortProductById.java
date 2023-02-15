package sortingLogic;

import java.util.Comparator;

import com.jspider.Product;

public class SortProductById implements Comparator<Product> {

	@Override
	public int compare(Product p1,Product p2) {
		return p1.getId().compareTo(p2.getId());
	}
}
