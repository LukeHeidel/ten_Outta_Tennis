package tennisProgram;

import tennisGame.tennisMatchInterface;

public class TennisStates {

	public boolean serverStates(String Player1, String Player2, tennisMatchInterface sS) {
		
		return sS.setStates(Player1, Player2);
	}
	
	
}
