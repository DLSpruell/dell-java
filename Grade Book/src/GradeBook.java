import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class GradeBook {

	public static void main(String[] args) {
		
		// request the number of students
		System.out.println("Please enter the total number of students.");
		Scanner reader = new Scanner(System.in);
		int numOfStudents = Integer.parseInt(reader.nextLine());

		// create the HashMap to store the grades 
		HashMap<String, String> studentGrades = new HashMap<String, String>();

		for(int i = 0; i < numOfStudents; i++) {
			System.out.println("Please enter the student's name?");
			String name = reader.nextLine();

			System.out.println("Please enter the student's grades: ");
			String grades = reader.nextLine();

			studentGrades.put(name, grades);
		}

		reader.close();

		// Create new hashmap to save the average grades
		HashMap<String, Double> gradeAverages = new HashMap<String, Double>();

		// save all of the names into an array
		ArrayList<String> names = new ArrayList<String>(studentGrades.keySet());

		// store the information in the map
		for(int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			double gradeAverage = average(studentGrades.get(name));

			gradeAverages.put(name, gradeAverage);
		}
		//return the names and average grades
		System.out.println("Grade Book shows: " + gradeAverages);
	}

	// method to calculate and return the average
	public static double average(String grades) {
		double total =  0;
		String[] gradeArray = grades.split(",");
		for(int i = 0; i < gradeArray.length; i++) {
			total += Double.parseDouble(gradeArray[i]);
		}

		return total / gradeArray.length;
	}

}


