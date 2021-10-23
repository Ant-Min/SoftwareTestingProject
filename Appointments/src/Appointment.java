import java.util.Date;

public class Appointment {
	
	private String id;
	private String description;
	private Date date = new Date();
	
	public Appointment(String ident, Date day, String descrip) {
		id = ident;
		date = day;
		description = descrip;
	}
	
	public String getID() {
		return id;
	}
	
	public void setDate(Date day) {
		date = day;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDescrip(String descrip) {
		description = descrip;
	}
	
	public String getDescrip() {
		return description;
	}
	
	public String toString() {
		return "ID: " + id + "\nDate: " + date + "\nDescription: " + description;
	}

}
