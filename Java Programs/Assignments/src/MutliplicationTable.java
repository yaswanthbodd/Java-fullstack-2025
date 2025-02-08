import java.util.Scanner;
public class MutliplicationTable {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			Table(i);
		}
	}
	static void Table(int n) {
		int result=0;
		for(int i=1;i<=10;i++) {
			result=n*i;
			System.out.println(n+" * "+i+" = "+result);
		}
		System.out.println();
	}

}
