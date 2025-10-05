//using default super reference
package polymorphism;
class Base3{
	int i;
	int j;
	Base3(int i, int j) { //this time you set i,j using constructor
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i=" +i +" j=" +j);
	}
	Base3(){}; //it is responsibility for programmer to write default constructor after parameterized constructor
}
class Derive3 extends Base3{ 
	int k;
	Derive3(int k){ 
		super(); //remember Derive3 class has 3 data members
		this.k=k;
	}
	void display() { 
		super.display(); //invoke display method from base class
		System.out.println("k=" +k);
	}
}

public class ConstructorInInheritance {
	public static void main(String[] args) {
		Base3 b = new Base3(10,20);
		b.display();//10 20
		
		Derive3 d = new Derive3(30);
		d.display(); //0 0 30
		
	}
}
