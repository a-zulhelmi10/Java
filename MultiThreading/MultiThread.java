class ThreadX extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Thread X"); //so t is now refer to ThreadX (Current thread)
		for (int i =1;i<=10;i++)
			System.out.println(t.getName() +":" +i);
	}
}

class ThreadY extends Thread{
	public void run() {
		Thread t = Thread.currentThread(); //this method currentThread() is static members thats why you can invoke without creating object
		t.setName("Thread Y");
		for (int i=1 ;i<=10 ;i++)
			System.out.println(t.getName() +":" +i);
	}
}


public class MultiThread {
	public static void main(String[] args) {
		ThreadX x = new ThreadX();
		x.start();
		ThreadY y = new ThreadY();
		y.start();
	}

}
