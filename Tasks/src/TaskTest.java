import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

	static Task t1 = new Task("1", "Test Project", "Make sure it works");
	
	@Test
	public void testTask() {
		assertNotNull(t1.getID());
		assertNotNull(t1.getName());
		assertNotNull(t1.getDescription());
	}
	
	@Test
	public void testGetID() {
		assertTrue(t1.getID() != null);
	}
	
	@Test
	public void testSetName() {
		t1.setName("characters");
		assertEquals(t1.getName(), "characters");
	}

	@Test
	public void testGetName() {
		assertNotNull(t1.getName());
	}

	@Test
	public void testSetDescription() {
		t1.setDescription("characters");
		assertEquals(t1.getDescription(), "characters");
	}

	@Test
	public void testGetDescription() {
		assertNotNull(t1.getDescription());
	}

	@Test
	public void testToString() {
		assertEquals(t1.toString(), "ID: " + t1.getID() + "\nName: " + t1.getName() + "\nDescription: " + t1.getDescription() + "\n");
	}

}
