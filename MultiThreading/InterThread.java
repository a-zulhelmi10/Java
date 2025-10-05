class ThreadSum extends Thread{
	int sum;
	public void run() {
		for(int i=1; i<=100;i++) {
			sum+=i;
		synchronized (this) {
			notify();
		}
		}
	}
}
public class InterThread {
	public static void main(String[] args) throws InterruptedException {
		ThreadSum ts = new ThreadSum();
		ts.start();
		synchronized(ts) {
			ts.wait(); //so all other threads will have to wait until ts finisheed
		}
		System.out.println(ts.sum);
	}
}
