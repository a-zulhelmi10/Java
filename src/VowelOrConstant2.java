import java.util.Scanner;

public class VowelOrConstant2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please Enter Cha to check whether vowel or constant: ");
		char ch = s.next().toLowerCase().charAt(0); //charAt(0) is to convert from string to character (because.next() is a string
		s.close();

		if (Character.isAlphabetic(ch)) {
			switch (ch) {
				case 'a' :
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' : System.out.println(ch +" is vowel"); break;
				default: System.out.println(ch +" is constant");
			}
		}
		else
			System.out.println("Invalid character");
	}
	
		
		
	
}
