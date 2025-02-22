package collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// HashMap - unordered based on keys
		HashMap hm=new HashMap();
		hm.put("monitor",5000);
		hm.put("mouse", 500);
		hm.put("keyboard",1000);
		hm.put("ups", 3000);
		hm.put("monitor",500);
		System.out.println(hm); // {mouse=500, keyboard=1000, ups=3000, monitor=500}
		
		//LinkedHashMap - Ordered Based on Keys
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("monitor",5000);
		lhm.put("mouse",500);
		lhm.put("keyboard",1000);
		lhm.put("ups",3000);
		lhm.put("monitor", 500);
		System.out.println(lhm); // {monitor=500, mouse=500, keyboard=1000, ups=3000}
		
		//TreeMap - Sorted Based on Keys
		TreeMap tm=new TreeMap();
		tm.put("monitor",5000);
		tm.put("mouse",500);
		tm.put("keyboard",1000);
		tm.put("ups",3000);
		System.out.println(tm); // {keyboard=1000, monitor=5000, mouse=500, ups=3000}
		System.out.println(tm.descendingMap()); // {ups=3000, mouse=500, monitor=5000, keyboard=1000}
		
	}

}
