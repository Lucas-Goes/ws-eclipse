package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();

		System.out.print("Enter account number: ");
		acc.accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		acc.accountHolder = sc.next();

		System.out.print("is there an initial deposit (y/n)? ");
		int valid = sc.nextInt();

		if (valid == 1) {
			System.out.print("Enter initial deposit value: ");
			acc.balanceValue = sc.nextDouble();
		}

		System.out.println("Account Data: " + acc.toString());
		
		System.out.print("Enter a deposit value: ");
		Double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println("Updated account data: " + acc.toString());
		
		System.out.print("Enter a withdraw value: ");
		Double wValue = sc.nextDouble();
		acc.withdraw(wValue);
		System.out.println("Updated account data: " + acc.toString());
		sc.close();
	}

}
