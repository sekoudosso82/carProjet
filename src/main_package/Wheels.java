package main_package;

public class Wheels extends CarPart{
	// variables
	 int numberOfWheels = 4;
	 String tiresLevel = "wear";
	// constructor
	public Wheels(int numberOfWheels,  String tiresLevel ) {
		this.numberOfWheels = numberOfWheels;
		this.tiresLevel = tiresLevel;	
	}
	// main 
		public static void main(String[] args) {
			Wheels firstCarWheels = new Wheels(4,"wear");	
			firstCarWheels.function();
			firstCarWheels.status();
		}	
	// inherited status() from  CarPrt
		
		@Override
		public void status() {
			System.out.println(" The engine tires are at " + this.tiresLevel + " level.");
		}
	// must implement function() of CarrPart		
		@Override
		public void function() {
			System.out.println(" This engine is: " + this.numberOfWheels+ " wheels.");		
		}
}
