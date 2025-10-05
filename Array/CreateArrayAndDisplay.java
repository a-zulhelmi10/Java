import java.util.Scanner;

public class CreateArrayAndDisplay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter array size:");
		int arraySize = scanner.nextInt();
		int [] n = new int[arraySize];
		
			for(int i=0;i<=arraySize-1;i++) {
				System.out.println("Please enter array " + i);
				n[i] = scanner.nextInt();
			}
		
		System.out.println("Your array's elements are: ");
		for (int i=0;i<=arraySize-1;i++) {
			System.out.println(n[i]);
		}
		
		
	//enhanced for loop (foreach)
		System.out.println("Array elements using foreach:");
		for(int x:n)
			System.out.println(x);
		
	}

}
