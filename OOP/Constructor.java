class Sample{
	int i ,x;
	int j ,y;
	Sample(){ //contructor is method without void and with Capital letter the same as className, and is automatically run the method
		i =10;
		j=20;
	}
	void display() {
		System.out.println(i +" " +j);
	}
	
	//compare with void
	void Sample2() {
		x=10;
		y=20;
	}
	void display2() {
		System.out.println(x +" " +y);
	}
	
}
public class Constructor {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.display();
		System.out.println("");
		System.out.println("with void method");
		s.display2();
		s.Sample2();
		s.display2();
	}
}
