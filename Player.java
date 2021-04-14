


public class Player {

	private String playerFName;
	private String playerLName;
	private int playerAge;
	private Dice dice;
	
	public static final int MIN_AGE = 0;
	public static final int MAX_AGE = 99;
	
	/**
	 * @param playerFName
	 * @param playerLName
	 * @param playerAge
	 */
	public Player(String playerFName, String playerLName, int playerAge) {
		
		this.playerFName = playerFName;
		this.playerLName = playerLName;
		this.playerAge 	 = playerAge;
	}

	/**
	 * @return playerFName
	 */ 
	public String getPlayerFName() {
		return playerFName;
	}

	/**
	 * @param playerFName
	 */
	public void setPlayerFName(String playerFName) {
		
		if(playerFName != null) {
			this.playerFName = playerFName;
		}
		
		else
		{
			
			throw new IllegalArgumentException("first name cannot be null");
			
		}
	}

	/**
	 * @return playerLName
	 */
	public String getPlayerLName() {
		return playerLName;
	}

	
	/**
	 * @param playerLName
	 */
	public void setPlayerLName(String playerLName) {
		
		if(playerLName != null) {
			this.playerLName = playerLName;
		}
		
		else
		
		{
			
			throw new IllegalArgumentException("last name cannot be null");
			
		}
	}

	/**
	 * @return playerAge
	 */
	public int getPlayerAge() {
		
		return playerAge;
	}
	
	

	/**
	 * @param playerAge
	 */
	public void setPlayerAge(int playerAge) {
		if( playerAge >= MIN_AGE && playerAge <= MAX_AGE) {
		this.playerAge = playerAge;
	}
		
		else
		{
			
			throw new IllegalArgumentException("Age cannot be null");
		}
	
	}
	public void setDiceGrade(Dice dice) {
		if(dice!=null)
			this.dice=dice;
	}
	public Dice getDice() {
		return dice;
	}
	public String toString() {
		return "Player [firstName=" +playerFName + ", lastName=" + playerLName + 
				"age="+playerAge+"]";
	}

	
	
	
	
}
