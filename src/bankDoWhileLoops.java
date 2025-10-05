import java.util.Scanner;
public class bankDoWhileLoops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int select = 0;
		
		System.out.println("Balance");
		int bal = scanner.nextInt();
		
		do {
		System.out.println(" ");
		System.out.println("Please select options: ");
		System.out.println("1) Deposit");
		System.out.println("2) Withdraw");
		System.out.println("3) Display Balance");
		System.out.println("4) Exit");
		
		select = scanner.nextInt();
		
		
		switch (select) {
			case 1: System.out.print("How much do you want to deposit?:");
					int depo = scanner.nextInt();
					bal = depo + bal;
					System.out.println("Your current balance: " +bal);break;
			case 2: System.out.print("How much do you want to withdraw?: ");
					int withDraw = scanner.nextInt();
					if (withDraw>bal)
						System.out.println("Not enough balance!");
					else {
						bal = bal-withDraw;
						System.out.println("Withdraw successful! Your current balance: " +bal); break;
					}
			case 3: System.out.println("Current Balance: "+ bal); break;
			case 4: System.out.println("Thank you for banking"); break;
			default: System.out.println("Invalid choose");	
		
			}
		}while (select != 4);
		
	}
}
