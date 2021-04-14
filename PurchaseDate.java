
/**
 * Write a description of class PurchaseDate here.
 *
 * @author Mahdieh :)
 * @version 2019.03.10
 */
public class PurchaseDate
{    
    public static final int CURRENT_YEAR=2019;
    public static final int OLDEST_YEAR=1950;
    public static final int JANUARY=1;
    public static final int DECEMBER=12;
    public static final int FIRST_DAY=1;    
    public static final int LAST_DAY=31;
    private int year=CURRENT_YEAR;
    private int month=JANUARY;
    private int day=FIRST_DAY;
    /**
     * Consructor for objects of class PurchaseDate.
     * @param Customer 
     *               theYear to initialize year field.
     * @param theMonth to initialize month field.
     * @param theDay to initialize day field.
     */
    public PurchaseDate(int theYear, int theMonth, int theDay) 
    {
        setYear(theYear);
        setMonth(theMonth);
        setDay(theDay);
    }

    /**
     * @return the PurchaseDate year as int.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return the month as int.
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * @return the day as int.
     */
    public int getDay()
    {
        return day;
    }

    /**
     * @param PurchaseDate
     *                    theYear sets the value for year field.
     */
    public void setYear(int theYear)
    {
        if (theYear>OLDEST_YEAR && theYear<=CURRENT_YEAR)
            year=theYear;
    }

    /**
     * @param theMonth sets the value for month field.
     */
    public void setMonth(int theMonth)
    {
        if(theMonth>=JANUARY && theMonth<=DECEMBER)
            month=theMonth;

    }

    /**
     * @param theDay sets the value for day field.
     */
    public void setDay(int theDay)
    {
        if(theDay>=FIRST_DAY && theDay<=LAST_DAY)
            day=theDay;
    }

    /**
     * @return year-month-day as string.
     */
    public String getDates()
    {
        String x;
        if (month<10)
            x="0"+month;
        else
            x=month+"";
        String y;
        if(day<10)
            y="0"+day;
        else
            y=day+"";
        return year+"-"+x+"-"+y;
    }
}
