package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();

		System.out.print("is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);
		}else {
			account = new Account(accountNumber, accountHolder);
		}

		System.out.println("Account Data: " + account.toString());
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);

		System.out.println("Updated account data: " + account.toString());
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);		
		
		System.out.println("Updated account data: " + account.toString());
		sc.close();
	}

}
