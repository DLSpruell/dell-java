
public abstract class Vehicle {

	// attributes
	public String licenseNumber;
	public String make;
	public String model;
	public double price;

	public Vehicle[] vehicleArray;
	public String vehicleList;

	// constructor
	public Vehicle(String licenseNumber, String make, String model, double price) {
		this.licenseNumber = licenseNumber;
		this.make = make;
		this.model = model;
		this.price = price;
	}


	// get and set methods
	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void vehicleList(String make, String model, String licenseNumber, int price) {
		for (int i = 0; i < vehicleArray.length; i++) {
			if (!(vehicleArray[i] == null)) {
				System.out.println(vehicleArray[i].make + vehicleArray[i].model + vehicleArray[i].licenseNumber
						+ vehicleArray[i].price);
			}
		}
	}

}
