package bankActivities;

public class ObjBankTransaction  extends LimitBank{

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccname("Yumna");
		ac.setEmail("Y123@gmail.com");
		ac.setBal(5000);
		
		System.out.println(ac);
		
		BankTransactions bnk = new BankTransactions();
		bnk.deposit(ac,2000);
		
		System.out.println(ac);
		
		bnk.withdraw(ac, 50000);
		System.out.println(ac);
		
		

	}

}
