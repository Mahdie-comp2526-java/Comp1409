
/**
 * Write a description of class JalopiesDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JalopiesDriver
{
    public static void main(String[]args)
    {
        Vehicle vehicle=new Vehicle("2012trA","Toyota","camri",2012);
        vehicle.getStockCode();
        vehicle.setDealerCost(124);
        vehicle.setSellingPrice(257);
        vehicle.checkStandardSellingPrice(257,124);
        vehicle.getProfitMargin();
        vehicle.caculateProfitMargin();
        vehicle.PrintDetails();
    }
}
