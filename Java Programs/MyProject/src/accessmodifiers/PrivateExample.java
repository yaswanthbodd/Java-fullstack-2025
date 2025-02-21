package accessmodifiers;

class A{
	private int n;
	void ppp() {
		n=10;
	}
}
class B{
	void qqq() {
		A a=new A();
	//	a.n=20; // error
	}
}
public class PrivateExample {

	public static void main(String[] args) {
		
	}

}
