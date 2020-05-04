package lab12_Rowland;

import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Car> carList = new ArrayList<>();
		
		System.out.println("Welcome to the Car App!");
		System.out.println();
		
		int numCars = Validator.getInt(scnr, "How many cars would you like to enter? ");
		
		for (int i = 0 ; i < numCars ; i++) {
			
			String make = Validator.getString(scnr, "MAKE: ");
			String model = Validator.getString(scnr, "MODEL: ");
			int year = Validator.getInt(scnr, "YEAR: ");
			double price = Validator.getDouble(scnr, "PRICE: ");
			System.out.println();
			Car c = new Car(make, model, year, price);
			carList.add(c);			
		}
		
		System.out.println();
		for (Car c : carList) {
			System.out.println(c.toString());
		}
		
	}

}
