class Customer{
	private int age;
	void setAge(int a) {
		if( a>=18 && a<=60) {
			age=a;
		System.out.println("Given Age: "+age);
		}
		else
			System.out.println("Invalid age");
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		Customer c=new Customer();
		 // c.age=20; error
 		c.setAge(-10);
	}

}
