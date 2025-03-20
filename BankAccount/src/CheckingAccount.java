
public class CheckingAccount extends BankAccount {
	
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override 
	public void withdraw(double amount) {
		if(amount > 0 && (balance + overdraftLimit) >= amount)
		{
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		}else {
			System.out.println("Insufficient funds or overdraft limit exceeded");
		}
	}
}
