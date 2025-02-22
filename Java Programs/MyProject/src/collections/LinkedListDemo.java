package collections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(6);
		ll.add(7);
		ll.add(4);
		ll.add(7);
		ll.add(2,8);
		System.out.println(ll); // [6, 7, 8, 4, 7]
		ll.addFirst(9);
		ll.addLast(99);
		System.out.println(ll); // [9, 6, 7, 8, 4, 7, 99]
		ll.remove(6);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll); //[6, 7, 8, 4]
		int num=(int)ll.get(2);
		System.out.println("Number : "+num);

	}

}
