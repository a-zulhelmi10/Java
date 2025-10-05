
public class TryCatchBlock {
	public static void main(String[] args) {
		System.out.println("Begin of programme");
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]); //we set the arguments of n2 to be 0
		try {
			int result = n1/n2; //so here we should get an exception. Thats why we will apply try catch block
			System.out.println("Result: " +result); 
		}
		catch (Exception e){
			System.err.println("Cannot be divided by zero"); //use err word to change the font to red
		}
		System.out.println("End of programme");
	}
}
