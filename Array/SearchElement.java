import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result = "Not found";
		
		System.out.println("Please enter array size:");
		int size = scanner.nextInt();
		int [] a = new int[size];
		System.out.println("Please enter elements:");
		for (int i=0;i<size;i++) {
			System.out.println("Element " +i);
			a[i] = scanner.nextInt();
		}
		System.out.println("Search Element of?");
		int element = scanner.nextInt();
		for (int i=0;i<size;i++) {
			if (element == a[i]) {
				result = "found"; break;
			}
		}
		System.out.println("Element "+result +"!");
		
	}
}
