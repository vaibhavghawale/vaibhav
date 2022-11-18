package day1.Question3;

public class Account {

	static String accountNumber;
	static double balance;

	public Account() {
		super();
	}

	public Account(String accountNumber, double balance) {
		super();
		Account.accountNumber = accountNumber;
		Account.balance = balance;
	}

	/* ========================================= */

	void deposit(double amount) {

		balance = balance + amount;
	}

	double withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			ArithmeticException ae = new ArithmeticException("Withdraw Amount is insuffient");
			throw ae;
		}
		return balance;

	}
	
	

}
