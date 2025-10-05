//using parameterized super reference (avoid hard coded) SUGGESTED ONE!
package polymorphism;
class Base5{
	int i;
	int j;
	Base5(int i, int j) {
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i=" +i +" j=" +j);
	}
	Base5(){}; 
}
class Derive5 extends Base5{ 
	int k;
	Derive5(int i, int j,int k){ //remember Derive5 has 3 members actually
		super(i,j); //avoid hard coded
		this.k=k;
	}
	void display() { 
		super.display(); 
		System.out.println("k=" +k);
	}
}

public class ConstructorInInheritance3 {
	public static void main(String[] args) {
		Base5 b = new Base5(10,20); 
		b.display();//10 20
		
		Derive5 d = new Derive5(40,50,30);
		d.display();
	}
}
