
public class GameSetup {

	private String fName;
	private String lName;
	private int age;
	  private Dice dice;
   private int  diceSelection;
  private Player player;
   private InputReader reader;

	
	public static final int TWO 	= 2;	
	public static final int THREE 	= 3;	
	
	private SkunkRules f1;
		
	
public GameSetup() {

	
	run();
		
		
	}
public static void main(String[] args) {

	new GameSetup();

}


//ask for info plus can ask for help or quit the game.
	public void run() {

		
		reader = new InputReader();
			
		 boolean exit = false;
			while (!exit) {
				System.out.println("Choose one of the following options:");
				System.out.println("1- sign in");
				System.out.println("2 - twoDiceSelection()");
				//System.out.println("3 -Three DicesSelection");
				System.out.println("4: help");
				System.out.println("5 - Exit");
				System.out.print("> ");
				int choice = reader.getIntInput();

				switch (choice) {
				case 1:
					choice=1;
					initialize();
					break;
				case 2:
				   choice = 2;
				   
					rollDice();
					break;
			//	case 3:
				//	choice = THREE;
				//	dice.dieSystem2();
				//	break;
				case 4:
					choice = 4;

					help();

					break;
				case 5:
					choice = 5;
					System.out.println("Thank you for participation in Skunk play");
					
					System.exit(0);}
			}
	}
	
	
			public void initialize() {
				reader = new InputReader();
				System.out.println("Please Enter your First Name:");
				fName=reader.getStringInput();
				System.out.println();
				
				
				System.out.println("Please Enter your Last Name: ");
				System.out.println();
				lName= reader.getStringInput();	
				
				System.out.println("Please Enter your age: ");
				System.out.println();
				age = reader.getIntInput();
				
				player = new Player(fName, lName, age);
				System.out.println("Player: " + fName + " " + lName + ", Age: " + age +"!");

			}		
			
	public boolean twoDiceSelection() 
	{
	
		
		if(diceSelection == TWO)
		
		{
			System.out.println("You have selected two dices!");
			return true;
			
		}
		else
		{
			return false;
		}
		
	
}
	
	
	public boolean ThreeDiceSelection()
	{
		
		if(diceSelection == THREE) 
		{
			System.out.println("You have selected three dices!");
			return true;
			
		}
		

		else 
		{
			return false;
		}
	}
	

    public void rollDice()
    {
      
        int rollCount;
         
        dice = new Dice();
        rollCount = 0;
        dice.roll();
        while(dice.getSum() != 2)
        {
        	  
         
        rollCount++;
         
        System.out.println("Roll " + rollCount + ":");
        System.out.println(dice.getValue1());
        System.out.println(dice.getValue2());
         
         if (dice.getSum() == 7)
            System.out.println("Craps!" + "\n");
        else if (dice.getSum() == 2)
            System.out.println("Snake eyes!" + "\n");
        else if (dice.getSum() == 12)
            System.out.println("Box cars!" + "\n");
     
         dice.roll();
        
        }
}
    public void help()
	{
		
		System.out.println("------------------------------");
		if(f1!=null)
		f1.displayRules();
	
	}
	}

