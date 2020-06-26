package main_package;

public class Simulator {
	private static Tank firstCarTank;
	private static Engine firstCarEngine;
	private static Wheels firstCarWheels;

	public static void main(String[] args) {
		
		Car firstCar = new Car(firstCarEngine, firstCarTank, firstCarWheels);
		firstCar.run();
	}

}
