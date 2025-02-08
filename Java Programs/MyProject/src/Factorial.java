import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int f=1;
		for(int i=n;i>=1;i--)
			f=f*i;
		System.out.println("Factorial of "+n+" is "+f);
	}

}
