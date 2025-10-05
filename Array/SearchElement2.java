
//using method to call function
import java.util.Scanner;

public class SearchElement2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result = "Not found";
		int i =0;
		
		System.out.println("Please enter array size:");
		int size = scanner.nextInt();
		int [] a = new int[size];
		System.out.println("Please enter elements:");
		for (i=0;i<size;i++) {
			System.out.println("Element " +i);
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Search Element of?");
		int element = scanner.nextInt();
		String s = search(a, element, result);
		
		System.out.println("Element "+s +"!");
		
	}

	static String search(int a[], int element, String result) { //error int a[i]
		for (int i=0;i<a.length;i++) {
			if (element == a[i]) {
				result = "found"; break;
			}
		}
		return result;
	} 
}
