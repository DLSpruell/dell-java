
public class Car {

	// create attributes of the cars
	public String color;
	public String licenseNum;
	public String make;
	public String model;
	public int space;

	// constructor for the car
	public Car(String make, String model, String color, String licenseNum) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNum = licenseNum;

	}

	// create the set methods
	public void setColor(String color) {
		this.color = color;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// create the get methods
	public String getColor() {
		return color;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

}
