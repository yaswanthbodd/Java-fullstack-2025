interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw() { // When implementing interface methods, Overriden method should be public
		System.out.println("Drawing a Circle...");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		 // Shape s=new Shape(); // error
		Shape s=new Circle();
		s.draw();
	}

}
