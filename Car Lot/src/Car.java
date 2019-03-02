
public class Car extends Vehicle {
	
	
	
	//Attribute for Car
	public static String type;
	public static int numOfDoors;
	
	//getters and setters
	
	
	//constructor
	public Car(String licenseNumber, String make, String model, double price, String type, int numOfDoors) {
		super(licenseNumber, make, model, price);
		this.type = type;
		this.numOfDoors = numOfDoors;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	//code to add on the type and number of doors to the car description
	
	@Override
	public String toString() {
		return ("Car: " + this.getLicenseNumber() +" "+ this.getNumOfDoors() +"-Door "+ this.getType() + " "+ this.getMake() +" "+ this.getModel()+", cost is $" + this.getPrice());
	}

}
