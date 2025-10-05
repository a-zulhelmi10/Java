class ThreadR implements Runnable{

	@Override
	public void run() {
		for (int i=1 ;i<=10 ;i++) {
			System.out.print(i +" ");
		}
		
	}
	
}
public class ImplemebtsRunnable {
	public static void main(String[] args) {
		ThreadR R = new ThreadR();
		Thread t = new Thread(R);
		t.start(); /*ThreadR doesnt has start() method
		it belongs to Thread class. so we need to create an object of Thread class*/
	}
}
