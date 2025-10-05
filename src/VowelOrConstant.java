import java.util.Scanner;

public class VowelOrConstant {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please Enter Cha to check whether vowel or constant: ");
		char ch = s.next().toLowerCase().charAt(0); //charAt(0) is to convert from string to character (because.next() is a string
		s.close();
		
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			System.out.println("Cha is constant");
		else
			System.out.println(ch +" is Vowel");
		
	}
	
		
		
	
}
