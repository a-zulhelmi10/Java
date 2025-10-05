import java.util.Scanner;

public class doWhileBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, num = 0;
        do {
    			System.out.print("Enter a number: ");
    			num = scanner.nextInt();
    			if (num == 0) {
    				System.out.println("Exit"); 
    				break; // remember to use {} symbol on the IF statements when want to include break	
    			}	
    			total += num;
    			System.out.println("Total: "+ total);
    			
        } while (num !=0);
       
        
        
        
        
        System.out.println("************OR*************");
        do {
        		System.out.print("Enter a number: ");
        		num = scanner.nextInt();
        		if (num == 0)
        			System.out.println("Exit");
        		else {
        		total += num;
        		System.out.println("Total: "+ total);
        		}
        } while (num !=0);
        
     
    
    }
}
