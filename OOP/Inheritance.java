class Base{
	int i;
	int j;
	void setIJ(int i, int j) {
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i=" +i +" j=" +j);
	}
}
class Derive extends Base{ //derive class has 3 data members which are i,j,k
	int k;
	void setK(int k) {
		this.k=k;
	}
	void displayK() {
		System.out.println("k=" +k);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Base b = new Base(); /*no arguments here because Base class does not has constructor 
		(We are now using default constructor which return i=0 and j=0)*/
		b.setIJ(10, 20); //now i=10 and j=20
		b.display();
		
		/*it means that without creating 2 objects at once, you can access the method in one class
		by creating the derived class*/
		Derive d = new Derive();
		d.setIJ(30,40); //we can invoke method from class Base because this class is derived from class Base
		d.display();
		d.setK(50);
		d.displayK();
	}
}
