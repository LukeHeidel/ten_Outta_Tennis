package tennisGame;

public class TennisScoring {
	
	protected int PlayerOneGameScore;
	protected int PlayerTwoGameScore;
	
	protected int PlayerOneSetScore;
	protected int PlayerTwoSetScore;
	
	protected int PlayerOneSetWins;
	protected int PlayerTwoSetWins;
	
	protected int requiredSets;
	
	//This class includes the games scoring logic, as well as the penalty logic.
	//These methods 
	//
	//TODO: Build and implement penalty logic.
	
	
	public int PlayerOneScoring() 
	{
		
		if (PlayerOneGameScore == 0) 
		{
			PlayerOneGameScore = PlayerOneGameScore + 15;
			return PlayerOneGameScore;
		}
		if (PlayerOneGameScore == 15) {
			PlayerOneGameScore = PlayerOneGameScore + 15;
			return PlayerOneGameScore;
		}
		if(PlayerOneGameScore == 30) 
		{
			PlayerOneGameScore = PlayerOneGameScore + 10;
			return PlayerOneGameScore;
		}
		if (PlayerOneGameScore == 40 && PlayerTwoGameScore < 40)
		{
			PlayerOneSetScore = PlayerOneSetScore + 1;
			PlayerOneGameScore = 0;
			PlayerTwoGameScore = 0;
			return PlayerOneSetScore;
		}
		if (PlayerOneSetScore == 6 && PlayerOneSetScore - 2 >= PlayerTwoSetScore)
		{
			PlayerOneSetWins = PlayerOneSetWins + 1;
		} 
		if (PlayerOneSetWins == requiredSets)
		{
			//TODO have Player one win
		}	
		
		return 1;	
	}
	
	public int PlayerTwoScoring() 
	{
		
		if (PlayerTwoGameScore == 0) 
		{
			PlayerTwoGameScore = PlayerTwoGameScore + 15;
			return PlayerTwoGameScore;
		}
		if (PlayerTwoGameScore == 15) {
			PlayerTwoGameScore = PlayerTwoGameScore + 15;
			return PlayerTwoGameScore;
		}
		if(PlayerTwoGameScore == 30) 
		{
			PlayerTwoGameScore = PlayerTwoGameScore + 10;
			return PlayerTwoGameScore;
		}
		if (PlayerTwoGameScore == 40 && PlayerOneGameScore < 40)
		{
			PlayerTwoSetScore = PlayerTwoSetScore + 1;
			PlayerOneGameScore = 0;
			PlayerTwoGameScore = 0;
			return PlayerTwoSetScore;
		}
		if (PlayerOneSetScore == 6 && PlayerOneSetScore - 2 >= PlayerTwoSetScore)
		{
			PlayerOneSetWins = PlayerOneSetWins + 1;
			return PlayerOneSetWins;
		} 
		if (PlayerOneSetWins == requiredSets)
		{
			//TODO have Player Two win
		}	
		
		return 1;	
	}
	


}
