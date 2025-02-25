
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Customer
{
    private String firstName;
    private String surName;
    private String emailAddress;
    private final long customerId;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String firstName, String surName, String emailAddress)
    {
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId = makeCustomerId(); //he didn't give any code for this one idk man
    }
    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getSurName() {
        return surName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public long getId() {
        return customerId;
    }
    public long makeCustomerId(){
        return Math.abs(new Random().nextLong());
    }
}
