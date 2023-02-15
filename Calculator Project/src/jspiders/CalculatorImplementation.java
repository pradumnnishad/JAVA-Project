package jspiders;

public class CalculatorImplementation implements Calculator{

	public String add(int a,int b) {
		return "sum of "+a+" and "+b+" is "+(a+b);
	}
	public String sub(int a,int b) {
		return "differenc between "+a+" and "+b+" is "+(a-b);
	}
	public String mul(int a,int b) {
		return "multiplication of "+a+" and "+b+" is "+(a*b);
	}
	public String div(int a,int b) {
		if(b!=0) {
			return "sum of "+a+" and "+b+" is "+(a/b);
		}
		else {
			return "invalid denominator";
		}
	}
	public String displayErrorMessage() {
		return "Error choice";
	}
}
