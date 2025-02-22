package collections;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// HashSet - unordered
		HashSet hs=new HashSet();
		hs.add("apple");
		hs.add("mango");
		hs.add("Banana");
		hs.add("apple");
		hs.add("Apple");
		System.out.println(hs); //[apple, Apple, mango, Banana]
		// LinkedHashSet - Ordered
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("cpu");
		lhs.add("mouse");
		lhs.add("keyboard");
		lhs.add("mouse");
		System.out.println(lhs); // [monitor, cpu, mouse, keyboard]

		//TreeSet - Sorted
		TreeSet ts=new TreeSet();
		ts.add("mouse");
		ts.add("keyboard");
		ts.add("ups");
		ts.add("monitor");
		ts.add("mouse");
		System.out.println(ts); // [keyboard, monitor, mouse, ups]
		System.out.println(ts.descendingSet()); // [ups, mouse, monitor, keyboard]
		
	}

}
