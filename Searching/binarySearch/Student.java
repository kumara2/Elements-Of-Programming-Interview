package binarySearch;

public class Student {
	private String name;
	private double gpa;
	Student(String name, double g) {
		this.name = name;
		this.gpa = g;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
}
