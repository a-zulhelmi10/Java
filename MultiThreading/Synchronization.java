class Table{
	synchronized public void printTable(int n) {
		for (int i=1; i<=10; i++) {
			System.out.println(n + "*" +i +"=" + (n*i));
		}
	}
}


class ThreadA1 extends Thread{
	Table t; //so t is refer to table (Reference)
	ThreadA1(Table x){
		this.t=x;
	}
	public void run() {
		t.printTable(4);
	}
}
class ThreadA2 extends Thread{
	Table t ; /*t is now created a memory named t but not holding anything bcs it does not
	refer to anything it just declared (no 'new Table()')*/
	ThreadA2(Table y){ 
		this.t = y; /*now threadA2 hand on the reference value of Table to the memory. So the t
		is now holding the value of Table (just like what Table t = new Table(); did*/
	}
	public void run() {
		t.printTable(10); /*finally you can invoke .printTable() method because t is holding the
		value of Table*/
	}
}
public class Synchronization {
	public static void main(String[] args) {
		Table t = new Table();
		ThreadA1 A1 = new ThreadA1(t); //this thread refer to the same resources t with threadA2
		A1.start();
		ThreadA2 A2 = new ThreadA2(t);
		A2.start();
	}
}
