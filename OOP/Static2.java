class MyClass2{
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
public class Static2 {
	public static void main(String[] args) {
		MyClass2 mcl = new MyClass2();
		mcl.xxx();
		mcl.display(); //10 20
		System.out.println("");
		
		MyClass2 mcl2 = new MyClass2();
		mcl2.display(); //0 20
		mcl2.yyy(); 
		mcl.display(); //10 40 (Correct! Becoz static variable n is shared among obect) 10 20 (Wrong!)
		mcl2.display(); //0 40
		System.out.println("");
		
		MyClass2.n = 50;
		mcl.display(); //10 50
		mcl2.display(); //0 50
	}
}
