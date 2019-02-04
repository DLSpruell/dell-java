
public class ParkingGarage {

	// create the car array
	public Car[] parkingSpaces;

	// constructor method
	public ParkingGarage(int numOfSpaces) {
		parkingSpaces = new Car[numOfSpaces];
	}

	// method to add the cars to the parking garages
	public void park(Car car, int space) {
		parkingSpaces[space] = car;
	}

	// method to remove the cars from the parking garages
	public void vacate(int space) {
		parkingSpaces[space] = null;

	}

	// method to print out all of the attributes of the cars in each space

	public void printInventory() {
		for (int i = 0; i < parkingSpaces.length; i++) {
			if (!(parkingSpaces[i] == null)) {
				System.out.println("Space number: " + i + ", Car color: " + parkingSpaces[i].color + ", Car make: "
						+ parkingSpaces[i].make + ", Car model: " + parkingSpaces[i].model + ", License plate: "
						+ parkingSpaces[i].licenseNum);

			}
		}
	}

}
