package polymorphism;

public class WebsterBank extends CentralBank{
	
	public static void main(String[] args) {
		//Create an object of WebsterBank class
		CentralBank obj = new WebsterBank();
		//print the interest rate
		System.out.println("The interest rate is " + obj.homeLoanInterest());
		
	}
	
	//this is an overridden method
//	public double homeLoanInterest() {
//		 return 5.25; 
//	}
	
	
	public double carLoanInterestRate() {
		//double intRate = 3.5;
		return 3.9; 
		//return intRate;
	}
	

}
