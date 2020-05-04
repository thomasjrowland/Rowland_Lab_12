package lab12_Rowland;

public class UsedCar extends Car {
	
	private double milage;

	public UsedCar() {}
	
	public UsedCar(String make, String model, int year, double price, double milage) {
		super(make, model, year, price);
		this.milage = milage;
	}

	
	public double getMilage() {
		return milage;
	}

	
	public void setMilage(double milage) {
		this.milage = milage;
	}

	
	@Override
	public String toString() {
		return "make:\t" + make + "\tmodel:\t" + model + "\tyear:\t" + year + "\tprice:\t$" + price + "\tmilage:\t" + milage;
	}
	
	

	
	
	
	
	
	

}
