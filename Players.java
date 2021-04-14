

import java.util.HashMap;

public class Players {
	public static HashMap<Integer,Player>thePlayer;


	public Players() {
		thePlayer=new HashMap<Integer,Player>();
	}
	
public void addPlayer(Player newPlayer) {
		
	   if(newPlayer!=null)
		thePlayer.put(newPlayer.getDice().getSum() , newPlayer);
}

public static void displayAllPlayer() {
	 System.out.println("Thank you for playing: Displaying all the players. ");
	for(Integer player:thePlayer.keySet()) {
		System.out.println(thePlayer.get(player));
	}
}
	
}
