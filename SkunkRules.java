

public class SkunkRules {
	
	public void displayRules() {
		
		System.out.println("Each letter of \"skunk\" represents a different round of the game; play begins with the \"S\"\r\n" + 
				"column and continues through the \"K\" column. ");
		System.out.println("The object of \"skunk\" is to accumulate the\r\n" + 
				"greatest possible point total over the five rounds. The rules for play are the same for each\r\n" + 
				"of the five rounds. ");
		System.out.println("To accumulate points in a given round, a pair of dice is rolled.");
		System.out.println("A player gets the total of the dice and records it in his or her column, unless a \"one\" comes\r\n" + 
				"up. ");
		System.out.println("If a \"one\" comes up, play is over for that round and all the player's points in that column are\r\n" + 
				"wiped out. ");
		System.out.println("If \"double ones\" come up, all points accumulated in prior columns are wiped out as well.\r\n" + 
				"If a \"one\" doesn't occur, the player may choose either to try for more points on the next roll\r\n" + 
				"or to stop and keep what he or she has accumulated. ");
		System.out.println("*** Note: If a \"one\" or \"double ones\" occur on the very first roll of a round, then that round is\r\n" + 
				"over and the player must take the consequences. ***");
		
	}
    
}
