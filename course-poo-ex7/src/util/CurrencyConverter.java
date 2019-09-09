package util;

public class CurrencyConverter {
	public static final double TAX = 0.06;
	
	public static double Converter(double dollar, double quantity) {
		double result = dollar * quantity;
		result += result * TAX;
		
		System.out.println("Dollar price -->  " + dollar);
		System.out.println("Dollar wil be bought --> " + quantity);
		System.out.println("Amount to be paid in reais = " + result);
		
		return result;
	}
}