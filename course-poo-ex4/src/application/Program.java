package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter height and width: ");
		System.out.print("height: ");
		rect.height  = sc.nextDouble();
		
		System.out.print("widht: ");
		rect.width  = sc.nextDouble();
		
		double area = rect.totalArea();
		double perimeter = rect.totalPerimeter();
		double diagonal = rect.totalDiagonal();
		
		System.out.printf(area + ", " + perimeter + ", " + "%.2f ", diagonal);
		
		sc.close();

	}

}
