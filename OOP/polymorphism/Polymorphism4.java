package polymorphism;

class A {
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
class B extends A {
	void divide(int m, int n) {
		this.result = m/n;
	}
	void display() {
		super.display();
		System.out.println("This is the result: " +result);
	}
}

public class Polymorphism4 {
    public static void main(String[] args) {
       B b = new B();
       b.multiply(2, 10);
       b.display();
       b.add(10, 5);
       b.display();
       b.divide(10,5);
       b.display();
    }
}

