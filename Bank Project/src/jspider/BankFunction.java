package jspider;

public class BankFunction implements Bank {
 private int balance;
	public BankFunction(int balance) {
		this.balance=balance;
	}
	@Override
	public void deposit(int a) {
		System.out.println("depositing "+a);
		balance+=a;
		System.out.println(balance);
		
	}
	@Override
	public void withdraw(int a) {
		if(a>balance)
		{
			try {
				throw new InsufficientBalanceException("insufficency");
			}
			catch(InsufficientBalanceException w)
			{
				w.printStackTrace();
			}
		}
		else
		{
			System.out.println("withdrawing "+a+" successfull");
			balance-=a;
			System.out.println(balance);
		}
	}
	@Override
	public int getBalance() {
		System.out.println(balance);
		return balance;
	}
	@Override
	public String displayErrorMessage() {
		return "Invalid choice";
	}
	

}
