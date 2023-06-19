package cts.springaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Atm {
	
	@Autowired
	@Qualifier("savings")
	AccountService acService;
	
	void doSomeTxn(){
		acService.deposit(15000);
		acService.withdraw(1000);
	}
	
	void showBalance(Account a){
		a.printBalance();
	}
}
