import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student Roll Number: ");
		int rollNum=s.nextInt();
		System.out.println("Enter the Student Name: ");
		String studName=s.next();
		System.out.println("Enter the 3 Subjects Marks: ");
		double m1=s.nextDouble();	
		double m2=s.nextDouble();
		double m3=s.nextDouble();
		double total=m1+m2+m3;
		double average=total/3;
		System.out.println("Student Roll Number: "+rollNum);
		System.out.println("Student Name: "+studName);
		System.out.println("Student Total Marks: "+total);
		System.out.println("Student Average Marks: "+average);
	}

}
