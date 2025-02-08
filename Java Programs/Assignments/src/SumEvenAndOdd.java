//To Find sum of Even and Odd Numbers from 1 to 100

public class SumEvenAndOdd {

	public static void main(String[] args) {
		int n=1,evenSum=0,oddSum=0;
		while(n<=100) {
			if(n%2==0)
				evenSum+=n;
			else
				oddSum+=n;
			n++;
		}
		System.out.println("Even Sum = "+evenSum);
		System.out.println("Odd Sum = "+oddSum);
	}

}
