import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Please choose either rock, paper, or scissors.");
		Scanner reader = new Scanner(System.in);
		String playerHand = reader.nextLine();

		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(3); // Give me a random number between 0 (inclusive) and 3 (exclusive) ->
													// // 0, 1, or 2
		String computerHand = "";
		if (randNum == 0) {
			computerHand = "rock";
		} else if (randNum == 1) {
			computerHand = "paper";
		} else if (randNum == 2) {
			computerHand = "scissors";
		}
		System.out.println("You've chosen " + playerHand + " and the computer chose " + computerHand + ".");
		winner(playerHand, computerHand);
		System.out.println("Thanks for Playing!");
		reader.close();
	}

		public static String winner(String playerHand, String computerHand) {
			String winner = "";
			
			if ((playerHand.equals("rock")) && computerHand.equals("rock")) {
				System.out.println("Game is a draw.");
			} else if ((playerHand.equals("paper")) && computerHand.equals("paper")) {
				System.out.println("Game is a draw.");
			} else if ((playerHand.equals("scissors")) && computerHand.equals("scissors")) {
				System.out.println("Game is a draw.");
			} else if ((playerHand.equals("rock")) && computerHand.equals("paper")) {
				System.out.println("Paper covers rock. Computer has won!");
			} else if ((playerHand.equals("paper")) && computerHand.equals("rock")) {
				System.out.println("Paper covers rock. You've won!");
			} else if ((playerHand.equals("scissors")) && computerHand.equals("paper")) {
				System.out.println("Scissors cuts paper. You've won!");
			} else if ((playerHand.equals("paper")) && computerHand.equals("scissors")) {
				System.out.println("Scissors cuts paper. Computer has won!");
			} else if ((playerHand.equals("scissors")) && computerHand.equals("rock")) {
				System.out.println("Rock breaks scissors. Computer has won!");
			} else if ((playerHand.equals("rock")) && computerHand.equals("scissors")) {
				System.out.println("Rock breaks scissors. You've won!");
			}
			return winner;
		
	}
}
