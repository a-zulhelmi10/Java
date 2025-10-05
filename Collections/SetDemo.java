import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		//HashSet -unordered
		HashSet hs = new HashSet();
		hs.add("Speakers");
		hs.add("Monitor");
		hs.add("CPU");
		hs.add("Keyboard");
		hs.add("Keyboard"); //no duplicate 
		System.out.println(hs); //[Monitor, Keyboard, CPU, Speakers]

		//LinkedHashSet -ordered
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Speakers");
		lhs.add("Monitor");
		lhs.add("CPU");
		lhs.add("Keyboard");
		System.out.println(lhs); //[Speakers, Monitor, CPU, Keyboard] Ordered
	
		//TreeSet - sorted
		TreeSet ts = new TreeSet();
		ts.add("Speakers");
		ts.add("Monitor");
		ts.add("CPU");
		ts.add("Keyboard");
		System.out.println(ts); //default: Ascending
		System.out.println(ts.descendingSet()); //descending
	}
}
