package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();
		
		System.out.println("Enter the n1, n2 and n3: ");
		System.out.print("n1: ");
		std.n1 = sc.nextFloat();
		
		System.out.print("n3: ");
		std.n2 = sc.nextFloat();
		
		System.out.print("n3: ");
		std.n3 = sc.nextFloat();
		
		std.statusStudent();
		
		sc.close();
	}

}
