import java.util.Scanner;

public class factorialMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num = scanner.nextInt();
		
		int f = factor(num);
		
		System.out.println(f);
		
	}
	static int factor(int num){
		int i;
		for (i = num-1; i>=1; i--) {
			num*=i;	
		}
		return num;
		
		
	}
}
