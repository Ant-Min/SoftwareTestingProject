/* Task is a class that creates and holds tasks objects with methods to set and retrive certain values.
 * @author Anthony Minunni
 * @date 9/21/21 */

public class Task {
	
	//private variables of a task's ID, name, and description
	private String id;
	private String name;
	private String description;
	
	/* fully qualified constructor
	 * @param ident is task ID
	 * @param call is task name
	 * @param descrip is task description */
	public Task(String ident, String call, String descrip) {
		id = ident;
		name = call;
		description = descrip;
	}
	
	/* getID retrieves a task's ID
	 * @return id */
	public String getID() {
		return id;
	}
	
	/* setName sets a task's name
	 * @param newname is the updated task name */
	public void setName(String newName) {
		name = newName;
	}
	
	/* getName retrieves a task's name
	 * @return name */
	public String getName() {
		return name;
	}
	
	/* setDescription updates a task's description
	 * @param descrip is the updated task description */
	public void setDescription(String descrip) {
		description = descrip;
	}
	
	/* getDescription retrieves a task's description
	 * @return description */
	public String getDescription() {
		return description;
	}
	
	/* toString is a formatted String of a task's information
	 * @return String */
	public String toString() {
		return "ID: " + this.getID() + "\nName: " + this.getName() + "\nDescription: " + this.getDescription() + "\n";
	}

}
