package exceptions;
class WithdrawException extends Exception{
	WithdrawException(String msg){
		super(msg);
	}
	WithdrawException(){}
}
class Account{
	void withdraw(int amount,int balance) throws WithdrawException{
		if(amount > balance)
			throw new WithdrawException("Insuffient Balance");
		else
			System.out.println("Withdraw Successfully....");
	}
}
public class AssignmentWithdrawException {
	public static void main(String[] args) {
		Account a=new Account();
		try {
			a.withdraw(1000000, 100000);
		}catch(WithdrawException e) {
			System.out.println(e);
		}
	}

}
