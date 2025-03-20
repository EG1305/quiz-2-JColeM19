//BanjTest by Cole Miller
public class BankTest {
	public static void main(String[] args)
	{
		SavingsAccount savings = new SavingsAccount("12", 1000.0, 0.05);
		savings.deposit(200.0);
		savings.addInterest();
		savings.getBalance();
		
		CheckingAccount checking = new CheckingAccount("12", 1000, 100);
		checking.deposit(100.0);
		checking.withdraw(700.0);
		checking.withdraw(900.0);
		checking.getBalance();
	}
}
