import java.util.*;

public class DuplicateMobileNumber {
	public static void main(String[] args) {
		List<Integer> mobileNos = new ArrayList<Integer>();
		mobileNos.add(1111);
		mobileNos.add(1111);
		mobileNos.add(2222);
		mobileNos.add(4444);
		mobileNos.add(3333);
		mobileNos.add(2222);
		mobileNos.add(5555);
		mobileNos.add(5555);
		System.out.println(mobileNos);
		
		//so we want to remove the duplicate and sort it
		TreeSet<Integer> uniqueMobileNos = new TreeSet<Integer>();
		uniqueMobileNos.addAll(mobileNos);
		System.out.println(uniqueMobileNos);
	}
}
