import java.util.Scanner;

public class areaCircle {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Please enter radius");
	double radius = s.nextDouble();
	double pi = 3.14;
	double area = radius*radius*pi;
	System.out.println("The area of circle is "+area);
	s.close();
}
}
