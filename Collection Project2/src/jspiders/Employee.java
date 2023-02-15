package jspiders;

public class Employee {

	private String name;
	private double sal;
	public Employee(String name,double sal) {
		this.name=name;
		this.sal=sal;

	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "salary of "+name+" is "+sal+"LPA.";
	}
}
