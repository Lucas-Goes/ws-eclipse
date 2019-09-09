package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empl = new Employee();
		
		System.out.println("Enter the Name, Salary and Tax: ");
		System.out.print("Name: ");
		empl.name  = sc.nextLine();
		
		System.out.print("Salary: ");
		empl.grossSalary  = sc.nextDouble();
		
		System.out.print("Tax: ");
		empl.tax  = sc.nextDouble();
		
		System.out.println("Employee: " + empl.name + ", $" + empl.netSalary());
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		empl.increaseSalary(percentage);
		
		System.out.println("Updated data: " + empl.name + ", $" + empl.netSalary());
		
		
		
		sc.close();
	}

}
