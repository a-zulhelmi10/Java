package polymorphism;

class AA {
	int result;
	void add(int m, int n) {
		this.result = m+n;
	}
	void substract(int m, int n) {
		this.result = m-n;
	}
	void multiply(int m, int n) {
		this.result = m*n;
	}
	void display() {
		System.out.println(result);
	}
}
class BB extends AA {
	void divide(int m, int n) {
		this.result = m/n;
	}
	void display() {
		System.out.println("This is the result: " +result);
	}
}

public class ObjectReference {
    public static void main(String[] args) {
       AA a = new BB(); //create object of class B that refer to class A
       a.add(8, 2);
       a.display();
       //a.divide(8/2); Error (methods divide does not present in class A or both.
    }
}
