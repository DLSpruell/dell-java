
public class ToDoItem {
	//create variables
		private int id;
		private String description;
		private boolean complete;
		private static int NEXTID = 1;
	
		
		//create constructor
		public ToDoItem(String description , boolean complete) {
			
			this.id = NEXTID++;
			this.description = description;
			this.complete = complete;
		
		}

		//add getter and setter methods
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public boolean getCompletedFlag() {
			return complete;
		}

		public void setCompletedFlag(boolean complete) {
			this.complete = complete;
		}
		
		public static int getNEXTID() {
			return NEXTID;
		}

		

		
}	
		 

