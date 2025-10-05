/*WAP to check whether the given age is major (>=18) or minor. 
Note: If the given age is <0, the display "Invalid age"*/
import java.util.Scanner;

public class AgeMajorMinor {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Please enter age:");
	int age = s.nextInt();
	if (age>=18)
		System.out.println("Major");
	else
		if (age<18 && age>=0)
			System.out.println("Minor");
		else
			System.out.println("Invalid age");
	s.close();
}
}
