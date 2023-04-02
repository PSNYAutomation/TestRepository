package polymorphism;

public class Calculator {
	// Examples of method overloading
	
	public void doAdd() {
		System.out.println("First add method");
	}
	
	public void doAdd(int a) {
		System.out.println("Second add method");
	}
	
	public void doAdd(int a, int b) {
		int sum = a+b; 
		System.out.println("Addition of 2 numbers: "+ sum);
	}
	public void doAdd(int a, int b, int c) {
		int sum = a+b+c; 
		System.out.println("Addition of 3 numbers: "+ sum);
	}
	
	public void doAdd(int rc, double ab, int be) {
		double sum = rc+ab+be; 
		System.out.println("Addition of 3 numbers: "+ sum);
	}
	
}
