import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAO {

	// create new list
	private ArrayList<ToDoItem> listing;

	// create constructor
	public DAO() {

		listing = new ArrayList();
	}

	// create add method
	public void add(String description, boolean complete) {

		ToDoItem newEntry = new ToDoItem(description, complete);
		listing.add(newEntry);

	}

	// create delete method
	public void delete(ToDoItem entry) {
		listing.remove(entry.getId() - 1);
	}

	public ArrayList<ToDoItem> list(String status) {
		
		ArrayList<ToDoItem> temp = new ArrayList<>();
		
		if (status.equals("all")) {
			return listing;
		}
		else if (status.equals("pending")) {
			for (ToDoItem entry : listing) {
				if (entry.getCompletedFlag() == false) {
					temp.add(entry);
				}
			}
		}
		else if (status.equals("complete")) {
			for (ToDoItem entry : listing) {
				if (entry.getCompletedFlag() == true)
						temp.add(entry);
			}
		}
		return temp;
	}

	

	// method to mark items as complete
	public void markComplete(ToDoItem entry) {
		System.out.println(entry.getId());
		listing.get(entry.getId() - 1).setCompletedFlag(true);
		
	}

	public ToDoItem get(int id) {
		for (int i = 0; i < listing.size(); i++) {
			ToDoItem currEntry = listing.get(i);
			if (currEntry.getId() == id) {
				return currEntry;
			}
		}
		return null;
	}

}
