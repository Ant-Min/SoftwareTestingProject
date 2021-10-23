import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

class AppointmentTest {
	
	static ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	Date date = new Date();
	Appointment a1 = new Appointment("12345",date,"Doctor's appointment");
	
	@Test
	void testAppointment() {
		assertNotNull(a1.getID());
		assertNotNull(a1.getDate());
		assertNotNull(a1.getDescrip());
	}
	
	@Test
	void testSetDate() {
		Date date2 = new Date();
		date.setDate(date.getDate() + 5);
		assertFalse(date.equals(date2));
	}
	
	@Test
	void testSetDescrip() {
		a1.setDescrip("Haircut");
		assertTrue(!(a1.getDescrip().equals("Doctor's appointment")));
	}

}
