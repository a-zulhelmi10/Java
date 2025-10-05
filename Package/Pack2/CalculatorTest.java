//to run the package of Pack1
package Pack2;
import Pack1.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		System.out.println("Calculator class is from different package");
		Calculator test = new Calculator();
		int sum =test.add(5,10);
		System.out.println(sum);
		int multi =test.multiply(5, 10);
		System.out.println(multi);
		
		System.out.println("Calculator2 class if from same package. So no need to import");
		Calculator2 test2 = new Calculator2();
		int subst = test2.substract(5, 3);
		double div = test2.divide(10, 4);
		System.out.println("Substract= " +subst);
		System.out.println("Divide= " +div);
		
	}
	
}
