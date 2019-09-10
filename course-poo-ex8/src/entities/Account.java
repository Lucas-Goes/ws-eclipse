package entities;

public class Account {

	public int accountNumber;
	public String accountHolder;
	public double balanceValue;
	public static final double TAX = 5;
	
	public double deposit(double depositValue) {
		if ( depositValue > 0) {
		return balanceValue +=  depositValue;
		}else {
			System.out.println("Invalid Value!");
			return balanceValue;
		}
	}
	
	public double withdraw(double wValue) {
		if ( wValue > 0) {
			return balanceValue -=  (wValue + TAX);
			}else {
				System.out.println("Invalid Value!");
				return balanceValue;
			}
	}
	
	public String toString() {
		return "Account " + accountNumber 
				+ ", Holder: " + accountHolder 
				+ ", Balance: $" + balanceValue;
	}
}


