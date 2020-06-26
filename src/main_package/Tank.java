package main_package;

public class Tank extends CarPart {
	private int tankCapacity = 200;
	private int fuelLevel = 100;
	
	// constructor
	public Tank (int tankCapacity, int fuelLevel) {
		this.tankCapacity = tankCapacity;
		this.fuelLevel = fuelLevel;
	}
	
	// main 
	public static void main(String[] args) {
		Tank firstCarTank = new Tank(200, 100);
		firstCarTank.function();
		firstCarTank.status();
	}
	
	// inherited status() from  CarPrt
	
		@Override
		public void status() {
			System.out.println(" The engine has " + this.fuelLevel + " galons right now.");
		}

		// must implement function() of CarrPart
		
		@Override
		public void function() {
			// TODO Auto-generated method stub
			
			System.out.println(" This engine thank capacity is: " + this.tankCapacity + " galons.");
			
		}
		

}
