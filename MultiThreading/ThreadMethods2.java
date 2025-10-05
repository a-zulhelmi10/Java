class MyThread2 extends Thread{
	public void run() {
		//System.out.println("Im a Thread");
		Thread t = Thread.currentThread(); //you are doing reference not object
		System.out.println(t);
		t.setName("Java");
		System.out.println(t);
		System.out.println(t.getName());
		t.setPriority(8);
		System.out.println(t);
		System.out.println(t.getPriority());
		
	}
	
}
public class ThreadMethods2 {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start(); //creates a thread and invoke run()
	}

}
