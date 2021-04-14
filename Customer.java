
/**
 * Write a description of class Customer here.
 *
 * @author Mahdie:)
 * @version 2019.03.10
 * @ID a01051162
 */
public class Customer
{
    private String firstName; 
    private String lastName;  
    private String driversLicense;  
    private String address; 
    private String phoneNumber; 
    /**
     * @Default construtor for objects of class Customer.
     */
    public Customer()
    {}

    /**
     * constructor for objects of class Customer.
     * @param customer
     *               firstName to initialize firstName field.
     * @param lastName 
     *                to initialize lastName field.
     * @param driversLicense
     *                to initialize driversLicense field.
     * @param address 
     *               to initialize address field.
     * @param phoneNumber 
     *               to initialize phoneNumber field.
     */
    public Customer(String firstName,String lastName, String driversLicense,String address,String phoneNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDriversLicense(driversLicense);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    /**
     * @return the customer firstName as string.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return lastName as string.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @return driversLicense as string.
     */
    public String getDriversLicense()
    {
        return driversLicense;
    }

    /**
     * @return address as string.
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @return phoneNumber as string. 
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @param customer 
     *               firstName sets the value for the firstName field.
     */
    public void setFirstName(String firstName)
    {

        if (firstName!=null && !firstName.trim().isEmpty())
            this.firstName=firstName;
    }

    /**
     * @param lastName sets the value for the lastName field. 
     */
    public void setLastName(String lastName)
    {
        if(lastName!=null && !lastName.isEmpty())
            this.lastName=lastName;
    }

    /**
     * @param driverslicense sets the value for the driverslicense field. 
     */
    public void setDriversLicense(String driversLicense)
    {
        if(driversLicense!=null && !driversLicense.isEmpty())
        {
            this.driversLicense=driversLicense;
        }
    }

    /**
     * @param address sets the value for the address field.
     */
    public void setAddress(String address)
    {
        if(address!=null && address.isEmpty())
            this.address=address;
    }

    /**
     * @param phoneNumber sets the value for the phoneNumber.
     */
    public void setPhoneNumber(String phoneNumber)
    {
        if(phoneNumber!=null && phoneNumber.isEmpty())
            this.phoneNumber=phoneNumber;
    }

    /**
     * @return firstName and lastName as string.
     */
    public String getShowName()
    {
        if(firstName!=null && lastName!=null){

            char[] firstname=firstName.toCharArray();
            char[] lastname=lastName.toCharArray();

            String firstChar=String.valueOf(firstname[0]);
            String temp1="";
            String temp2="";
            String nextLetter;
            String nextChar;

            for (int i=1;i<firstName.length();i++)
            {
                nextLetter=String.valueOf(firstname[i]);
                temp1=temp1+nextLetter.toLowerCase();
            }

            firstName=firstChar.toUpperCase()+temp1;
            firstChar=String.valueOf(lastname[0]);

            for (int i=1;i<lastName.length();i++)
            {
                nextChar=String.valueOf(lastname[i]);
                temp2+=nextChar.toLowerCase();
            }
            lastName=firstChar.toUpperCase()+temp2;
        }
        return firstName+" "+lastName;

    }

}
