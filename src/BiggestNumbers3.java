//using conditional operator -->?
import java.util.Scanner;

public class BiggestNumbers3 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Please enter three numbers:");
	System.out.println("Number 1");
	double number1 = s.nextDouble();
	System.out.println("Number 2");
	double number2 = s.nextDouble();
	System.out.println("Number 3");
	double number3 = s.nextDouble();
	
	double big = (number1>number2)? number1 : number2;
	double bigger = (big>number3)? big:number3;
	
	System.out.println("The biggest number is: "+bigger);
	
	
	
	}

}
