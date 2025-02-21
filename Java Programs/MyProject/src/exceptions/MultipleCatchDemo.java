package exceptions;
public class MultipleCatchDemo {
	public static void main(String[] args) {
		try {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int res=n1/n2;
			System.out.println("Result = "+res);
		}
		catch(ArithmeticException e) {
			System.err.println("Divided by zero is not allowed");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Require two numbers");
		}catch(NumberFormatException e) {
			System.err.println("Enter only numbers");
		}catch(RuntimeException e) {
			System.out.println("Runtime Exceptions Occured");
		}catch(Exception e) {
			System.out.println("Exception Occured");
		}
		finally {
			System.out.println("End of the Program");
		}
	}

}
