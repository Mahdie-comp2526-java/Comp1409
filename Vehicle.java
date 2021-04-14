
/**
 * Write a description of class Vehicle here.
 *
 * @Author: Mahdieh
 * @Student ID: A01051162
 */
public class Vehicle
{

    private String stockCode;
    private String make;
    private String model;
    private int year;
    private double dealerCost;
    private double sellingPrice;
    private double profitMargin;
    public Vehicle(){
    }

    /**
     * @param StockCode used to set the stockCode field
     * @param Make used to set the make field
     * @param Model used to set the model field
     * @param Year used to set the year field
     */
    public Vehicle(String StockCode,String Make,String Model,int Year)
    {
        setStockCode(StockCode);
        setMake(Make);
        setModel(Model);
        setYear(Year);
        /**
         * return the stockCode as a string
         */
    } 

    public String getStockCode() {
        return stockCode;
    }

    /**
     * return make as a string
     */
    public String getMake(){
        return make;
    }

    /**
     * return model as a string
     */
    public String getModel(){
        return model;
    }

    /**
     * return year as an int 
     */
    public int getYear(){
        return year;
    }

    /**
     * return dealer as a double
     */

    public double getDealerCost(){
        return dealerCost;
    }

    /**
     * return sellingPrice as a double
     */
    public double getSellingPrice(){
        return sellingPrice;
    }

    /**
     * return profitMargin as a double 
     */
    public double getProfitMargin(){
        return profitMargin;
    } 

    /**
     * @param StockCode used to set the stockCode field
     */

    public void setStockCode(String StockCode){

        if(StockCode != null && !StockCode.trim().isEmpty())

        {stockCode=StockCode;}
        else
        {stockCode=stockCode;

            System.out.println("StockCode is not valid");
        }}

    /**
     * @param Make used to set the make field 
     */
    public void setMake(String Make)
    {

        if(Make!=null && !Make.trim().isEmpty())
            make=Make;
        else 
        {make=make;
            System.out.println("enter valid make");}
    }

    /**
     * @param Model used to set the model field
     */
    public void setModel(String Model)
    {
        if (Model!=null && !Model.trim().isEmpty())
            model=Model;
        else
        {model=model;
            System.out.println("enter the valid model");}
    }

    /**
     * @param Year used to set the year field 
     */
    public void setYear(int Year)
    {
        if(Year>1970 && Year<2019)
        { year=Year;}
        else
        {year=year;
            System.out.println("the year is not valid");}
    }

    /**
     * @param DealerCost used to set dealercost field
     */
    public void setDealerCost(double DealerCost)
    {
        if (DealerCost>0)
            dealerCost=DealerCost;
    }

    /**
     * @param DealerCost used to set sellingPrice field
     */
    public void checkStandardSellingPrice(double SellingPrice, double DealerCost)
    {
        if (SellingPrice>=DealerCost*1.25)
        {
            {sellingPrice=SellingPrice;}
        }
        else {

            System.out.println("sellingPrice is: "+ sellingPrice + "and DealerCost is: "+ dealerCost);}
    }

    /**
     * @param SellingPrice used to set sellingPrice field
     */
    public void setSellingPrice(double SellingPrice)
    {
        if(SellingPrice>0)

            sellingPrice=SellingPrice;

    }

    /**
     * @method that calculate profitMargin
     */

    public void caculateProfitMargin()
    {
        if (sellingPrice>dealerCost){
            profitMargin=(sellingPrice-dealerCost)/sellingPrice*100;}

    }

    /**
     * return profit as a double
     */

    public double getcalculateProfit()
    
    {
      
        return sellingPrice-dealerCost;

    }

    /**
     * method that print the details of Jalopies Are Us Vehicle
     */
    public void PrintDetails(){
        System.out.println("Jalopies Are Us Vehicle Summary:");
        System.out.println("Vehicles: "+year+" "+make+" "+model);
        System.out.println("StockCode: "+stockCode);
     
        System.out.print("Dealercost: $");
        System.out.printf("%.2f",dealerCost);
        System.out.println();
        System.out.print("SellingPrice: $");
        System.out.printf("%.2f",sellingPrice);
        System.out.println();
        System.out.print("ProfitMargin: ");
         System.out.printf("%.2f",profitMargin);
         System.out.print("%");
         System.out.println();
        System.out.print("Dollar profit: $");
        System.out.printf("%.2f",sellingPrice-dealerCost);
    }

}
