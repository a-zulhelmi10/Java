package randomtest;

import java.util.*;
import java.util.stream.*;

class Car {
	String brand;
	String plate;
	int price;

	Car(String brand, String plate, int price) {
		this.brand = brand;
		this.plate = plate;
		this.price = price;
	}

	Car() {
	}

	public String toString() {
		return brand + " " + plate + " " + price;
	}
}

public class RandomTest {
	public static void main(String[] args) {
		/*System.out.println(carDetails());
		System.out.println("\n*****************************");
		for (Car c:carDetails())
			System.out.println(c);*/
		
		//filter only prive above 
		System.out.println("\n***********filter using Stream************");
		List<Car> l2 = carDetails().stream().filter((x)->(x.brand=="Volvo")&&(x.price>100000)).collect(Collectors.toList());
		System.out.println(l2);
		for (Car c:l2)
			System.out.println(c);
	}

	// create ArrayList to store the car details
	public static List<Car> carDetails() {
		List<Car> list = new ArrayList<Car>();
		list.add(new Car("Toyota", "JVL2963", 69000));
		list.add(new Car("Perodua", "JXX4146", 40000));
		list.add(new Car("Proton", "VMP2112", 30000));
		list.add(new Car("Merc", "JXL3469", 195000));
		list.add(new Car("Volvo", "JJU4116", 89000));
		list.add(new Car("Volvo", "JPO8220", 110000));
		list.add(new Car("Volvo", "JRU7412", 169000));
		list.add(new Car("Proton", "Jkk5149", 89000));
		return list;
	}
}