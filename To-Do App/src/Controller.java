import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

	// create new variables for the class
	DAO toDoItem;
	Scanner reader = new Scanner(System.in);
	List<String> methods;

	// create constructor for the class
	public Controller() {

		this.toDoItem = new DAO();
		this.methods = new ArrayList(Arrays.asList("add", "delete", "mark", "list", "quit", "help"));
	}

	// code for the main section to allow the controller to work
	public static void main(String[] args) {

		Controller myController = new Controller(); // instantiate a controller object
		myController.start(); // call the objects start method
	}

	// code that determines what the programs does while it runs
	public void start() {

		printHelp(); // print the command for the user

		boolean quit = false;
		while (!quit) { // run all of these commands until the user enters the quit command

			System.out.println("Please enter a command: ");
			String input = reader.nextLine();
			String[] actionParts = input.split(" ");
			String action = actionParts[0].trim(); // code to split the user's input and only focus on the first word

			if (!methods.contains(action)) {// depending on what the user enters, run the following methods
				System.out.println("Invalid Command. Please enter a command. Enter help if needed");
				continue;
			}
			if (action.equals("add")) {

				processAddAction(actionParts);

			} else if (action.equals("delete")) {

				processDeleteAction(actionParts);

			} else if (action.equals("list")) {

				processListAction(actionParts);

			} else if (action.equals("mark")) {

				processCompleteAction(actionParts);

			} else if (action.equals("quit")) {

				quit = true;

			} else if (action.equals("help")) {

				printHelp();

			} else {

				System.out.println("Invalid Input. Please enter help for list of commands.");
			}
		}
		System.out.println("Confirmed: To-Do List App has ended");
		reader.close();
	}

	// code to process the user's delete request
	public void processDeleteAction(String[] actionParts) {

		if (actionParts.length > 1) {
			System.out.println("Too many inputs to delete command");// code to check if the user enters too many words
			return;
		}
		try {
			System.out.println("Please enter the ID of the task to delete");// code for user to enter the id of the
																			// deleted task
			int id = reader.nextInt();

			toDoItem.delete(toDoItem.get(id));// code to take the id given and perform the delete method
			System.out.println("Confirmed: Entry deleted");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Invalid ID entered");// code to check if the user enters something other than whats
														// asked
		}
	}

	// method to process the users request to add an item to the list
	public void processListAction(String[] actionParts) {

		if (actionParts.length >= 3) {
			System.out.println("Too many inputs to list command");// if the user enters more than 3 or more words then
																	// error will be returned
			return;
		}

		if (actionParts.length == 1) {
			System.out.println("Invalid Command. Please specify which items to list");// if user enters too few words
																						// then error will be returned

		} else if (actionParts.length == 2) {// code to split up the list method into list only pending, list only
												// complete or list all items
			if (actionParts[1].equals("all")) {
				printList(toDoItem.list("all"));
				return;
			} else if (actionParts[1].equals("pending")) {
				printList(toDoItem.list("pending"));
				return;
			} else if (actionParts[1].equals("complete")) {
				printList(toDoItem.list("complete"));
				return;
			}
			System.out.println("Invalid Command. Enter Help for list of valid commands.");

		}
	}

	// method to process the user's request to mark an item as complete
	public void processCompleteAction(String[] actionParts) {

		if (actionParts.length > 2) {
			System.out.println("Too many inputs to perform complete command");// code to check if the user enters more
																				// than two words for input
			return;
		}
		try {
			if (actionParts.length == 2 && actionParts[0].equals("mark")) {// code to make sure user enters a two worded
																			// request with the first word being mark.
																			// To distinguish from other commands
				System.out.println("Please enter an ID: ");// code to request the id of the task the user wants to mark
															// as complete
				int id = reader.nextInt();

				toDoItem.markComplete(toDoItem.get(id));// based on the id given, perform the markComplete method on the
														// item
				System.out.println("Confirmed: Item Marked Complete");
				System.out.println();
			} else {
				System.out.println("Invalid Command");
		//		return;
			}
		} catch (NullPointerException e) {// code to check for incorrect ID inputs or blanks
			System.out.println("ID is incorrect. Please enter ID");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ID is incorrect. Please enter ID");
		}
	}

	// method to complete request to process add function
	public void processAddAction(String[] actionParts) {

		if (actionParts.length > 1) {
			System.out.println("Too many inputs for add command");// code to throw error is the user enters too many
																	// words
			return;
		}

		System.out.println("Please enter a task description:");// code to request user to enter a task description
		String description = reader.nextLine();

		if (!description.isEmpty()) {// as long as the user entered something, the add method will run to add that
										// item to the list
			toDoItem.add(description, false);
			System.out.println("Confirmed: Entry added");
			System.out.println();
		} else {
			System.out.println("Please enter a task description");
			return;
		}

	}

	public void printHelp() {// code printed to show the user what commands are valid for this app

		System.out.println(" List of valid commands (case sensitive): ");
		System.out.println(" [add]:             add an entry ");
		System.out.println(" [mark complete]:   update an item from pending to complete");
		System.out.println(" [list pending]:    list the pending entries ");
		System.out.println(" [list complete]:   list the completed entries");
		System.out.println(" [list all]:        list all entries");
		System.out.println(" [delete]:          delete an entry");
		System.out.println(" [help]:            print valid commands");
		System.out.println(" [quit]:            quit the app");
		System.out.println();

	}

	// method to create a table
	public void printList(ArrayList<ToDoItem> entries) {// code to construct/format the table, as well as set the task status and each added task line
														

		String status;

		System.out.printf("%2s | %8s | %s%n", "ID", "Status", "Description");// format line that determines how the header of the list will look
																				
		System.out.println("--------------------------------");
		for (int i = 0; i < entries.size(); i++) {// for loop to cycle thru all items to set the status as either complete or pending
													

			if (entries.get(i).getCompletedFlag() == true)// code to determine whether an item will show pending or completed, based on the flag set
															
				status = "Complete";
			else
				status = "Pending";

			System.out.printf("%2s | %8s | %s%n", entries.get(i).getId(), status, entries.get(i).getDescription());// code to determine how variables will show on the list
																												
		}
	}
}
