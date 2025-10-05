class Product{ //extends Object	
	int code;
	String pname; //product name
	double price;
	Product(int code,String pname, double price){
		this.code = code;
		this.pname = pname;
		this.price = price;
	}
	Product(){};
	public String toString() { ///output: Product@24d46ca6 if not override this toString() method
		return code +" " +pname +" " +price;
	}
}
public class toString {
	public static void main(String[] args) {
		Product P = new Product(111, "nutella", 4.50);
		System.out.println(P); 
	}

}
