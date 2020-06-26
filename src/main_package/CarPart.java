package main_package;

public class CarPart implements FunctionalInterface {
	int durability = 100;
	
	
	public static void main(String[] args) {
		
	}
	// status method
	public void status() {
		System.out.println(" the condition of this car is good");
	}

	@Override
	public void function() {
		// TODO Auto-generated method stub
		
		System.out.println("this function() methode is override from FunctionInterface");
		
	}

	

}
