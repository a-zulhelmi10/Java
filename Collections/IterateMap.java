import java.util.*;

public class IterateMap {
	public static void main(String[] args) {
		// HashMap
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Speakers", 900);
		hm.put("Monitor", 2000);
		hm.put("CPU", 5000);
		hm.put("Keyboard", 500);
		hm.put("Keyboard", 400);
		System.out.println(hm);
		
		//now we want to extract the keys
		Set<String> keys = hm.keySet();
		for(String k : keys)
			System.out.println(k +":" +hm.get(k));
	}
}
