//BankAccount code by Cole Miller
public class BankAccount {
	protected String accountNumber;
	protected double balance;

	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	

	
public void deposit(double amount) {
	if (amount > 0) {
		balance += amount;
		System.out.println("Deposited: $" + amount);
	} else {
		System.out.println("Deposited amount must be positive.");
	}
}

public void withdraw(double amount) {
	if (amount > 0 && amount <= balance) {
		balance -= amount;
		System.out.println("Withdrawn: $" + amount);
	} else {
		System.out.println("Invalid Withdrawal amount");
	}
}

public void getBalance()
{
	System.out.println("Account Balance: $" + balance);
}

}