package main_package;


public class Engine extends CarPart{
	private int numberOfCylinders = 6;
	boolean engineIsRunning = true;
	
	// constructor
	public Engine (int numberOfCylinders, boolean engineIsRunning) {
		this.numberOfCylinders = numberOfCylinders;
		this.engineIsRunning = engineIsRunning;
	}
	
	
	public static void main(String[] args) {
		Engine firstCarEngine = new Engine(6, true);
		
		firstCarEngine.function();
		firstCarEngine.status();
	}
	
	// inherited status() from  CarPrt
	
	@Override
	public void status() {
		System.out.println(" and it's "+this.engineIsRunning + " that this the engine is running.");
	}

	// must implement function() of CarrPart
	
	@Override
	public void function() {
		// TODO Auto-generated method stub
		
		System.out.println(" This engine is " + this.numberOfCylinders+ " cylinders.");
		
	}
	
	
	
	

}
