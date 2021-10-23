import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskServiceTest {
	
	static Task t1 = new Task("1","Test Project","Make sure it works");
	static Task t2 = new Task("toomanyletters","2toomanylettersagain","okay now this is getting ridiculous");
	static ArrayList<Task> tasks = new ArrayList<Task>(Arrays.asList(t1,t2));
	static Task t3 = new Task("12345", "Wash dishes", "They've been sitting in the sink");
	
	@Test
	public void testRunTaskService() {
	}
	
	@Test
	public void testScannerTests() {

		assertTrue(TaskService.scannerTests(tasks,t3.getID(),t3.getName(),t3.getDescription()));
		assertFalse(TaskService.scannerTests(tasks,t2.getID(),t2.getName(),t2.getDescription()));
	}
	
	@Test
	public void testUpdateTask() {
	}
	
  /* public static void main(String[] args) {
	  TaskService.runTaskService();
  } */

}

/* 
	I tried to figure out how to use JUnit testing using a Scanner, but I could not figure it out.
	I added a test run as a comment to make up for this.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	3
	No tasks yet.
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	2
	No tasks yet.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	4
	There are no tasks
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	5
	Only 1, 2, 3, 4, and 0 are acceptible options.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	1
	
	Enter a task ID
	123456677890867686
	
	Enter a task name
	This will have a task later
	
	Enter a task description
	I don't know what the task is at the moment, just that I will add one.
	
	ID must have an entry and must be shorter than 10 characters.
	
	Name must have an entry and must be shorter than 20 characters.
	
	Description must have an entry and must be shorter than 50 characters.
	
	Task not added for reasons above. Please try again.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	1
	
	Enter a task ID
	123
	
	Enter a task name
	Buy clothes
	
	Enter a task description
	My current clothes do not fit
	
	Task added.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	2
	
	ID: 123
	Name: Buy clothes
	Description: My current clothes do not fit
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	3
	
	Enter ID of task to update.
	12
	
	ID not found.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	3
	
	Enter ID of task to update.
	123
	
	Type "name" to change name of task or "description" to change description
	id
	
	Not a valid option.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	3
	
	Enter ID of task to update.
	123
	
	Type "name" to change name of task or "description" to change description
	name
	
	Enter new name of task
	Mow lawn
	
	Task Updated.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	2
	
	ID: 123
	Name: Mow lawn
	Description: My current clothes do not fit
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	4
	
	Enter ID of task to delete
	3
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	4
	
	Enter ID of task to delete
	123
	
	Task deleted.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	2
	
	No tasks yet.
	
	Press 1 to add new task, 2 to see current tasks, 3 to change a task, 4 to delete a task, or 0 to exit.
	0
	Goodbye! */