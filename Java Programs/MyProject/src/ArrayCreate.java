import java.util.Scanner;
public class ArrayCreate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=s.nextInt();
		int[] n=new int[size];
		System.out.println("Enter array values");
		for(int i=0;i<n.length;i++)
			n[i]=s.nextInt();
		System.out.println("Given Elements");
		for(int i:n)
			System.out.println(i);
	}

}
