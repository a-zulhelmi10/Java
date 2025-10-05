


abstract class Vehicle{ //as this class is now abstract, if you want to print brake() method, you need to use object of its subclass (Vehicle vt = new Toyota())
	abstract void drive() ;
	void brake() {
		System.out.println("Apply Brake");
	}
}

class Toyota extends Vehicle{
	void drive() {
		System.out.println("Start the Toyota car");
	}
	void collision() {
		System.out.println("Toyota is strong and durable car");
	}
}
class Merc extends Vehicle{
	void drive() {
		System.out.println("Start the Merc car");
	}
	void luxury() {
		System.out.println("Mercedes is luxury car");
	}
}
abstract class Proton extends Vehicle{
	void fuel() {
		System.out.println("Proton is economic fuel save");
	}
}
public class Abstract {
	public static void main(String[] args) {
		//Vehicle v= new Vehicle(); cannot make object of abstract class
		Vehicle vt = new Toyota();
		vt.drive();
		vt.brake(); 
		Toyota t = new Toyota();
		t.drive();
		t.collision();
		Vehicle vm = new Merc();
		vm.drive();
		vm.brake();
		//Vehicle vp = new Proton(); error! Because an abstract is like a new base
		
	}
}
