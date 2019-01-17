import java.util.Scanner;
import java.util.Arrays;

public class Statistics {

	public static void main(String[] args) {
		
		System.out.println("Please enter a list of numbers in separated by commas.");
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
//		minimum(); //function needs to find the min of the list of numbers
//		maximum(); //function needs to find the max of the list of numbers
//		amountOfNumbers(); //function needs to find the amount of numbers received from the user
//		average(); //function needs to find the average of the list of numbers
//		sum();	//function needs to find the sum of all numbers
	}
	
	public static void minimum(Integer[] numbersArray) { 
		int currentMin = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if	(numbersArray[i] < currentMin) {
				currentMin = numbersArray[i];
			} 
		} System.out.println("Minimum number is " + currentMin + "");
	} 
	public static void maximum(Integer[] numbersArray) { 
		int currentMax = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if	(numbersArray[i] > currentMax) {
				currentMax = numbersArray[i];
			} 
		} System.out.println("Maximum number is " + currentMax + "");
		System.out.println("Amount of numbers submitted is " + numbersArray.length + "");
	} 
	public static void sum(Integer[] numbersArray) { 
		int sum = 0;
		
		for (int j = 0; j < numbersArray.length; j++) {
			sum += numbersArray[j];
			} 
		 System.out.println("Sum of all numbers submitted is " + sum + "");
		 int average = sum / numbersArray.length;
		 System.out.println("Average of all numbers submitted is " + average + "");
	}
}	
	


		
		
	

