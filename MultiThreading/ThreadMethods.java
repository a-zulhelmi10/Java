class MyThread extends Thread{
	public void run() {
		//System.out.println("Im a Thread");
		Thread t = Thread.currentThread(); //you are doing reference not object
		System.out.println(t);
	}
	
}
public class ThreadMethods {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start(); //creates a thread and invoke run()
		MyThread t2 = new MyThread();
		t2.start();
	
	}

}
