class Customer{
	int  custId;
	String custName;
	String custAddress;
	Customer(int custId,String custName,String custAddress){
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
	}
	void display() {
		System.out.println("Customer Id : "+custId);
		System.out.println("Customer Name : "+custName);
		System.out.println("Customer Address : "+custAddress);
	}
}

class Account1{
	int acctId;
	String acctType;
	int acctBalance;
	Account1(int acctId,String acctType,int acctBalance){
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
	}
	void display() {
		System.out.println("Account ID : "+acctId);
		System.out.println("Account Type : "+acctType);
		System.out.println("Account Balance : "+acctBalance);
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Customer c1=new Customer(101,"srinu","mylavaram,Vijayawada");
		c1.display();
		Account1 a1=new Account1(2345,"savings",70000);
		a1.display();
	}

}
