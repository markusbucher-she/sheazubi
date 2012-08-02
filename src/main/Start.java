package main;

import cars.Car;
import cars.MotorCycle;

public class Start {
	
	public static void main(String[] args) {
		MotorCycle motorCycle = new Car();
		Car secondCar = new Car();
		
		//input
		motorCycle.setManufacturer("Honda");
		motorCycle.setModel("RD04");
		motorCycle.setColor("black");
		motorCycle.setGasolineType("Diesel");
		motorCycle.setConsumptionBoth((float)6.2);
		motorCycle.setPs(59);
		motorCycle.setSpeed(171);
		motorCycle.setPrice(2000);
		
		secondCar.setManufacturer("Ford");
		secondCar.setModel("Focus");
		secondCar.setColor("blue");
		secondCar.setGasolineType("Benzin");
		secondCar.setDoors(4);
		secondCar.setConsumptionBoth((float)8);
		secondCar.setPs(130);
		secondCar.setSpeed(182);
		secondCar.setPrice(5000);
		
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
		System.out.println("Manufacturer: " + secondCar.getManufacturer());
		System.out.println("Model: " + secondCar.getModel());
		System.out.println("gasoline type: " + secondCar.getGasolineType());
		System.out.println("color: " + secondCar.getColor());
		System.out.println("doors: " + secondCar.getDoors());
		if (secondCar.getConsumptionInTowns() != 0)
			System.out.println("consumption in Towns: " + secondCar.getConsumptionInTowns());
		if(secondCar.getConsumptionOutOfTowns() != 0)
			System.out.println("consumption out of Towns: " + secondCar.getConsumptionOutOfTowns());
		if (secondCar.getConsumptionBoth() != 0)
			System.out.println("consumption both: " + secondCar.getConsumptionBoth());
		System.out.println("ps: " + secondCar.getPs());
		System.out.println("speed: " + secondCar.getSpeed());
		System.out.println("price: " + secondCar.getPrice());
	}
	
}
