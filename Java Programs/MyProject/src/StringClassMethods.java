
public class StringClassMethods {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s.charAt(1)); // e
		
		//compareTo()
		String s1="abc";
		String s2="pqr";
		
		if((s1.compareTo(s2))<0)
			System.out.println(s1+" is less than "+s2); // abc is less than pqr
		else 
			if((s1.compareTo(s2))>0)
				System.out.println(s1+" is greater than "+s2);
			else
				System.out.println(s1+" is equal to "+s2);
		
		//concat()
		String s3="Hello";
		String s4=" World";
		System.out.println(s3.concat(s4)); // Hello World
		
		//contains()
		String s5="Welcome";
		System.out.println(s5.contains("come")); //true
		System.out.println(s5.contains("pqr")); //false
		
		//startsWith() and endsWith()
		String s6="Welcome";
		System.out.println(s6.startsWith("We")); //true
		System.out.println(s6.endsWith("come")); //true
		
		//equals() and equalsIgnoreCase()
		String s7="Hello";
		String s8="hello";
		System.out.println(s7.equals(s8)); // false
		System.out.println(s7.equalsIgnoreCase(s8)); // true;
		
		//indexOf()
		String s9="Welcome";
		System.out.println(s9.indexOf("come")); // 3
		System.out.println(s9.indexOf("pqr")); // -1
		System.out.println(s9.indexOf(4)); // -1
		
		//length()
		String s11="hello";
		System.out.println(s11.length()); // 5
		
		//split()
		String st="Hibernate is a orm framework";
		String strArray[]=st.split(" ");
		for(String si:strArray)
			System.out.println(si);
		/* Hibernate
		 * is
		 * a 
		 * orm
		 * framework
		 */
		
		//toCharArray()
		String st1="hello";
		char charArray[]=st1.toCharArray();
		for(char c:charArray)
			System.out.println(c);
		/* h
		 * e
		 * l
		 * l
		 * o
		 */
		
		// toLowerCase() and toUpperCase
		String st2="Welcome"; 
		System.out.println(st2.toLowerCase()); //welcome
		System.out.println(st2.toUpperCase()); //WELCOME
		
		//trim()
		String st3="   Hello World   ";
		System.out.println(st3.trim()); //Hello World
		
		//valueOf()
		int n=77;
		String st4=String.valueOf(n);
		System.out.println(st4); // "77"
		
	}

}
