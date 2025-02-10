class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	
	//Constructor
	Account(int accountNo,String accountType,int accountBalance){
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
//	void setAccountDetails(int accountNo,String accountType,int accountBalance){
//		this.accountNo=accountNo;
//		this.accountType=accountType;
//		this.accountBalance=accountBalance;
//	}
	void withdraw(int amount) {
		if(amount > accountBalance)
			System.out.println("Insufficient Balance");
		else
			accountBalance=accountBalance-amount;
	}
	void deposit(int amount) {
		accountBalance=accountBalance+amount;
	}
	void dispAccountDetails() {
		System.out.println("Account No: "+accountNo);
		System.out.println("Account Type: "+accountType);
		System.out.println("Acoount Balance: "+accountBalance);
	}
}
public class BankDemo {

	public static void main(String[] args) {
		Account a=new Account(101, "savings", 70000);
//		a.setAccountDetails(101, "savings", 70000);
		a.withdraw(8000);
		a.dispAccountDetails();
	}

}
