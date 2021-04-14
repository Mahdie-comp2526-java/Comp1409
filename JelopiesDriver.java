
/**
 * Write a description of class JelopiesDriver here.
 *
 * @author Mahdieh 
 * @version 2019.03.10
 */
public class JelopiesDriver

{
    public static void main(String[]args){

        Customer customer=new Customer();
        customer.setFirstName("Alex");
        customer.setLastName("wInner");
        PurchaseDate purchaseDate=new PurchaseDate(2018,8,21);

        Vehicle vehicle=new Vehicle("974CevMC ","Toyota","camri",2012);
        vehicle.setDealerCost(120);  
        vehicle.setSellingPrice(260.1);
        vehicle.getProfitMargin();
        vehicle.caculateProfitMargin();

        VehiclePurchase purchased=new VehiclePurchase( customer,purchaseDate, vehicle, true);
        purchased.calculatePurchasePrice(245.0);
        purchased.displayCustomerDetails();

    }}
