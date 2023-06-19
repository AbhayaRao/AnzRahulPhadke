package cts.springaccount;

public class SavingsAccount extends Account implements AccountService {

	public void deposit(float amt) {
		System.out.println("SavingsAccount deposit()");
		balance=balance+amt;
	}

	public void withdraw(float amt) {
		System.out.println("SavingsAccount withdraw()");
		balance=balance-amt;
	}

}
