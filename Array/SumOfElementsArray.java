import java.util.Scanner;

public class SumOfElementsArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter size of array:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int sum = 0;
		
		for (int i=0;i<=size-1;i++) {
			System.out.println("Please enter Array "+ "["+ i+ "]");
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		
		System.out.println("Sum of elements is: " +sum);
	}

		
	}

