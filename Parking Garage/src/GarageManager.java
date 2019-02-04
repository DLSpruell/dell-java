
public class GarageManager {

	public static void main(String[] args) {
			
			//creating parking garages with different amount of spaces
			ParkingGarage parkingGarageWest = new ParkingGarage(5);
			ParkingGarage parkingGarageEast = new ParkingGarage(10);
			
			
			//creating new cars with their descriptive information
			Car carOne = new Car("Chevrolet", "Cobalt", "Red", "AHA-3428");
			Car carTwo = new Car("Audi", "Q4", "Silver", "HE9-8UJ3");
			Car carThree = new Car("Toyota", "Camry", "Black", "WAR-89U7");
			Car carFour = new Car("Buick", "Encore", "White", "3RT-H34U");
			Car carFive = new Car("Chevrolet", "Traverse", "Blue", "HYG-3428");
			Car carSix = new Car("Lexus", "RX", "Black", "HM9-K8J3");
			Car carSeven = new Car("Toyota", "Prius", "Green", "KVY-05U7");
			Car carEight = new Car("Tesla", "Model 3", "Midnight Silver", "87Y-RE74");
			
			//parking cars between the two garages
			parkingGarageWest.park(carOne, 0);
			parkingGarageEast.park(carTwo, 1);
			parkingGarageWest.park(carThree, 2);
			parkingGarageEast.park(carFour, 3);
			parkingGarageWest.park(carFive, 1);
			parkingGarageEast.park(carSix, 2);
			parkingGarageWest.park(carSeven, 3);
			parkingGarageEast.park(carEight, 4);
	
			//Print out the initial inventory of each garage
			System.out.println("The current Inventory of Parking Garage West is: ");
			parkingGarageWest.printInventory();
			System.out.println("\n");
			
			System.out.println( "The current Inventory of Parking Garage East is: ");
			parkingGarageEast.printInventory();
			System.out.println("\n");
			//Moving a car out of a space in parking garage West 
			parkingGarageWest.vacate(2);
			
			
			//current inventory after moving the car out 
			System.out.println("The current Inventory of Parking Garage West after removing a car: ");
			parkingGarageWest.printInventory();
			System.out.println("\n");
			
			//Moving a car into parking garage East
			parkingGarageEast.park(carThree, 5);
			
			//current inventory after moving the car into a new garage 
			System.out.println("The current Inventory of Parking Garage East after adding a car: ");
			parkingGarageEast.printInventory();
			System.out.println("\n");
			
	}

	}


