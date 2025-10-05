import java.util.Scanner;
public class BiggestOfTenNumbersV2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num,i=1,big=0;
		
		while (i<=10) {
			System.out.println("Please enter positive number");
			num=s.nextInt();
			if (num>big)
				big = num;
		i++;
		}
		System.out.println("The biggest number is: "+big);
		
	}

}
