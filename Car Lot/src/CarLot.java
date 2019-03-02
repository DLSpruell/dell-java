import java.util.ArrayList;
import java.util.List;

public class CarLot {
		

	// create attributes for the car lot
	private String carName;
	private List<Vehicle> inventory = new ArrayList<Vehicle>();

	// constructor for the car lot
	public CarLot(String carName) {
		this.carName = carName;
		
	}
	
	
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public List<Vehicle> getInventory() {
		return inventory;
	}


	public void setInventory(List<Vehicle> inventory) {
		this.inventory = inventory;
	}


	// method for adding cars to the car lots
	public void addVehicle(Vehicle vehicle) {
		this.inventory.add(vehicle);
	}

	
	// method for printing the inventory of each lot
	public void printInventory() {
		System.out.println(this.carName + " inventory:");
		for(Vehicle vehicle : inventory) {
			System.out.println(vehicle);
		}
		}
	
}	
