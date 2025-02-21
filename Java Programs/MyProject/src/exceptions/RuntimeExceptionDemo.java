package exceptions;
public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		//Arithmetic Exception
//		int n=10/0;
/*	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at exceptions.RuntimeExceptionDemo.main(RuntimeExceptionDemo.java:5)
*/
		//ArrayIndexOutOfBoundsException
//		int[] arr= {10,20,30,40,50};
//		System.out.println(arr[9]);
		
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 5
	at exceptions.RuntimeExceptionDemo.main(RuntimeExceptionDemo.java:11)
		 */
		
		//StringOutOfBoundsException
//		String s="Welcome";
//		System.out.println(s.charAt(10));
		
		/*
		 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 7
		 */
		
		//NegativeArraySizeException
		//int[] n=new int[-5];
		
		//NumberFormatException
//		String s="abc";
//		int n=Integer.parseInt(s);
		
		// NullPointerException
//		String str=null;
//		System.out.println(str.equals("apple"));
	}

}
