package entities;

public class Student {

	public String name;
	public float n1;
	public float n2;
	public float n3;
	
	public void statusStudent() {
		
		float total = n1 + n2 + n3;
		
		if (total >= 60) {
			
			System.out.println("FINAL GRADE: " + total);
			System.out.println("PASS");
		} else {
			System.out.println("FINAL GRADE: " + total);
			System.out.println("FAILED");
			System.out.println("MISSING " + (60-total) + " POINTS");
			
		}
	
	}
	
}
