package collections;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(99); // Autoboxing - added in Java 5 version - 
		// Converting respective primitive type into reference type or vice versa
		al.add(77); // al.add(new Integer(20)); // prior java 5 version
		al.add("abc");
		al.add("pqr");
		al.add(77);
		System.out.println(al); // [99, 77, abc, pqr,77]
		al.add(2,"yyy");
		System.out.println(al); //[99, 77, yyy, abc, pqr, 77]
		al.add(3,"xxx");
		System.out.println(al); // [99, 77, yyy, xxx, abc, pqr, 77]
		al.remove("xxx");
		System.out.println(al); // [99, 77, yyy, abc, pqr, 77]
		al.remove(2);
		System.out.println(al); // [99, 77, abc, pqr, 77]
		String s= (String)al.get(2);
		System.out.println(s); // abc
		System.out.println("Size = "+al.size());
	}

}
