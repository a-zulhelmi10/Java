package filterstream;

import java.util.*;
import java.util.stream.*;

class Product {
	int pId;
	String pName;
	int pPrice;

	Product(int pId, String pName, int pPrice) {
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	Product() {
	}

	public String toString() {
		return pId + " " + pName + " " + pPrice;
	}
}

public class FilterStream {
	// create a method to add a few product using ArrayList
	private static List<Product> setProduct() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(111, "Mouse", 100));
		productList.add(new Product(222, "Keyboard", 200));
		productList.add(new Product(333, "CPU", 5000));
		productList.add(new Product(444, "Monitor", 800));
		productList.add(new Product(555, "Speakers", 600));
		productList.add(new Product(555, "Laptop", 3000));
		return productList;
	}

	public static void main(String[] args) {
		for (Product p : setProduct()) // Product p is the object from line25 (new Product(111,"Mouse",100)
			System.out.println(p);

		// traditional filter
		System.out.println("\n************Traditional filter****************");
		for (Product p : setProduct()) {
			if (p.pPrice > 500)
				System.out.println(p);
		}
		// Stream filter
		System.out.println("\n************Stream filter****************");
		List<Product> listStream = setProduct().stream().filter((p) -> p.pPrice > 500).collect(Collectors.toList());
		System.out.println(listStream);
		for (Product p:listStream)
			System.out.println(p);
	}
}
