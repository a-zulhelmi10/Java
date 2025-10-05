//using conditional operator -->?
import java.util.Scanner;

public class BiggestNumbers2 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Please enter three numbers:");
	System.out.println("Number 1");
	double number1 = s.nextDouble();
	System.out.println("Number 2");
	double number2 = s.nextDouble();
	System.out.println("Number 3");
	double number3 = s.nextDouble();
	
	String biggest = (number1>number2)? ((number1>number3)? "The biggest number is "+number1: "The biggest number is " +number3):((number2>number3)? "The biggest number is "+number2: "The biggest number is "+number3);
	
	System.out.println(biggest);
	
	
	}

}
