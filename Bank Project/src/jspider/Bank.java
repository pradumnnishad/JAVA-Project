package jspider;

public interface Bank {
	void deposit(int a);
	void withdraw(int b);
	int getBalance();
	String displayErrorMessage();
}
