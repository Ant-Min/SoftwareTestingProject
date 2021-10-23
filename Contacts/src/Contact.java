/* Contact is a class that holds the contact information of a person
 * @author Anthony Minunni
 * @date 9/18/2021 */

public class Contact {
	//private variables to hold a contact's id, first name, last name, phone number, and address
	private String id;
	private String firstName;
	private String lastName;
	private String number;
	private String address;

//default constructor used for testing purposes
  public Contact() {
	  id = " ";
	  firstName = " ";
	  lastName = " ";
	  number = " ";
	  address = " ";
  }
  
/* full constructor for contact information
 * @param ident is contact's ID
 * @param fName is contact's first name
 * @param lName is contact's last name
 * @param num is contact's phone number
 * @param add is contact's address */	
  public Contact(String ident, String fName, String lName, String num, String add) {
	  id = ident;
	  firstName = fName;
	  lastName = lName;
	  number = num;
	  address = add;
  }
 
/* getID is a method to retrieve a contact's ID
 * @return id */ 
  public String getID() {
	  return id;
  }

/* setFirstName is a method to change a contact's first name. It checks to confirm the new first name
 *     adheres to character limit rules
 * @param fName is the updated first name */  
  public void setFirstName(String fName) {
	  if(fName.length() > 10) {
		  fName = fName.substring(0,10);
	  }
	  firstName = fName;
  }
 
/* getFirstName is a method to retrieve a contact's first name
 * @return firstName */  
  public String getFirstName() {
	  return firstName;
  }

/* setLastName is a method to update a contact's last name. It checks to confirm the new last name
 *     adheres to character limit rules
 * @param lName is the updated last name */  
  public void setLastName(String lName) {
	  if(lName.length() > 10) {
		  lName = lName.substring(0,10);
	  }
	  lastName = lName;
  }
  
/* getLastName is a method to retrieve a contact's last name
 * @return lastName */  
  public String getLastName() {
	  return lastName;
  }
  
/* setNumber is a method to update a contact's phone number
 * @param num is the updated phone number */  
  public void setNumber(String num) {
	  number = num;
  }
  
/* getNumber is a method to retrieve a contact's phone number
 * @return number */
  public String getNumber() {
	  return number;
  }
  
/* setAddress is a method to update a contact's address. It checks to confirm the new address
 *     adheres to character limit rules
 * @param add is the updated address */  
  public void setAddress(String add) {
	  if(add.length() > 30) {
		  add = add.substring(0,30);
	  }
	  address = add;
  }
  
/* getAddress is a method to retrieve a contact's address
 * @return address */  
  public String getAddress() {
	  return address;
  }
  
/* toString is a method to print a contact's information in a formatted way
 * @return string of contact's id, name, number, and address */  
  public String toString() {
	  return "ID: " + this.id + "\nName: " + this.firstName + " " + this.lastName + "\nPhone Number: "
			  + this.number.substring(0,3) + "-" + this.number.substring(3,6) + "-" + this.number.substring(6) + 
			  "\nAddress: " + address + "\n";
  
  }
}

