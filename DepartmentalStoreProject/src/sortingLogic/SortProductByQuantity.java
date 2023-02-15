package sortingLogic;

import java.util.Comparator;

import com.jspider.Product;

public class SortProductByQuantity implements Comparator<Product>{

	@Override
	public int compare(Product p1,Product p2) {
		return p1.getQuantity()-p2.getQuantity();
		}
}
