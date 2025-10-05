//use of()
import java.util.*;

public class DuplicateMobileNumber2 {
	public static void main(String[] args) {
		List<Integer> mobileNos = List.of(1111,1111,2222,4444,3333,2222,5555,5555);
		System.out.println(mobileNos);
		
		//so we want to remove the duplicate and sort it
		TreeSet<Integer> uniqueMobileNos = new TreeSet<Integer>();
		uniqueMobileNos.addAll(mobileNos);
		System.out.println(uniqueMobileNos);
	}
}
