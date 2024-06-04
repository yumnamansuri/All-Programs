package bankActivities;

public interface Bank {

	
	int Min_Bal = 1000;
	int Deposit_Limit = 20000;
	void deposit(Account acc,int amt);
	void withdraw(Account acc,int amt);
}
