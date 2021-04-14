
/**
 * Write a description of class VehiclePurchase here.
 *
 * @author Mahdie:)
 * @version 
 */
public class VehiclePurchase
{
    private Customer customer;   
    private PurchaseDate  purchaseDate; 
    private Vehicle vehiclePurchased;  
    private boolean servicePackage;  
    public static final double SERVICE_FEE = 500.00;  
    /**
     * Constructor for objects of class VehiclePurchase
     * @param Customer
     *               renter to initialize customer field.
     * @param purchaseDate 
     *                   to initialize purchaseDate field.  
     * @param vehiclePurchased
     *                       to initialize vehiclePurchased.
     *  @param servicePackage 
     *                       to initialize servicePackage.
     */
    public VehiclePurchase(Customer renter, PurchaseDate  purchaseDate, Vehicle vehiclePurchased, boolean servicePackage)
    {

        customer=renter;
        this.purchaseDate=purchaseDate;
        this.vehiclePurchased=vehiclePurchased;
        this.servicePackage=servicePackage;

    }

    /**
     * @return customer as data class
     */
    public Customer getCustomer()
    {
        return customer;}

    /**
     * return purchaseDate as a data class
     */
    public PurchaseDate getPurchaseDate()
    {
        return purchaseDate;
    }

    /**
     * return vehiclePurchased as data class
     */
    public Vehicle getVehiclePurchased ()
    {
        return vehiclePurchased;
    }

    /**
     * return servicePackage as boolean.
     */
    public boolean getServicePackage()
    {
        return servicePackage;
    }

    /**
     * @param setServicePackage 
     *                         servicePackage sets  the value for servicePackage field.
     */
    public void setServicePackage(boolean servicePackage)
    {

        this.servicePackage=servicePackage;
    }

    /**
     * @param purchasePrice sets the value for sellinPrice as external method call.
     */
    public void calculatePurchasePrice(double purchasePrice)
    {   

        vehiclePurchased.checkStandardSellingPrice(purchasePrice);

        if (servicePackage==true){

            purchasePrice+=SERVICE_FEE;
            vehiclePurchased.setSellingPrice(purchasePrice);

        }
        /**
         * formats and displays the information of customer, purchaseDate and vehicle.
         */

    }

    public void displayCustomerDetails()
    {
        System.out.println("Customer: "+customer.getShowName());
        System.out.println("purchase Date: "+ purchaseDate.getDates());

        vehiclePurchased.PrintDetails();
        if (servicePackage==true)
            System.out.println("SERVICE PACKAGE INCLUDED");
        System.out.println("\n");
    }
}
