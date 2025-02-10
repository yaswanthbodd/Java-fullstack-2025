class Sample{
	int n;
	int m;
	Sample(int n,int m){
		this.n=n;
		this.m=m;
	}
	void display() {
		System.out.println("n= "+n+" "+"m= "+m);
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		Sample s=new Sample(10,20);
		s.display();
	}

}
