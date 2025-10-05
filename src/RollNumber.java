import java.util.Scanner;
public class RollNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Roll Number:");
		int rollNumber = s.nextInt();
		System.out.println("Enter Name: ");
		String name = s.next();
		System.out.println("Enter Mark1");
		float mark1 = s.nextFloat();
		System.out.println("Enter Mark2");
		float mark2 = s.nextFloat();
		System.out.println("Enter Mark3");
		float mark3 = s.nextFloat();
		float total = mark1+mark2+mark3;
		float average = total/3;
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+average);
	}
}
