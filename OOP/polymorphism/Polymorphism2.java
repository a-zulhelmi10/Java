//include super
package polymorphism;
class Base2{
	int i;
	int j;
	void set(int i, int j) {
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i=" +i +" j=" +j);
	}
}
class Derive2 extends Base2{ 
	int k;
	void set(int k){ 
		this.k=k;
	}
	void display() { 
		super.display(); //invoke display method from base class
		System.out.println("k=" +k);
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		Derive2 d = new Derive2(); 
		d.set(70); 
		d.display(); //this will display the input i,j due to the present of super keyword
		d.set(40,50); 
		d.display(); 
	}
}
