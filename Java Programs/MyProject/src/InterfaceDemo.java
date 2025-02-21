interface Shape{
	void draw();
	default void fill() { // From java 8 version
		System.out.println("Filling..");
	}
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
		s.fill();
	}

}
