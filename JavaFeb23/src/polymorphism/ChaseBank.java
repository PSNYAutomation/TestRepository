package polymorphism;

public class ChaseBank extends CentralBank {
	
	public static void main(String[] args) {
		
		// WebDriver driver = new ChromeDriver();
		// ChromeDriver driver = new WebDrver(); //wrong 
		
		
		ChaseBank obj = new ChaseBank(); 
		System.out.println("The interest rate is: " + obj.homeLoanInterest());
	}

	public double homeLoanInterest() {
		 return 4.5; 
	}
	
}
