/* ContactTest tests the Contact class
 * @author Anthony Minunni
 * @date 9/18/2021 */

public class ContactTest {
  public static void main(String args[]) {

    Contact c1 = new Contact("1234567890","Anthony", "Minunni", "2012012001", "100 Main Street");
    Contact c3 = new Contact("12345","Louis","Corby","9089089008","20 West 34th Street");
    
    System.out.println(c1.toString());
    
    System.out.println("Updating first contact");
    
    c1.setFirstName("Joseph");
    c1.setLastName("Becker");
    c1.setNumber("5555555555");
    c1.setAddress("1600 Pennsylvania Avenue");
    
    System.out.println(c1.toString());
    System.out.println(c3.toString());
	  
  }
}
