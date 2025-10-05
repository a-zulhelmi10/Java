package polymorphism;

class Basee{
	int i;
	int j;
	void setIJ(int i, int j) { //set i,j using method
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i=" +i +" j=" +j);
	}
}
class Derivee extends Basee{ 
	int k;
	void setK(int k){ //overloaded 
		this.k=k;
	}
	void display() { //override
		System.out.println("k=" +k);
	}
}

public class Polymorphism3 {
	public static void main(String[] args) {
		Basee b = new Basee();
		b.setIJ(10, 20);
		b.display();
		Derivee d = new Derivee();
		d.setK(30); 
		d.display();
		d.setIJ(40,50); 
		d.display(); 
	}
}
