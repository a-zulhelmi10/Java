
public class multiplicationTables {
	public static void main(String[] args) {
		int num1 = 1,i=1, num=1;
		
		while(num1<=10) {
			System.out.println("Multiplication "+num1);
			for (num =1;num<=10;num++) {
				int m = multiply(num1,i);
				System.out.println(num1+" * " +i +"="+m);
				i++;
			}
			num1++;
		}
	}
	static int multiply(int num1,int i) {
		int result = num1*i;
		return result;
	
	}
}
