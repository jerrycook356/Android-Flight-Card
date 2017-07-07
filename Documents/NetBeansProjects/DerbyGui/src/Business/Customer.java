/**
 * This class hold the information about the customer
 *
 * @author     Jerry Cook
 * @created    June 6, 2017
 */
package Business;

/**
 *
 * @author jerry
 */
public class Customer implements Comparable<Customer>{
    
    String email;
    String firstName;
    String lastName;
    
    public Customer(String email, String firstName, String lastName)
    {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    
    @Override
    public int compareTo(Customer c)
    {
       return this.getEmail().compareToIgnoreCase(c.getEmail());       
    }
   
    
}
