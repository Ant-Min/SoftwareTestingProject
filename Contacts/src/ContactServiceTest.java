/* ContactServiceTest is a class to test ContactService
 * @author Anthony Minunni
 * @date 9/18/2021 */

import java.util.Scanner;
import java.util.ArrayList;

public class ContactServiceTest {
  
  /*printContactList is a method to print the contact list
	@param contact is an ArrayList of contacts */
  public static void printContactList(ArrayList<Contact> contact) {
	  for (int i = 0; i < contact.size(); i++) {
		  System.out.println(contact.get(i));
		  System.out.println();
	  }
  }
  
  public static void main(String args[]) {  
	  
	  Scanner scnr = new Scanner(System.in);
	  
	  ArrayList<Contact> contactList = new ArrayList<Contact>();
	  String choice;
	  
	  boolean run = true;
	 
	  //while loop to do multiple tests in one run
	  while(run) {
	      System.out.println("Would you like to add, remove, or update a contact? Type \"exit\" to stop");
	      //try statement to prevent crashing from unreadable inputs from the user
	      try{
	    	 choice = scnr.nextLine();
	    	 
	    	 //switch statements for which contact method to execute
	    	 switch (choice){
	    	 	//each input is checked for character limits since addContact adds the inputs as a new contact
	    	 	//    rather than using setter methods
	    	 	case "add":
	    	 		System.out.println("Enter ID (No more than 10 digits)");
	    	 		String ident = scnr.nextLine();
	    	 		if(ident.length() > 10) {
	    	 			ident = ident.substring(0,10);
	    	 		}
	    	 		System.out.println("Enter first name (No more than 10 characters)");
	    	 		String fName = scnr.nextLine();
	    	 		if(fName.length() > 10) {
	    	 			fName = fName.substring(0,10);
	    	 		}
	    	 		System.out.println("Enter last name (No more than 10 characters)");
	    	 		String lName = scnr.nextLine();
	    	 		if(lName.length() > 10) {
	    	 			lName = lName.substring(0,10);
	    	 		}
	    	 		boolean wrong = true;
	    	 		String number = "0";
	    	 		//while loop to ensure number being entered is legitimate
	    	 		while (wrong) {
	    	 			System.out.println("Enter number (Must be 10 digits, no hypens)");
	    	 			number = scnr.nextLine();
	    	 			if (number.length() == 10 && !(number.contains("-"))) {
	    	 				wrong = false;
	    	 			}
	    	 			else {
	    	 				System.out.println("Try entering your number again");
	    	 			}
	    	 		}
	    	 		System.out.println("Enter address (No more than 30 characters)");
	    	 		String add = scnr.nextLine();
	    	 		if(add.length() > 30) {
	    	 			add = add.substring(0,30);
	    	 		}
	    	 		ContactService.addContact(contactList,ident,fName,lName,number,add);
	    	 		printContactList(contactList);
	    	 		break;
	    	 	case "remove":
	    	 		System.out.println("Enter ID of contact to be removed");
	    	 		ident = scnr.nextLine();
	    	 		ContactService.deleteContact(contactList, ident);
	    	 		printContactList(contactList);
	    	 		break;
	    	 	case "update":
	    	 		System.out.println("What is the ID of the contact to update?");
	    	 		ident = scnr.nextLine();
	    	 		System.out.println("What would you like to update?");
	    	 		choice = scnr.nextLine();
	    	 		System.out.println("What are you updating it to?");
	    	 		String update = scnr.nextLine();
	    	 		ContactService.updateContact(contactList, ident, choice, update);
	    	 		printContactList(contactList);
	    	 		break;
	    	 	case "exit":
	    	 		run = false;
	    	 		break;
	    	 	default:
	    	 		System.out.println("Not a valid option.");
	    	 		break;
	    	 }
	      
	      }
	      catch(Exception e) {
	    	  System.out.println("Not a valid option");
	      }
      
	  }
	  
	  scnr.close();
	
  }	
}