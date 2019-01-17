import java.util.Scanner;
import java.util.Arrays;

public class Statistics {

	public static void main(String[] args) {
		
		System.out.println("Please enter a list of numbers separated by commas.");
		Scanner reader = new Scanner(System.in);
		String numbersString = reader.nextLine();
		
		reader.close();
		String[] numbersArray = numbersString.split(","); //returns the list split up by commas//rename to make sense
		Integer[] numbersInt = new Integer[numbersArray.length];      //returns each item in the list as an integer
		for (int i = 0; i < numbersArray.length; i++) { //for each item this is true, set it to variable num
			Integer num = Integer.parseInt(numbersArray[i]); 
			numbersInt[i] = num;
		}
		minimum(numbersInt);
		maximum(numbersInt);	
		sum(numbersInt);
	}
	public static void minimum(Integer[] numbersArray) {
		int currentMin = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < currentMin) {
				currentMin = numbersArray[i];
			}
		}
		System.out.println("Minimum number is " + currentMin + "");
	}

	public static void maximum(Integer[] numbersArray) {
		int currentMax = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] > currentMax) {
				currentMax = numbersArray[i];
			}
		}
		System.out.println("Maximum number is " + currentMax + "");
		System.out.println("Amount of numbers submitted is " + numbersArray.length + "");
	}

	public static void sum(Integer[] numbersArray) {
		int sum = 0;

		for (int j = 0; j < numbersArray.length; j++) {
			sum += numbersArray[j];
		}
		System.out.println("Sum of all numbers submitted is " + sum + "");
		int averageOne = sum / numbersArray.length;
		String averageTwo = Integer.toString(averageOne);
		double averageFinal = Double.parseDouble(averageTwo);
		System.out.println("Average of all numbers submitted is " + averageFinal + "");
	}
}
