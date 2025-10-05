import java.util.Scanner;

public class WhileLoopsBiggestOfTenNumbers2 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	float number,big = 0;
	int i = 1;
	
	System.out.println("Please Enter 10 Numbers:");
		while (i<=10) {
			System.out.print("Number: ");
			number = s.nextFloat();
				if (number>big)
					big = number;
			++i;
		}
	System.out.print("The biggest number is: " +big);
	}
}
