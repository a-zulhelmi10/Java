import java.util.*;
import java.util.stream.*;

public class WaysOfTraversingIterating {
	public static void main(String[] args) {
		List<String> list1 = List.of("apple", "mango", "orange");     //List.of() method is static members thats why we can invoke without object
		
		//traditional
		for(int i=0; i<list1.size(); i++) 
			System.out.println(list1.get(i));
		
		//Enhanced for loop
		for(String s : list1)
			System.out.println(s);
		
		//foreach
		list1.forEach(s -> System.out.println(s)); //or
		list1.forEach((String s)->{
			System.out.println(s);
		});
		
		//Method reference
		list1.forEach(System.out::println);
	}
}
