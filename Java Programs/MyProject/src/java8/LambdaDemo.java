package java8;
@FunctionalInterface
interface Phone{
	void call();
}
@FunctionalInterface
interface Vehicle{
	void wheels(int no);
}
/*
class ApplePhone implements Phone{
	public void call() {
		System.out.println("Calling....");
	}
}
*/
public class LambdaDemo {
	public static void main(String[] args) {
//		Phone p=new ApplePhone();
//		p.call();
		
		//Anonymous Inner Class
/*		Phone p=new Phone() {
			public void call() {
				System.out.println("calling....");
			}
		};
		p.call(); // Calling....
*/		
		// Lambda Expersion
/*		Phone p= () -> {
			System.out.println("Calling....");
		};
		p.call(); // Calling....
*/		
		Phone p=() -> System.out.println("Calling.....");
		p.call();
		
		Vehicle v=(int no) -> System.out.println("This vehicle have "+no+" wheels.");
		v.wheels(4);
		
		Vehicle v1= (no) -> System.out.println("This vehicle have "+no+" wheels.");
		v1.wheels(3);
		
		Vehicle v2= no -> System.out.println("This vehicle have "+no+" wheels.");
		v2.wheels(2);
	}

}
