
public class CarLotProgram {
		
	public static void main(String[] args) {
		
				
		//instantiate parking garages with different amount of spaces
		CarLot lotOne = new CarLot("Lot One East");
		CarLot lotTwo = new CarLot("Lot Two West");
		
		//instantiate cars
		Car carOne = new Car("AHA-3428", "Chevrolet", "Cobalt", 21000.57, "Sedan", 4);
		Car carTwo = new Car("HE9-8UJ3", "Audi", "Q4", 40000, "Coupe", 2 );
		Car carThree = new Car("WAR-89U7", "Toyota", "Camry", 30000, "Sedan", 4);
	
		//instantiate trucks
		Truck truckOne = new Truck("HYG-3428", "Dodge", "Ram", 35000, "76 inches");
		Truck truckTwo = new Truck("KVY-05U7", "Ford", "F150", 39000, "67 inches");
		Truck truckThree = new Truck("HM9-K8J3", "Cadillac", "EXT", 38200, "67 inches");
		
		//add cars and trucks to various lots
		lotOne.addVehicle(carOne);
		lotTwo.addVehicle(carTwo);
		lotOne.addVehicle(truckOne);
		lotTwo.addVehicle(truckTwo);
		
		//Print out the inventory of each lot
				
		lotOne.printInventory();
		lotTwo.printInventory();
		
	}
}