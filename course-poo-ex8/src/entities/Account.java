package entities;

public class Account {

	public int accountNumber;
	public String accountHolder;
	public double balanceValue;
	
	
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit); //encapsulamento
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalanceValue() {
		return balanceValue;
	}

	public void deposit(double amount) {
		balanceValue += amount;
	}
	
	public void withdraw(double amount) {
		balanceValue -= amount + 5.0;
	}
		
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f", balanceValue);
	}
}


