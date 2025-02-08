import java.util.Scanner;
public class MathTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Table number: ");
		int n=s.nextInt();
		Table(n);
	}
	static void Table(int n) {
		int result=0;
		for(int i=1;i<=10;i++) {
			result=n*i;
			System.out.println(n+" * "+i+" = "+result);
		}
	}

}
