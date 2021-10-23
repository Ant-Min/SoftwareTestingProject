/* ContactService is a class that holds methods to add, remove, or update contacts in a user's contact list
 * @author Anthony Minunni
 * @date 9/18/2021 */

import java.util.ArrayList;

public class ContactService extends Contact {
	
	/* addContact is a static method that adds a contact to a contact list using the Contact class constructor
	 * @param contacts is an ArrayList that holds all created Contacts
	 * @param ident is a String holding the new contact's ID
	 * @param fName is a String holding the new contact's first name
	 * @param lName is a String holding the new contact's last name
	 * @param num is a String of the new contact's phone number
	 * @param add is a String of the new contact's address 
	 * @return contacts for an updated contact list */
	public static ArrayList<Contact> addContact(ArrayList<Contact> contacts, String ident, String fName, String lName, String num, String add) {
		Contact contact = new Contact(ident, fName, lName, num, add);
		contacts.add(contact);
		System.out.println("Contact added");
		return contacts;
	}
	
	/* deleteContact is a static method that deletes a contact from the contact list based on the ID the user enters
	 * @param contacts is an ArrayList that holds all created Contacts
	 * @param ident is a String holding the contact's ID to be deleted
	 * @return contacts for an updated contact list */
	public static ArrayList<Contact> deleteContact(ArrayList<Contact> contacts, String ident) {
		for (int i = 0; i < contacts.size(); i++) {
			if(ident.equals(contacts.get(i).getID())) {
				contacts.remove(contacts.get(i));
				System.out.println("Contact removed");
				break;
			}
			//if the id the user entered is not in the list, the program lets the user know
			else {
				System.out.println("Contact not found");
			}
		}
		return contacts;
	}
	
	/* updateContact is a static method that updates a contact from the contact list based on the ID and field the user wants to update
	 * @param contacts is an ArrayList that holds all created Contacts
	 * @param ident is a String holding the contact's ID to be deleted
	 * @param choice is a String that is either the first name, last name, number, or address of the contact
	 * @param change is a String holding what the updated name/number/address of the contact will be
	 * @return contacts for an updated contact list */
	public static ArrayList<Contact> updateContact(ArrayList<Contact> contacts, String ident, String choice, String change) {
		for (int i = 0; i < contacts.size(); i++) {
			//if statement to search for ID in contact list
			if (ident.equals(contacts.get(i).getID())) {
				//switch statement for the field to update. Will not update contact if choice is not a valid case
				switch (choice) {
				case "first name":
					contacts.get(i).setFirstName(change);
					System.out.println("First name updated");
					break;
				case "last name":
					contacts.get(i).setLastName(change);
					System.out.println("Last name updated");
					break;
				case "number":
					contacts.get(i).setNumber(change);
					System.out.println("Number updated");
					break;
				case "address":
					contacts.get(i).setAddress(change);
					System.out.println("Address updated");
					break;
				default:
					System.out.println("Not a valid request");
					break;
				}
			}
			//Contact will not be updated if ID not found in system
			else {
				System.out.println("Contact not found");
			}
		}
	    
		return contacts;
  }
}
