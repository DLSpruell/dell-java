
public class LicenseProgram {

	public static void main(String[] args) {
		
		DriversLicense DL1 = new DriversLicense("Devona", "Spruell", "1989-02-09", "5'8", "Female"); //info for first driver's license
		DriversLicense DL2 = new DriversLicense("William", "Spruell", "1987-08-22", "6'0", "Male");
		DriversLicense DL3 = new DriversLicense("Erikah", "Melvin", "1980-09-10", "5'5", "Female"); //info for third driver's license
		System.out.println("Driver's License One: " + DL1.getFullName() + ": Age " + DL1.getAge());
		System.out.println("Driver's License Two: " + DL2.getFullName() + ": Age " + DL2.getAge());
		System.out.println("Driver's License Three: " + DL3.getFullName() + ": Age " + DL3.getAge());
	
	}
	     
}


