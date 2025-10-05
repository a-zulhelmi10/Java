import java.util.Scanner;

public class biggestNumbers {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Please insert 3 numbers");
	System.out.println("Number 1:");
	float number1 = s.nextFloat();
	System.out.println("Number 2:");
	float number2 = s.nextFloat();
	System.out.println("Number 3:");
	float number3 = s.nextFloat();
	
	if (number1>number2)
		if (number1>number3)
			System.out.println("Biggest number is "+number1);
		else
			System.out.println("Biggest number is "+number3);
	else 
		if (number2>number3)
			System.out.println("Biggest number is "+number2);
		else
			System.out.println("Biggest number is "+number3);
	
	}
}

