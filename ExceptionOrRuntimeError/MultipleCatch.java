
public class MultipleCatch {
	public static void main(String[] args) {
		try {	
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1/n2;
			System.out.println("Result: " +result);
		}
		/*catch (Exception e) {  //cannot make from superclass to subclass because whats the point of writing others catch when you already define the superclass
			System.err.println("Exception error occured");
		} */
		catch (ArithmeticException e) {
			System.err.println("Cannot divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Require two numbers");
		}
		catch (NumberFormatException e) {
			System.err.println("Number exception occured");
		}
		catch (RuntimeException e) {
			System.err.println("Exception occured");
		}
	}
}