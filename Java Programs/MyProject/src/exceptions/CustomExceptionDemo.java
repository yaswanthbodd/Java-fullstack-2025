package exceptions;
class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
	AgeException(){}
}
class Customer{
	void setAge(int age) throws AgeException {
		if (age < 18 || age >60) 
			throw new AgeException("Age should between 18 and 60");
		else
			System.out.println("Your age: "+age);
	}
}
public class CustomExceptionDemo {
	public static void main(String[] args) {
		Customer c=new Customer();
		try {
			c.setAge(10);
		}catch(AgeException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
