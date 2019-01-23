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
		minimum(numbersInt); //helper code to find the smallest number in the list
		maximum(numbersInt);	//helper code to find the largest number in the list and the amount of numbers in the list
		sum(numbersInt); //helper code to find the sum and average of all numbers in the list
	}
	public static void minimum(Integer[] numbersArray) {
		int currentMin = numbersArray[0]; 
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < currentMin) {
				currentMin = numbersArray[i]; // code to find the smallest number is the list
			}
		}
		System.out.println("Minimum number is " + currentMin + ""); //print out the result 
	}

	public static void maximum(Integer[] numbersArray) {
		int currentMax = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] > currentMax) {
				currentMax = numbersArray[i]; //find the largest number in the list
			}
		}
		System.out.println("Maximum number is " + currentMax + ""); //print out the result of the larget number
		System.out.println("Amount of numbers submitted is " + numbersArray.length + ""); //find and print out the number of elements in the list
	}

	public static void sum(Integer[] numbersArray) {
		int sum = 0;

		for (int j = 0; j < numbersArray.length; j++) {
			sum += numbersArray[j]; //add up all of the numbers in the list
		}
		System.out.println("Sum of all numbers submitted is " + sum + ""); //print out the number of elements in the list
		double sumFinal = (double) sum;
		double averageOne = (sumFinal / numbersArray.length); //divide the sum of the list by the amount of numbers in the list to get the average
		
		System.out.println("Average of all numbers submitted is " + averageOne + "");//print out the result
	}
}
