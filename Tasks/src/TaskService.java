/* TaskService is a class that utilizes the Task class to add, view, update, or remove tasks within set parameters.
 * @author Anthony Minunni
 * @date 9/21/21 */

import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {
	
	static Scanner scnr = new Scanner(System.in); //Scanner for user inputs
	
	//runTaskService is the main method of the class
	public static void runTaskService() {
		
		//ArrayList of tasks
		ArrayList<Task> tasks = new ArrayList<Task>();
		
		//String values for each task
		String id;
		String name;
		String descrip;
		
		
		boolean run = true; //used in the while loop below
		boolean notFound = true; //used to search the ID entered by the user
		
		while (run) {
			System.out.println("Press 1 to add new task, 2 to see current tasks, 3 to change a task, "
					+ "4 to delete a task, or 0 to exit.");
			String choice = scnr.nextLine();
			
			switch (choice) {
				//case 1 has user enter new task information, which runs it in the scannerTests method to verify criteria	
				case "1":
					System.out.println("Enter a task ID");
					id = scnr.nextLine();
					System.out.println("Enter a task name");
					name = scnr.nextLine();
					System.out.println("Enter a task description");
					descrip = scnr.nextLine();
					boolean check = scannerTests(tasks, id, name, descrip);
					if(check == true) {
						Task t1 = new Task(id, name, descrip);
						tasks.add(t1);
						System.out.println("Task added.\n");
					}
					break;
				//case 2 prints out current tasks held in tasks ArrayList using toString in Task class
				case "2":
					//will not print if tasks is empty
					if(tasks.size() > 0) {
						for(int i = 0; i < tasks.size(); i++) {
							System.out.println(tasks.get(i).toString());
						}
					}
					else {
						System.out.println("No tasks yet.\n");
					}
					break;
				//case 3 asks user to enter ID of task to update either the name or description. Will let user know if ID was not found
				case "3":
					if(tasks.size()>0) {
						System.out.println("Enter ID of task to update.");
						id = scnr.nextLine();
						//for loop to find ID and send user input to updateTask method
						for(int i = 0; i < tasks.size(); i++) {
							if(id.equals(tasks.get(i).getID())){
								notFound= false;
								System.out.println("Type \"name\" to change name of task or \"description\" to change description");
								String update = scnr.nextLine();
								updateTask(tasks, id, update);
							}
						}
					}
					else {
						System.out.println("No tasks yet.");
						break;
					}
					if (notFound) {
						System.out.println("ID not found.");
					}
					break;
				//case 4 will search tasks ArrayList for entered ID to remove task from list. Will not search if tasks is empty and will let user
				//	know if ID was not found
				case "4":
					if(tasks.size() == 0) {
						System.out.println("There are no tasks");
					}
					else {
						System.out.println("Enter ID of task to delete");
						id = scnr.nextLine();
						for(int i=0; i < tasks.size();i++) {
							if(id.equals(tasks.get(i).getID())) {
								notFound = false;
								tasks.remove(i);
								System.out.println("Task deleted.");
							}
						}
						if(notFound) {
							System.out.println("Task not found");
						}
					}
					break;
				//case 0 ends program
				case "0":
					System.out.println("Goodbye!");
					run = false;
					break;
				//default print message if user did not enter a valid option
				default:
					System.out.println("Only 1, 2, 3, 4, and 0 are acceptible options.\n");
					break;
			}
		}
		
		scnr.close();
		
	}
	
	/* scannerTests ensures entered data meets the criteria of no null data and data is within character limits
	 * @param tasks is main ArrayList of tasks
	 * @param id is task ID
	 * @param name is task name
	 * @param descrip is task description
	 * @return true if all data is valid
	 * @return false if one or more data values is invalid
	 */
	public static boolean scannerTests(ArrayList<Task> tasks, String id, String name, String descrip) {
		//numErrors counts number of invalid data of entered task
		int numErrors = 0;
		
		//for loop to make sure user is not entering an ID already taken
		if(tasks.size() > 0) {
			for(int i = 0; i < tasks.size(); i++) {
				if(tasks.get(i).getID().equals(id)) {
					System.out.println("ID has already been taken\n");
					return false;
				}
			}
		}
		
		//if statement to check ID validity; will let user know if ID is invalid
		if(id.equals(null) || id.equals(" ") || id.equals("") || id.length() > 10) {
			System.out.println("ID must have an entry and must be shorter than 10 characters.\n");
			numErrors++;
		}

		//if statement to check name validity; will let user know if name is invalid
		if(name.equals(null) || name.equals(" ") || name.equals("") || name.length() > 20) {
			System.out.println("Name must have an entry and must be shorter than 20 characters.\n");
			numErrors++;
		}
		//if statement to check description validity; will let user know if description is invalid		
		if(descrip.equals(null) || descrip.equals(" ") || descrip.equals("") || descrip.length() > 50) {
			System.out.println("Description must have an entry and must be shorter than 50 characters.\n");
			numErrors++;
		}
		
		//if statement that lets user know if task was not added.
		if(numErrors > 0) {
			System.out.println("Task not added for reasons above. Please try again.");
			return false;
		}
		else
			return true;
	}
	
	/* updateTask updates a task's name or description based on user input
	 * @param tasks is ArrayList of tasks
	 * @param id is task id
	 * @param update is user's choice to update name or description */
	public static void updateTask(ArrayList<Task> tasks, String id, String update) {
		
		//switch statement based on if name or description is being updated. Conditions used above are tested again
		switch (update) {
			case "name":
				System.out.println("Enter new name of task");
				String name = scnr.nextLine();
				if(name.equals(null) || name.equals(" ") || name.equals("") || name.length() > 20) {
					System.out.println("Name must have an entry and must be shorter than 20 characters.\n");
					break;
				}
				else {
					for(int i=0; i < tasks.size(); i++) {
						if(id.equals(tasks.get(i).getID())) {
							tasks.get(i).setName(name);
							System.out.println("Task Updated.");
						}
					}
				}
				break;
			case "description":
				System.out.println("Enter new description of task");
				String descrip = scnr.nextLine();
				if(descrip.equals(null) || descrip.equals(" ") || descrip.equals("") || descrip.length() > 50) {
					System.out.println("Description must have an entry and must be shorter than 20 characters.\n");
					break;
				}
				else {
					for(int i=0; i < tasks.size(); i++) {
						if(id.equals(tasks.get(i).getID())) {
							tasks.get(i).setDescription(descrip);
							System.out.println("Task Updated.");
						}
					}
				}
				break;
			//if user did not type name or description
			default:
				System.out.println("Not a valid option.");
				break;
		}
		
	}

}
