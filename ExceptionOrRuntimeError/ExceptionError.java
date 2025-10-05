
public class ExceptionError {
	public static void main(String[] args) {
		System.out.println("Begin of programme");
		//int n1 =args[0]; //so the args value is string. 
		//int n2 = args[1];
		int n1 = Integer.parseInt(args[0]); //convert from reference to primitive (String to int)
		int n2 = Integer.parseInt(args[1]);
		int result = n1/n2;
		System.out.println("Result: " +result); /* to run the program, right click 
		then select run as -> run configurations... ->search main class under MAIN tab -->pass the args value
		under ARGUMENTS tab*/
		System.out.println("End of programme");
	}
}
