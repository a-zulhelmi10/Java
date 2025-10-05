//using parameterized super reference (hard coded)
package polymorphism;
class Base4{
	int i;
	int j;
	Base4(int i, int j) {
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i=" +i +" j=" +j);
	}
	Base4(){}; 
}
class Derive4 extends Base4{ 
	int k;
	Derive4(int k){ 
		super(40,50); //parameterized super. Call explicitly (hard coded)
		this.k=k;
	}
	void display() { 
		super.display(); 
		System.out.println("k=" +k);
	}
}

public class ConstructorInInheritance2 {
	public static void main(String[] args) {
		Base4 b = new Base4(10,20); 
		b.display();//10 20
		
		Derive4 d = new Derive4(30);
		d.display();
	}
}
