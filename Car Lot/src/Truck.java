
public class Truck extends Vehicle {
		
		
	
		//create attributes for Truck
		public static String bedSize;
		
		//constructor
		public Truck(String licenseNumber, String make, String model, double price, String bedSize) {
			super(licenseNumber, make, model, price);
			this.bedSize = bedSize;
		}
		
		//code to add on the bed size to the truck description
		public String getBedSize() {
			return bedSize;
		}

		@Override
		public String toString() {
			return ("Truck: " + this.getLicenseNumber() +" "+ this.getMake() +" "+ this.getModel() +", bedsize is "+ this.getBedSize()+", cost is $" + this.getPrice());
		}
}
