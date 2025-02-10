class Student{
	int rollNum;
	String studName;
	int mark1,mark2,mark3,totalMarks;
	Student(int rollNum,String studName,int mark1,int mark2,int mark3){ //Parametrized Constructor
		this.rollNum=rollNum;
		this.studName=studName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
//	void setDetails(int rollNum,String studName,int mark1,int mark2,int mark3) {
//		this.rollNum=rollNum;
//		this.studName=studName;
//		this.mark1=mark1;
//		this.mark2=mark2;
//		this.mark3=mark3;
//	}
	int calculateTotal(int markl,int mark2,int mark3) {
		return totalMarks=mark1+mark2+mark3;
	}
	void displayStudDetails() {
		System.out.println("Student Roll Number: "+rollNum);
		System.out.println("Student Name: "+studName);
		System.out.println("Total Marks: "+calculateTotal(mark1,mark2,mark3));
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student(577,"yash",54,77,95);
//		s1.setDetails(577,"yash",54,77,95);
		s1.displayStudDetails();

	}

}
