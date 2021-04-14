

public class Dice {

	int dice1;
	int dice2;
	
    private int sum=0;

	public final static int MAX_DICE	= 6;
	public final static int MIN_DICE	= 1;
	public final static int ZERO  		= 0;
	
	
	
	
public Dice() {
	
roll();

	
}
public void roll() {
	dice1 =(int)(Math.random() * MAX_DICE + MIN_DICE);
dice2 =(int)(Math.random() * MAX_DICE + MIN_DICE);
}

	
public int getValue1() // Return the number showing on the first die.
{
     return dice1 ;
}
      
public int getValue2() // Return the number showing on the second die.
{
     return dice2;
}
      
public int getSum() // Return the total showing on the two dice.
{
     sum = dice1 + dice2;
     return sum;
}
    

}
