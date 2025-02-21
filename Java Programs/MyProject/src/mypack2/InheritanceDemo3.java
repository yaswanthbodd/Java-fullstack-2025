//Constructors in Inheritance
package mypack2;
class Base{
	int i;
	int j;
	Base(int i,int j) {
		this.i=i;
		this.j=j;
	}
	Base(){} //default Constructor
	void display() {
		System.out.println("i= "+i+" "+"j= "+j);
	}
}
class Derived extends Base{
	int k;
	Derived(int k) { //Method Overloading
		super(); // added implicitly -invokes Base class default constructor
		this.k=k;
	}
	void display() { //Method Overriden
		super.display(); //invokes base class display()
		System.out.println("k= "+k);
	}
}
public class InheritanceDemo3 {

	public static void main(String[] args) {
		Base b=new Base(10,20);
		b.display(); // i=10 j=20
		Derived d=new Derived(50); 
		d.display(); // i=0 j=0 k=50
	}

}
