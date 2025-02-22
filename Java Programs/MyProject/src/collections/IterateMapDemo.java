package collections;
import java.util.*;
public class IterateMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Monitor",5000);
		hm.put("Keyboard",1000);
		hm.put("Mouse", 300);
		hm.put("Ups",3000);
		hm.put("Speakers",1200);
		System.out.println(hm); // {Monitor=5000, Mouse=300, Keyboard=1000, speakers=1200, ups=3000}
		
		//Iterator to get the values based on keys
		Set<String> key=hm.keySet();
		for(String k:key)
			System.out.println(k+":"+hm.get(k));
		
		/*
		 * Monitor:5000
			Mouse:300
			Keyboard:1000
			speakers:1200
			ups:3000
		 */
	}

}
