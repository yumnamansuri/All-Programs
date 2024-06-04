package bankActivities;

public class LimitBank implements Bank{
	
@Override
	
	public void deposit(Account acc,int amt)
	{
		if(amt > Deposit_Limit)
		{
			System.err.println("Sorry ! You cannot Deposit beacuse Deposit limit exceeds");
		}
		else
		{
			acc.setBal(acc.getBal() + amt);
			System.out.println("Deposited " + amt + "into account => " + amt);
		}
		
	}
	
	@Override
	public void withdraw(Account acc,int amt)
	{
		if(acc.getBal() - amt >= Min_Bal)
		{
			acc.setBal(acc.getBal() - amt);
			System.out.println("Withdrawn " + amt + "from account => " +amt);
		}
		else
		{
			System.out.println("Insufficient Balance => " + amt);
		}
	}
	

}
