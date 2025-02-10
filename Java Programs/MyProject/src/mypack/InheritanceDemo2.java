// Polymorphism - Method overloading and Method overriding
package mypack;
class Base{
	int i;
	int j;
	void input(int i,int j) {
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i= "+i+" "+"j= "+j);
	}
}
class Derived extends Base{
	int k;
	void input(int k) { //Method Overloading
		this.k=k;
	}
	void display() { //Method Overriden
		super.display();
		System.out.println("k= "+k);
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		Base b=new Base();
		b.input(10,20);
		b.display(); // i=10 j=20
		Derived d=new Derived(); 
		d.input(40,20);
		d.display(); // i=40 j=20 k=0
		d.input(50);
		d.display(); // i=40 j=20 k=50
	}

}
