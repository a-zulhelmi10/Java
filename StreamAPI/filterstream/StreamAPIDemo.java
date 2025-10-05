package filterstream;
import java.util.*;
import java.util.stream.*;

public class StreamAPIDemo {
	public static void main(String[] args) {
		List<String> list1 = List.of("apple", "mango", "orange");

		// Creating Stream from List
		System.out.println("Create stream from List");
		Stream<String> s = list1.stream();
		/*
		 * System.out.println(s); remember if you print variable from object, you will
		 * get hashcode if you dont invoke the toString() method
		 */
		list1.forEach(System.out::println);

		// create stream from Set
		System.out.println("Create stream from Set");
		Set<String> set = new HashSet<String>(list1); // first we convert List to HashSet
		Stream<String> s2 = set.stream();
		s2.forEach(System.out::println);

		// create stream from Array (New Example)
		System.out.println("Create stream from Array");
		String[] arrayString = {"xxx","yyy","zzz"};
		Stream<String> s3 = Arrays.stream(arrayString); //its not arrayString.stream();
		s3.forEach(System.out::println);

	}
}
