class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
	AgeException(){}
}

class Customer {
	 void setAge(int age) throws AgeException{
		 if (age<18 || age>60)
			 throw new AgeException("Age should be between 18 and 60");
		 else
			 System.out.println("Your age is: " +age);
	}
}
public class UserDefinedException {
	public static void main(String[] args) {
		Customer c = new Customer();
		// c.setAge(29); this one is error you will need to create try catch block
		try {
			c.setAge(61);
		} catch (AgeException e) {
			System.out.println(e); //invoke toString() implicitlty
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
