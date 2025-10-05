import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float result = 0;
		System.out.println("number 1:");
		float number1 = s.nextFloat();
		System.out.println("number 2: ");
		float number2 = s.nextFloat();
		System.out.println("Choose operator: 1) Add 2) Substract 3) Multiply 4) Divide");
		int operator = s.nextInt();
		switch (operator) {
			case 1: result = number1 + number2;break;
			case 2: result = number1 - number2;break;
			case 3: result = number1 * number2;break;
			case 4: result = number1 / number2;break;
			default: System.out.println("Invalid operator");System.exit(1); //System.exit(1) is used to exit from the main method
		}
		System.out.println("Result: "+result);
		
		
	}
}
