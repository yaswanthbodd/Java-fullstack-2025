class Employee{
	int empNum;
	String empName;
	double empSalary;
	void setEmpDetails(int empNum,String empName,double empSalary) {
		this.empNum=empNum;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	void displayDetails() {
		System.out.println("Employee Number : "+empNum);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSalary);
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpDetails(1,"yaswanth", 60000.0);
		e.displayDetails();

	}

}
