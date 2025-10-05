import java.util.*;
public class Generics {
	public static void main(String[] args) {
		LinkedList<String> LL = new LinkedList<String>();
		// LL.add(10); Error because generics of String
		LL.add("xxx"); //implicitly the java run like this 	LL.add(new String("xxx"));
		LL.add("yyy");
		LL.add("zzz");
		System.out.println(LL);
		
		for(String s: LL)
			System.out.println(s);
	}
}
