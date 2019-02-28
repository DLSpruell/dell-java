import java.util.ArrayList;



public class DAO {

	// create a new array list to hold all of the info
	private ArrayList<ToDoItem> listing;

	// create constructor for this class
	public DAO() {
		
		listing = new ArrayList();
	}

	// method to add item to the to-do list
	public void add(String description, boolean complete) {

		ToDoItem newEntry = new ToDoItem(description, complete);//code that takes the user's task description and completed flag to sets it as a new entry
		listing.add(newEntry); //code that adds that info to the list

	}

	// method to delete an item from the to-do list
	public void delete(ToDoItem entry) {
		listing.remove(entry.getId() - 1);//code that will identify the task by the Id and then delete it from the list
	}

	// method to list the items in the to-do list
	public ArrayList<ToDoItem> list(String status) {
		
		ArrayList<ToDoItem> temp = new ArrayList<>();//code use to return the items in the list based on the complete flag setting 
		
		if (status.equals("all")) {//if the user wants to list everything, return everything
			return listing;
		}
		else if (status.equals("pending")) {//if the user wants to list only pending items, list all of those with a complete flag as false
			for (ToDoItem entry : listing) {
				if (entry.getCompletedFlag() == false) {
					temp.add(entry);
				}
			}
		}
		else if (status.equals("complete")) {//if the user wants to list only completed items, list all of those with a complete flag as true
			for (ToDoItem entry : listing) {
				if (entry.getCompletedFlag() == true)
						temp.add(entry);
			}
		}
		return temp;
	}

	

	// method to mark items as complete
	public void markComplete(ToDoItem entry) {
		
		listing.get(entry.getId() - 1).setCompletedFlag(true);//based on the user's id input, set the completed flag as true
		
	}

	public ToDoItem get(int id) {//code that allows the user to tell the app which item they want to manipulate based on the id given
		for (int i = 0; i < listing.size(); i++) {
			ToDoItem currEntry = listing.get(i);
			if (currEntry.getId() == id) {
				return currEntry;
			}
		}
		return null;
	}

}
