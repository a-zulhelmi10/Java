import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		// HashMap
		HashMap hm = new HashMap();
		hm.put("Speakers", 900);
		hm.put("Monitor", 2000);
		hm.put("CPU", 5000);
		hm.put("Keyboard", 500);
		hm.put("Keyboard", 400);
		System.out.println(hm); // unordered & no duplicates

		// LinkedHashMap
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Speakers", 900);
		lhm.put("Monitor", 2000);
		lhm.put("CPU", 5000);
		lhm.put("Keyboard", 500);
		lhm.put("Keyboard", 500);
		System.out.println(lhm); // ordered & no duplicates

		// TreeMap
		TreeMap tm = new TreeMap();
		tm.put("Speakers", 900);
		tm.put("Monitor", 2000);
		tm.put("CPU", 5000);
		tm.put("Keyboard", 500);
		tm.put("Keyboard", 500);
		System.out.println(tm); // ordered & no duplicates
	}
}
