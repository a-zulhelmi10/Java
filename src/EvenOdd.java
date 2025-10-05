import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a nummber: ");
		int number = s.nextInt();
		if (number%2 == 0) 
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println("********************************");
		if (number%2 == 0) 
			System.out.println("Even"); // means it is true that the system will skip if statements if FALSE
		System.out.println("Odd");
		
		
		
	}

}
