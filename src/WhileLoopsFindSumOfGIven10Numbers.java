import java.util.Scanner;

public class WhileLoopsFindSumOfGIven10Numbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i =1;
		double newTotal = 0;
		
		System.out.println("Please enter number " +i);
		double number1 = s.nextDouble();
		++i;
		System.out.println("Please enter number " +i);
		double number2 = s.nextDouble();
		
		double total = number1+number2;
		System.out.println("Total: " +total);
		
		while (i<10) {
			++i;
			System.out.println("Please enter number " +i);
			double newNumber = s.nextDouble();
			total = newNumber+total;
			System.out.println("Total: " +total);
		}
		System.out.println("**************End***************");
		
		
	}

}
