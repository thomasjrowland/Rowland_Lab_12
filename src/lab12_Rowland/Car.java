package lab12_Rowland;

public class Car {
	
	protected String make;
	protected String model;
	protected int year;
	protected double price;
	
	public Car() {}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "make:\t" + make + "\tmodel:\t" + model + "\tyear:\t" + year + "\tprice:\t$" + price;
	}
	
	
	
	

}
