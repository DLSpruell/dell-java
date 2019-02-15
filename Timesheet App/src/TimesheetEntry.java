import java.time.LocalDateTime;

public class TimesheetEntry {
	
	//create variables
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	private static int NEXTID = 1;
	
	//create constructor
	public TimesheetEntry( String myProject, String myTask) {
		this.projectName = projectName;
		this.task = task;
		this.startTime = LocalDateTime.now();
		this.id = NEXTID;
		NEXTID++;
		
	}

	//create getter methods for all variables
	public String getProjectName() {
		return projectName;
	}

	public String getTask() {
		return task;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public static int getNEXTID() {
		return NEXTID;
	}
	
	//create method to update the end time
	public void updateEndTime() {
		endTime = LocalDateTime.now();
		}
	}
	

