import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
			//while loop to check the users entry, if true then proceed, if false re-ask for an entry
			Scanner reader = new Scanner(System.in);	
			String playerHand = "";
			boolean shouldContinue = true;
			while (shouldContinue) 
				try { 
						System.out.println("Please choose either rock, paper, or scissors.");
						playerHand = reader.nextLine();
						helperMethod(playerHand);
						shouldContinue = false;		
					} catch (InputMismatchException e) {
						System.out.println("Try Again");
					}	
					
						String computer = randomNum();
						System.out.println("You've chosen " + playerHand + " and the computer chose " + computer + ".");
						winner(playerHand, computer);
						}	
				
						
				
			
// method says to throw exception is anything other these entries are received
	public static void helperMethod(String playerHand) {
		if (!(playerHand.equals("rock") || playerHand.equals("paper") || playerHand.equals("scissors"))) {
		throw new InputMismatchException();
		}
	}

	//method to choose a random number and set it to the computers entry
	public static String randomNum() {
		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(3); // Give me a random number between 0 (inclusive) and 3 (exclusive)
		String computerHand = "";

		if (randNum == 0) {
			computerHand = "rock";
		} else if (randNum == 1) {
			computerHand = "paper";
		} else if (randNum == 2) {
			computerHand = "scissors";
		}
		return computerHand;
	}

	//method to determine who wins based off both entries
	public static String winner(String playerHand, String computer) {
		String winner = "";

		if ((playerHand.equals("rock")) && computer.equals("rock")) {
			System.out.println("Game is a draw.");
		} else if ((playerHand.equals("paper")) && computer.equals("paper")) {
			System.out.println("Game is a draw.");
		} else if ((playerHand.equals("scissors")) && computer.equals("scissors")) {
			System.out.println("Game is a draw.");
		} else if ((playerHand.equals("rock")) && computer.equals("paper")) {
			System.out.println("Paper covers rock. Computer has won!");
		} else if ((playerHand.equals("paper")) && computer.equals("rock")) {
			System.out.println("Paper covers rock. You've won!");
		} else if ((playerHand.equals("scissors")) && computer.equals("paper")) {
			System.out.println("Scissors cuts paper. You've won!");
		} else if ((playerHand.equals("paper")) && computer.equals("scissors")) {
			System.out.println("Scissors cuts paper. Computer has won!");
		} else if ((playerHand.equals("scissors")) && computer.equals("rock")) {
			System.out.println("Rock breaks scissors. Computer has won!");
		} else if ((playerHand.equals("rock")) && computer.equals("scissors")) {
			System.out.println("Rock breaks scissors. You've won!");
		}
		return winner;

	}

}
