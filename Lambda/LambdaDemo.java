interface Phone{
	void call();
}

interface Sms{
	void message(int no); //if the abstract method pass an arg
}

public class LambdaDemo {
	public static void main(String[] args) {
		Phone p = ()->{
			System.out.println("Calling");
		};
		p.call();
		
		Sms s = (int no)->{
			System.out.println("SMS from " +no);
		};
		s.message(999);
		
		System.out.println("\n**********OR************");
		Phone p2 = ()->System.out.println("Calling");
		p2.call();
		
	}
}
