package cts.springaccount;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("savings")
	SavingsAccount getSavingsAccount(){
		return new SavingsAccount();
	}

	@Bean("current")
	CurrentAccount getCurrentAccount(){
		return new CurrentAccount();
	}
	
	@Bean
	Atm getAtm() {
		return new Atm();
	}

}
