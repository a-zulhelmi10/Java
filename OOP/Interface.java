interface Shape{
	void draw();
	default void fill() { //void fill() without inserting default keyword is error
		System.out.println("Fill in yellow color");
	}
}
class Circle implements Shape {
	public void draw() {
		System.out.println("Draw a circle");
	}
}
public class Interface {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s.fill();
	}
}
