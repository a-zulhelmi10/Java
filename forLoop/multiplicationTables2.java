
public class multiplicationTables2 {
	public static void main(String[] args) {
		int num1=1, i=1, n=1, result = 1;
		
		while(num1<=10) {
			System.out.println("Multiplication "+num1);
			for (n=1;n<=10;n++) {
				result =num1*n;
				System.out.println(num1 +" * " +n +" = "+result);
			}
		num1++;
		System.out.println(" ");
		}
		
		
	}
}
