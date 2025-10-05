import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList al = new LinkedList(); //you got this class file from file java.util
		al.add(10);
		al.add(20);
		al.add("xxx");
		al.add("yyy");
		System.out.println(al); //[10,20,xxx,yyy] *ordered
		al.add(2,"ppp");
		System.out.println(al); //[10,20,ppp,xxx,yyy]
		al.set(2, "qqq");
		System.out.println(al); //[10,20,qqq,xxx,yyy]
		al.remove("qqq");
		System.out.println(al); //[10,20,xxx,yyy]
		al.remove(2);
		System.out.println(al); //[10,20,yyy]
		String s = (String) al.get(2); //typecasting from higher (object class) to lower (String class)
		System.out.println(s); //yyy
		System.out.println("Size = " +al.size()); //size = 3
	
	}
}
