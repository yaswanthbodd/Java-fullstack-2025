class MyClass{
	int m;
	static int n;
	void ppp() {
		m=10;
		n=20;
	}
	static void qqq() {
		//m=30;
		n=40;
	}
	void display() {
		System.out.println("m= "+m+" "+"n= "+n);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		MyClass mc1=new MyClass();
		mc1.ppp();
		mc1.display();
		MyClass mc2=new MyClass();
		mc2.display();

	}

}
