import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the values into the array ");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		System.out.println("ENter the key value: ");
		int key=s.nextInt();
		boolean isFound=false;
		for(int i:arr)
		{
			if(key == i) {
				isFound=true;
				break;
			}
		}
		if(isFound)
			System.out.println("Found");
		else 
			System.out.println("Not Found");
			
	}

}
