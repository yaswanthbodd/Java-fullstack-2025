class Rectangle{
	int length;
	int breadth;
	int area;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		area=length*breadth;
		System.out.println("Area of Rectangle of length "+length+" and Breadth "+breadth+" is "+area);
	}
	
}
public class AreaOfRectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(6,7);
		r.area();
	}

}
