package collections;
import java.util.*;
public class GenericCollection {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		// ll.add(99); // error
		ll.add("apple");
		ll.add("mango");
		ll.add("Orange");
		System.out.println(ll); // [apple, mango, Orange]
		for(String fruit:ll)
			System.out.println(fruit);
		/*
		 * 	apple
			mango
			Orange
		 */
	}

}
