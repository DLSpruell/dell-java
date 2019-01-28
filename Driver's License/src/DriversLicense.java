
import java.time.LocalDate;
import java.time.Period;


public class DriversLicense {

	//attributes
	public String firstName;
	public String lastName;
	public String dateOfBirth;
	public String height;
	public String gender;
	
	//code to get and set the data
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	//code to get the height
	public 	String getHeight() {
			return this.height;
		}
	//code to get the gender
	public	String getGender() {
			return this.gender;
		}
	
	//constructor
	public DriversLicense(String firstName, String lastName, String dateOfBirth, String height, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.gender = gender;
		
	}
	
	//method to concatenate the first and last name to return the full name
	public String getFullName() {
		return (this.firstName + " " + this.lastName);
	}
	// method to return the date of birth
	String dateOfBirth() {
		return this.dateOfBirth;
	}
	// method to return the age
	int getAge() {
		LocalDate birthDate = LocalDate.parse(this.dateOfBirth);
		LocalDate currentDate = LocalDate.now();
	    return Period.between(birthDate, currentDate).getYears();
	}
	
}