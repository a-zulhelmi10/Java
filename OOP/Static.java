class MyClass{
	int m; //non static variable. Need to create object to call. And the memory does not share with others objects
	static int n; //static variable. The memory is shared among the objects
	
	void xxx(){
		m=10;
		n=20; //non static method can use static members
	}
	static void yyy() {
	//	m=30; //static method cannot use non static members
		n=40;
	}
	void display(){
		System.out.println(m +" " +n); //non static method can use static members
	}
}
public class Static {
	public static void main(String[] args) {
		MyClass mcl = new MyClass();
		mcl.display(); // 0 0
		mcl.xxx();
		mcl.display(); //10 20
		System.out.println("");
		
		MyClass mcl2 = new MyClass();
		mcl2.display(); //0 20  Because static n is shared among other object
		System.out.println("");
		
		mcl2.xxx(); 
		mcl2.display(); //10 20
		mcl2.yyy();
		mcl2.display(); //10 40
	}
}
