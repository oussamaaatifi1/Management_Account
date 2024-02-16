public class Customer
{
   private int customerID;
   private String firstName;
   private String lastName;
   private String personalID; 

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalID() {
        return this.personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }
}
