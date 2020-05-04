package lab12_Rowland;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {
	
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(new Car("Honda", "Civic", 2020, 25000));
		carList.add(new Car("Toyota", "Camry", 2020, 28000));
		carList.add(new Car("Ford", "Focus", 2020, 23000));
		carList.add(new UsedCar("BMW", "325i", 2000, 12500, 165000));
		carList.add(new UsedCar("Chevy", "Malibu", 2010, 11500, 105000));
		carList.add(new UsedCar("Kia", "Forte", 2016, 10500, 98125));
		
		do {
		
			int menuNum = 1;
		
			for (Car c : carList) {
				System.out.println(menuNum + ".\t" + c.toString());
				menuNum++;
			}
		
			System.out.println();
			int carNum = Validator.getInt(scnr, "Please select your vehicle: ", 1, carList.size());
		
			carNum -= 1;
		
			System.out.println();
			
			System.out.println("You selected:");
			System.out.println(carList.get(carNum).toString());
			System.out.println();
		
			boolean buy = Validator.getYesNo(scnr, "Would you like to buy this car? ");
		
			System.out.println();
			
			if (buy) {
				carList.remove(carNum);
				System.out.println("Enjoy your new car!");
			}
		
			System.out.println();
			
			menuNum = 1;
			for (Car c : carList) {
				System.out.println(menuNum + ".\t" + c.toString());
				menuNum++;
			}
		
			System.out.println();
			
		} while (Validator.getYesNo(scnr, "Would you like to continue? "));
		
		System.out.println();
		System.out.println("GoodBye!");

	}

}
