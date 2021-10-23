import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

class AppointmentServiceTest {
	
	public static void main(String arge[]) {
		
		Date day = new Date();
		Appointment a1 = new Appointment("123", day, "Doctor's appointment");
		AppointmentService.appointments.add(a1);
		
		AppointmentService.runAppointmentService();
	}

}

/*  Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	1
	
	ID: 123
	Date: Tue Sep 28 19:07:26 EDT 2021
	Description: Doctor's appointment
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	2
	
	Enter ID of appointment
	123
	ID already taken
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	2
	
	Enter ID of appointment
	1234567890987654321
	ID cannot be longer than 10 characters and must have a value entered
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	2
	
	Enter ID of appointment
	12345
	
	Enter description of appointment
	Haircut appointment that I cannot miss otherwise I will not look good for picture day
	Appointment cannot be longer than 50 characters and must have a value entered
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	2
	
	Enter ID of appointment
	12345
	
	Enter description of appointment
	Haircut
	
	Enter date of appointment in format "MM-DD-YYYY"
	10052021
	Date not entered correctly
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	2
	
	Enter ID of appointment
	12345
	
	Enter description of appointment
	Haircut
	
	Enter date of appointment in format "MM-DD-YYYY"
	10-05-2020
	Date entered has already passed
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	2
	
	Enter ID of appointment
	12345
	
	Enter description of appointment
	Haircut
	
	Enter date of appointment in format "MM-DD-YYYY"
	10-05-2021
	Appointment added
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	1
	
	ID: 123
	Date: Tue Sep 28 19:07:26 EDT 2021
	Description: Doctor's appointment
	ID: 12345
	Date: Tue Oct 05 00:00:00 EDT 2021
	Description: Haircut
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	3
	
	Enter ID of appointment
	12
	Appointment not found
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	3
	
	Enter ID of appointment
	123
	Appointment removed
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	1
	
	ID: 12345
	Date: Tue Oct 05 00:00:00 EDT 2021
	Description: Haircut
	
	Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit
	0
	
	Goodbye */
