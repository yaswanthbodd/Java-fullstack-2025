package java8;
import java.util.*;
import java.util.stream.*;
public class StreamDemo1 {
	public static void main(String[] args) {
		//Ways of traversing a collection
		List<String> fruits=List.of("apple","mango","banana","orange");
		System.out.println(fruits); // [apple, mango, banana, orange]
		
		//Traditional for loop
		for(int i=0;i<fruits.size();i++)
			System.out.println(fruits.get(i));
		
		//Enhanced for loop - It is added in java 5 version
		for(String fruit:fruits)
			System.out.println(fruit);
		
		//Using forEach loop - It is added in java 8 version
		System.out.println();
		fruits.forEach(fruit -> System.out.println(fruit));
		
		//Using Method refernces - added in Java 8 version
		System.out.println("-------------------");
		fruits.forEach(System.out::println);
		
		//Creating a Stream Using List
		System.out.println("***********");
		Stream<String> stream1=fruits.stream();
		stream1.forEach(System.out::println);
		
		//Creating a Stream Using Set
		System.out.println("--------");
		Set<String> set1=new HashSet<String>(fruits);
		Stream<String> stream2=set1.stream();
		stream2.forEach(System.out::println);
		
		//Creating a Stream Using Arrays
		System.out.println("+++++++++++++"); 
		String[] strArray = {"p","q","r"};
		Stream<String> stream3=Arrays.stream(strArray);
		stream3.forEach(System.out::println);
	}

}
