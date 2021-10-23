import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class AppointmentService {
	
	static Scanner scnr = new Scanner(System.in);
	static boolean run = true;
	static ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public static void runAppointmentService() {
		
		while(run) {
			System.out.println("Press 1 to view current appointments, 2 to add an appointment, 3 to remove an appointment, or 0 to quit");
			String choice = scnr.nextLine();
			
			switch (choice) {
				
				case "1":
					if(appointments.size() < 1) {
						System.out.println("There are no appointments");
						break;
					}
					else {
						for(int i = 0; i < appointments.size(); i++) {
							System.out.println(appointments.get(i).toString());
						}
					}
					break;
				
				case "2":
					addAppointment();
					break;
				
				case "3":
					boolean notFound = true;
					System.out.println("Enter ID of appointment");
					String remove = scnr.nextLine();
					if(appointments.size() < 1) {
						System.out.println("There are no appointments");
						break;
					}
					else {
						for(int i = 0; i < appointments.size(); i++) {
							if(remove.equals(appointments.get(i).getID())) {
								notFound = false;
								appointments.remove(i);
								System.out.println("Appointment removed");
								break;
							}
						}
					}
					if(notFound) {
						System.out.println("Appointment not found");
					}
					break;
				
				case "0":
					System.out.println("Goodbye");
					run = false;
					break;
				
				default:
					System.out.println("Not a valid option");
			}
		}
		
		scnr.close();
	}
	
	public static void addAppointment() {
		System.out.println("Enter ID of appointment");
		String id = scnr.nextLine();
		
		if(id.equals(null) || id.equals("") || id.equals(" ") || id.length() > 10) {
			System.out.println("ID cannot be longer than 10 characters and must have a value entered");
			return;
		}
		
		if(appointments.size() > 0) {	
			for(int i = 0; i < appointments.size(); i++) {
				if(appointments.get(i).getID().equals(id)) {
					System.out.println("ID already taken");
					return;
				}
			}
		}
		
		System.out.println("Enter description of appointment");
		String appoint = scnr.nextLine();
		
		if(appoint.equals(null) || appoint.equals("") || appoint.equals(" ") || appoint.length() > 50) {
			System.out.println("Appointment cannot be longer than 50 characters and must have a value entered");
			return;
		}
		
		System.out.println("Enter date of appointment in format \"MM-DD-YYYY\"");
		String schedule = scnr.nextLine();
		Date date = new Date();
		
		if(schedule.length() != 10 && schedule.charAt(2)!='-' && schedule.charAt(2)!='-') {
			System.out.println("Date not entered correctly");
			return;
		}
		
		try {
			int month = Integer.parseInt(schedule.substring(0,2));
			int day = Integer.parseInt(schedule.substring(3,5));
			int year = Integer.parseInt(schedule.substring(6,10));
			
			date = new Date((year-1900), (month-1), day);
		}
		catch(Exception e){
			System.out.println("Did not format correctly");
			return;
		}
		
		Date test = new Date();
		
		if(date.before(test)) {
			System.out.println("Date entered has already passed");
			return;
		}
		
		Appointment newAppoint = new Appointment(id, date, appoint);
		appointments.add(newAppoint);
		System.out.println("Appointment added");
		
	}

}
