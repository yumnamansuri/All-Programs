package bankActivities;

public class BankTransactions implements Bank {

	
	@Override
	public void deposit(Account acc,int amt)
	{
		acc.setBal(acc.getBal() + amt);
		
		System.out.println("Balance Updated");
	}
	
	public void withdraw(Account acc,int amt)
	{
		acc.setBal(acc.getBal() - amt);
		System.out.println("SucessFully Withdraw");
	}

}
