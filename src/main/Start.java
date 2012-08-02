package main;

import cars.Car;
import cars.LKW;
import cars.Tank;
import cars.MotorCycle;

public class Start {
	
	public static void main(String[] args) {
		MotorCycle motorCycle = new MotorCycle();
		Car theCar = new Car();
		LKW theLkw = new LKW();
		Tank theTank = new Tank();
		
		//input
		motorCycle.setManufacturer("Honda");
		motorCycle.setModel("RD04");
		motorCycle.setColor("black");
		motorCycle.setGasolineType("Diesel");
		motorCycle.setConsumptionBoth((float)6.2);
		motorCycle.setPs(59);
		motorCycle.setSpeed(171);
		motorCycle.setPrice(2000);
		
		theCar.setManufacturer("Ford");
		theCar.setModel("Focus");
		theCar.setColor("blue");
		theCar.setGasolineType("Benzin");
		theCar.setDoors(4);
		theCar.setConsumptionBoth((float)8);
		theCar.setPs(130);
		theCar.setSpeed(182);
		theCar.setPrice(5000);
		
		theLkw.setConsumptionBoth(23);
		theLkw.setColor("purple");
		theLkw.setManufacturer("Volvo");
		theLkw.setCountOfAxes(3);
		theLkw.setGasolineType("Diesel");
		theLkw.setPs(400);
		theLkw.setPrice(100000);
		
		//output
		System.out.println("motorcycle:");
		System.out.println("_________________");
		System.out.println("Manufacturer: " + motorCycle.getManufacturer());
		System.out.println("Model: " + motorCycle.getModel());
		System.out.println("gasoline type: " + motorCycle.getGasolineType());
		System.out.println("color: " + motorCycle.getColor());
		if (motorCycle.getConsumptionInTowns() != 0)
			System.out.println("consumption in Towns: " + motorCycle.getConsumptionInTowns());
		if(motorCycle.getConsumptionOutOfTowns() != 0)
			System.out.println("consumption out of Towns: " + motorCycle.getConsumptionOutOfTowns());
		if (motorCycle.getConsumptionBoth() != 0)
			System.out.println("consumption both: " + motorCycle.getConsumptionBoth());
		System.out.println("ps: " + motorCycle.getPs());
		System.out.println("speed: " + motorCycle.getSpeed());
		System.out.println("price: " + motorCycle.getPrice());
		System.out.println();
		System.out.println();
		
		System.out.println("car:");
		System.out.println("_________________");
		System.out.println("Manufacturer: " + theCar.getManufacturer());
		System.out.println("Model: " + theCar.getModel());
		System.out.println("gasoline type: " + theCar.getGasolineType());
		System.out.println("color: " + theCar.getColor());
		System.out.println("doors: " + theCar.getDoors());
		if (theCar.getConsumptionInTowns() != 0)
			System.out.println("consumption in Towns: " + theCar.getConsumptionInTowns());
		if(theCar.getConsumptionOutOfTowns() != 0)
			System.out.println("consumption out of Towns: " + theCar.getConsumptionOutOfTowns());
		if (theCar.getConsumptionBoth() != 0)
			System.out.println("consumption both: " + theCar.getConsumptionBoth());
		System.out.println("ps: " + theCar.getPs());
		System.out.println("speed: " + theCar.getSpeed());
		System.out.println("price: " + theCar.getPrice());
		System.out.println();
		System.out.println();
		
		System.out.println("LKW:");
		System.out.println("_________________");
		System.out.println("Manufacturer: " + theLkw.getManufacturer());
		System.out.println("gasoline type: " + theLkw.getGasolineType());
		System.out.println("color: " + theLkw.getColor());
		if (theLkw.getConsumptionInTowns() != 0)
			System.out.println("consumption in Towns: " + theLkw.getConsumptionInTowns());
		if(theLkw.getConsumptionOutOfTowns() != 0)
			System.out.println("consumption out of Towns: " + theLkw.getConsumptionOutOfTowns());
		if (theLkw.getConsumptionBoth() != 0)
			System.out.println("consumption both: " + theLkw.getConsumptionBoth());
		System.out.println("ps: " + theLkw.getPs());
		System.out.println("price: " + theLkw.getPrice());
	}
	
}
