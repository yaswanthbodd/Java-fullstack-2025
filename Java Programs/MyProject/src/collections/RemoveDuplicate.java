// WAP to remove duplicate mobile numbers from the given list of mobile numbers
package collections;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
	/*	List<Integer> mobileNos = new ArrayList<Integer>();
		mobileNos.add(1111);
		mobileNos.add(2222);
		mobileNos.add(1111);
		mobileNos.add(3333);
		mobileNos.add(5555);
		mobileNos.add(4444);
		mobileNos.add(3333);
		mobileNos.add(6666);
		mobileNos.add(7777);
		*/
		// Collection Factory method - of() - added in Java 9 version
		List<Integer> mobileNos=List.of(1111,2222,1111,3333,5555,4444,3333,6666,7777);
		System.out.println(mobileNos); // [1111, 2222, 1111, 3333, 5555, 4444, 3333, 6666, 7777]
		Set<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.addAll(mobileNos);
		System.out.println(lhs); // [1111, 2222, 3333, 5555, 4444, 6666, 7777]

	}

}
