import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

	// create variables
	DAO toDoItem;
	Scanner reader = new Scanner(System.in);
	List<String> methods;
	
	// create constructor
	public Controller() {
		
		this.toDoItem = new DAO();
		this.methods = new ArrayList(Arrays.asList("add", "delete", "mark", "list", "quit", "help"));

	}

	public static void main(String[] args) {

		Controller myController = new Controller(); // instantiate a controller object
		myController.start(); // call the objects start method
	}

	// code to run the program
	public void start() {
		
		printHelp();

		boolean quit = false;
		while (!quit) {
			
			System.out.println("Please enter a command: ");
			String input = reader.nextLine();
			String[] actionParts = input.split(" ");
			String action = actionParts[0].trim();

			if(!methods.contains(action)) {
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
		System.out.println("To-Do List App has ended");
		reader.close();
	}

	// The user requested that a given to-do list be deleted, this is the method
	// sends the request to the to-do list
	public void processDeleteAction(String[] actionParts) {

		if (actionParts.length > 1) {
			System.out.println("Too many inputs to delete command");
			return;
		}
		try {
			System.out.println("Please enter the ID of the task to delete");
			int id = reader.nextInt();
		
			toDoItem.delete(toDoItem.get(id));
			System.out.println("Entry deleted");
		} catch (Exception e) {
			System.out.println("Invalid ID entered");
		}
	}

	// method to process the users request to add an item to the list
	public void processListAction(String[] actionParts) {
		
		
		if (actionParts.length >= 3) {
			System.out.println("Too many inputs to list command");
			return;
		}

		if (actionParts.length == 1) {
			System.out.println("Invalid Command. Please specify which items to list");

		} else if (actionParts.length == 2) {
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
			System.out.println("Invalid Command. Enter Help for list of valid commands");

		}
	}
	// method to mark an item as complete
	public void processCompleteAction(String[] actionParts) {
		
		if (actionParts.length > 2) {
			System.out.println("Too many inputs to perform complete command");
			return;
		}
		try {
			if (actionParts.length == 2 && actionParts[0].equals("mark")) {
				System.out.println("Please enter an ID: ");
				int id = reader.nextInt();
			//	int id = Integer.parseInt(newID);
				toDoItem.markComplete(toDoItem.get(id));
				System.out.println("Item Marked Complete");
			} else {
				System.out.println("Invalid Command");
				return;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ID is incorrect");
		} catch (NullPointerException e) {
			System.out.println("ID is incorrect");
		}
		}
		

	// method to complete request to process add function
	public void processAddAction(String[] actionParts) {

		if (actionParts.length > 1) {
			System.out.println("Too many inputs for add command");
			return;
		}

		System.out.println("Please enter a task description:");
		String description = reader.nextLine();

		if (!description.isEmpty()) {
			toDoItem.add(description, false);
			System.out.println("Entry added");
		} else {
			System.out.println("Please enter a task description");
			return;
		}

	}
	
	public void printHelp() {
		
	        System.out.println("List of valid commands: ");
	        System.out.println(" add:    used to add an entry ");
	        System.out.println(" mark complete:   used to update an item from pending to complete");
	        System.out.println(" list pending:   used to list the pending entries ");
	        System.out.println(" list complete:   used to list the completed entries");
	        System.out.println(" list all:   used to list all entries");
	        System.out.println(" delete:   used to delete an entry");
	        System.out.println(" help:   used to print valid commands");
	        System.out.println(" quit:   used to quit the app");
	        System.out.println();

	    }
	
	//method to create a table
		public void printList(ArrayList<ToDoItem> entries){
			
			String status;

			System.out.printf("%2s | %14s | %s%n", "ID", " Description ", "Status");
			System.out.println("-----------------------------");
			for (int i = 0; i < entries.size(); i++) {

				if (entries.get(i).getCompletedFlag() == true)
					status = "Complete";
				else
					status = "Pending";

				System.out.printf("%2s | %14s |  %s%n", entries.get(i).getId(), entries.get(i).getDescription(), status);
			}
		}
	}

