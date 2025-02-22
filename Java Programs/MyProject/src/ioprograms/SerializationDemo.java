package ioprograms;
import java.io.*;
class Employee implements Serializable{
	int empId;
	String empName;
	transient double empSalary; // not included during serialization
	public Employee(int empId,String empName,double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Employee() {}
	public String toString() {
		return empId+" "+empName+" "+empSalary;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		//Serialization
		FileOutputStream fos=new FileOutputStream("Emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee emp=new Employee(101,"srinu",8000);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		
		//Deserialization
		FileInputStream fis=new FileInputStream("Emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp1=(Employee)ois.readObject();
		System.out.println(emp1);
		ois.close();
		fis.close();
	}

}
