import java.util.Scanner;

public class TicTacToe {

	public static char[][] board;
	public static Scanner reader = new Scanner(System.in);
	public static int playerMoves = 0;

	public static void main(String[] args) {
		// Create the board and initialize the player variable then start game
		board = new char[3][3];
		char player = 'X';

		System.out.println("Welcome to the game tic-tac-toe!");

		printBoard();

		int[] move = new int[2];

		ticTacToe(player, move);
	}

	public static void printBoard() {
		//code to design the board
		System.out.println("\n  0   1   2");
		System.out.println("0 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("  ---------");
		System.out.println("1 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("  ---------");
		System.out.println("2 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
	}

	public static void ticTacToe(char player, int[] move) {
		// request a move from the player
		receiveInput(player, move);

		// method to check whether the move is legal or not
		if (isLegal(move)) {
			board[move[0]][move[1]] = player;
			printBoard();

			// method to check whether there is a winner
			if (checkForWin(player)) {
				winner(player);
			} else if (playerMoves == 8) {
				draw();
			} else {
				playerMoves++;
				player = player == 'X' ? 'O' : 'X';

				System.out.println("It's " + player + "'s turn.");
				ticTacToe(player, move);
			}

		} else { //code to let the user know if the move is invalid
			System.out.println(board[move[0]][move[1]] + " is already in use. Choose another position:");
			ticTacToe(player, move);
		}
	}

	public static void receiveInput(char player, int[] move) {
		// Ask for move from the user and save it to a variable
		System.out.println("It's Player " + player + "'s move. Please enter a row (0 - 2):");
		int row = reader.nextInt();
		System.out.println("Please enter a column (0 - 2):");
		int column = reader.nextInt();

		// code to save the input into the array
		move[0] = row;
		move[1] = column;
	}

	public static boolean isLegal(int[] move) { //code to determine if the move requested is valid
		int row = move[0];
		int col = move[1];
		if (board[row][col] == 'X' || board[row][col] == 'O') {
			return false;
		} else {
			return true;
		}
	}

	public static boolean checkForWin(char player) { //code to check each method for matching markers in each direction
		if (verticalWin(player)) {
			return true;
		} else if (horizontalWin(player)) {
			return true;
		} else if (diagonalWin(player)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean verticalWin(char player) { //code to check if there are three matching markers in a vertical column
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}

		return false;
	}

	public static boolean horizontalWin(char player) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {//code to check if there are three matching markers in a horizontal column
				return true;
			}
		}

		return false;
	}

	public static boolean diagonalWin(char player) { //code to check if there are three matching markers in a diagonal pattern
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		} else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		} else {
			return false;
		}
	}

	public static void draw() { //code to determine if all space have markers and there is no win
		System.out.println("This game is a Draw!");
		reader.close();
	}

	public static void winner(char player) { //code to print out the winner line
		System.out.println(player + " has won!");
		reader.close();
	}

}

