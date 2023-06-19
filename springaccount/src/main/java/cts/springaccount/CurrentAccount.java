package cts.springaccount;

public class CurrentAccount extends Account implements AccountService {

	public void deposit(float amt) {
		System.out.println("CurrentAccount deposit()");
		balance=balance+amt;
	}

	public void withdraw(float amt) {
		System.out.println("CurrentAccount withdraw()");
		balance=balance-amt;
	}

}
