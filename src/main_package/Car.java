package main_package;
import java.util.ArrayList;
import java.util.List;

public class Car {
	// var 
	List<CarPart> carPartList = new ArrayList<>();
	
	// constructor
	public Car(Engine enginePart, Tank tankPart, Wheels wheelsPart) {
		carPartList.add(enginePart);
		carPartList.add(tankPart);
		carPartList.add(wheelsPart);	
	}
	
//	public Car(int i, boolean b, int j, int k, int l, String string) {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		Engine firstCarEngine = new Engine(6, true);
		Tank firstCarTank = new Tank(200, 100);
		Wheels firstCarWheels = new Wheels(4,"wear");
		Car firstCar = new Car(firstCarEngine, firstCarTank, firstCarWheels);
		firstCar.run();
	}
	// run method
	public void run(){
//		System.out.println("run method have been called");
		for (CarPart carparts : carPartList) {
			carparts.function();
		}
		
	}

}
