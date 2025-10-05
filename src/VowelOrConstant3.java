import java.util.Scanner;

public class VowelOrConstant3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = 'a';
		do {
		System.out.print("Please Enter Cha to check whether vowel or constant. Press '0' to exit ");
		ch = s.next().toLowerCase().charAt(0); //charAt(0) is to convert from string to character (because.next() is a string

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
			if (ch != '0')
				System.out.println("Invalid character");
	}while (ch != '0');
	System.out.println("System Exit.");
	s.close();
		
	}
}
