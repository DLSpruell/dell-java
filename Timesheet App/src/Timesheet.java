import java.util.List;
import java.util.ArrayList;

public class Timesheet {
	
	private List<TimesheetEntry> database;
	
	public Timesheet() {
		database = new ArrayList<>();
	}
	
	
	public List<TimesheetEntry> getDatabase() {
		return database;
	}


	public void setDatabase(List<TimesheetEntry> database) {
		this.database = database;
	}


	public void add(String project, String task) {
		
		TimesheetEntry entryOne = new TimesheetEntry(project, task); //create a new time sheet entry
		database.add(entryOne); //add the entry to the time sheet database
	}
	
//	public static void list(Controller myController) {
//		List<TimesheetEntry> database = myController.getDatabase();
//		for (int i = 0; i < database.size(); i++) {
//			TimesheetEntry currEntry = database.get(i);
//			System.out.println("Project: " + currEntry.getProjectName() + ", Task: " + currEntry.getTask());
//		}
//	}
	
	public static void get(int id) {
		
	}

}
