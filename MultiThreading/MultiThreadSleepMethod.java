//add sleep()
class ThreadX2 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Thread X");
		for (int i =1;i<=10;i++) {
			System.out.println(t.getName() +":" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
}

class ThreadY2 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Thread Y");
		for (int i=1 ;i<=10 ;i++) {
			System.out.println(t.getName() +":" +i);
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class MultiThreadSleepMethod {
	public static void main(String[] args) {
		ThreadX2 x = new ThreadX2();
		x.start();
		ThreadY2 y = new ThreadY2();
		y.start();
	}

}
