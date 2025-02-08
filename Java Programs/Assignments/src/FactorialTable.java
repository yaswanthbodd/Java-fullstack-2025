import java.util.Scanner;
public class FactorialTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		System.out.println("----------------------");
		System.out.println("Number       Factorial");
		System.out.println("----------------------");
		int result=0;
		for(int i=1;i<=n;i++) {
			result=result+fact(i);
			System.out.println("   "+i+"          "+fact(i));
		}
		System.out.println("----------------------");
		System.out.println("    Sum =  "+result);
		System.out.println("-----------------------");
	}
	static int fact(int n)
	{
		int f=1;
		for(int i=n;i>=1;i--) {
			f=f*i;
		}
		return f;
	}

}
