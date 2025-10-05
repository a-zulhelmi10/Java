import java.util.Scanner;

public class NegativePositiveZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float big1 = 0; //initialize local variables
		
		System.out.println("Please enter a number");
		float number1 = s.nextFloat();
		
		if (number1 > 0)
			System.out.println(number1 + " is positive");
		else
			if (number1 < 0)
				System.out.println(number1+" is negative");
			else
				System.out.println(number1+" is zero");
		
		
	}

}
