package com.account.test;
import com.account.Account;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Account ac=new Account(3576,"Savings",70000);
		int ch=0;
		int amount=0;
		while(true){
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice ");
			ch=s.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter your Deposit Amount: ");
					amount=s.nextInt();
					ac.deposit(amount);
					break;
			case 2:System.out.println("Enter your Withdraw Amount: ");
					amount=s.nextInt();
					ac.withdraw(amount);
					break;
			case 3:System.out.println("Amount : "+ac.getBalance());
					break;
			case 4:System.out.println("Thank you for visiting......");
					System.exit(1);		
			default : System.out.println("Please click valid options");
			
			}
		}
	}

}
