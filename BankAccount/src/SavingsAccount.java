//Savings Account Code by Cole Miller
public class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void addInterest () {
		double interest = balance * interestRate;
		balance += interest;
		System.out.println("Interest added: $ " + interest);
		}
	}

