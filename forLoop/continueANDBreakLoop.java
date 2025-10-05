//print 1-10 except 5&6
import java.util.Scanner;

public class continueANDBreakLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i =0;
		
		while (true) {
			i++;
			if (i == 5 || i ==6)
				continue;
			System.out.print(i +" ");
			if (i ==10)
				break;
		}
		
		
		
		
	}
}
