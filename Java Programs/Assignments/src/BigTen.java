import java.util.Scanner;
public class BigTen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1,n=0,big=0;
		while(i<=10) {
			System.out.println("Enter a number: ");
			n=s.nextInt();
			if(n>big)
				big=n;
			i++;
		}
		System.out.println("Biggest given 10 numbers is : "+big);
	}
}