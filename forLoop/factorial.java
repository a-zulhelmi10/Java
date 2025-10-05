import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num = scanner.nextInt();
		int i;
		
		for (i = num-1; i>=1; i--) {
			num*=i;
			
		}
	System.out.println(num);
		
	}
}
