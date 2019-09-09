package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars wil be bought? ");
		double quantity = sc.nextDouble(); 
		
		CurrencyConverter.Converter(dollar, quantity);
		
		sc.close();
	}

}
