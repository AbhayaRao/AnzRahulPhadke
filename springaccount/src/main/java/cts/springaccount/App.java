package cts.springaccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	SavingsAccount savAc=(SavingsAccount) ctx.getBean("savings");
    	CurrentAccount curAc=(CurrentAccount) ctx.getBean("current");
    	
    	Atm atm=ctx.getBean(Atm.class);
    	atm.showBalance(savAc);
    	atm.showBalance(curAc);
    	
    	atm.doSomeTxn();
    	
    	atm.showBalance(savAc);
    	atm.showBalance(curAc);
    }
}
