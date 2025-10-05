import java.util.Scanner;

public class WhileLoopsFindSumOfGIven10Numbers2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i =1, total = 0, newNumber = 0;
		
		while (i<=10) {
			System.out.println("Please enter number " +i);
			newNumber = s.nextInt();
			total +=newNumber;
			System.out.println("Total: " +total);
			++i;
		}
		System.out.println("**************End***************");
		
		
	}

}
