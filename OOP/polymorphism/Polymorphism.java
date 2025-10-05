package polymorphism;

class Base{
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
class Derive extends Base{ 
	int k;
	void set(int k){ //overloaded 
		this.k=k;
	}
	void display() { //override
		System.out.println("k=" +k);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Base b = new Base();
		b.set(10, 20);
		b.display();
		Derive d = new Derive();
		d.set(30); 
		d.display();
		d.set(40,50); /*overloaded (Not same arguments). It will invoke Base method.
		so to print the i and j from base class, we need to use super keyword (Refer to file polymorphism2)*/
		d.display(); 
	}
}
