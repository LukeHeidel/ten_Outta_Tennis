package tennisGame;

public class TennisScoring 
{
	
	protected int playerOneGameScore;
	protected int playerTwoGameScore;
	
	protected int playerOneSetScore;
	protected int playerTwoSetScore;
	
	protected int playerOneSetWins;
	protected int playerTwoSetWins;
	
	protected int setOneBreakerScore;
	protected int setTwoBreakerScore;
	
	protected int requiredSets;
	
	private boolean playerOneServe = true;
	private boolean playerTwoServe = false;
	
	private boolean tie = false;
	private boolean playerOneAdvantage;
	private boolean playerTwoAdvantage;
	
	
	
	
	//This class includes the games scoring logic, as well as the penalty logic.
	//These methods 
	//
	//TODO: Build and implement penalty logic.
	
	
	public void PlayerOneScoring() 
	{
		
		if (playerOneGameScore == 0) 
		{
			playerOneGameScore = playerOneGameScore + 15;
		}
		if (playerOneGameScore == 15) 
		{
			playerOneGameScore = playerOneGameScore + 15;
		}
		if(playerOneGameScore == 30) 
		{
			playerOneGameScore = playerOneGameScore + 10;
		}
		if (playerOneGameScore == 40 && playerTwoGameScore < 40)
		{
			playerOneSetScore = playerOneSetScore + 1;
			playerOneGameScore = 0;
			playerTwoGameScore = 0;
			playerOneServe = !playerOneServe;
			playerTwoServe = !playerTwoServe;
		}
		if (playerOneSetScore == 6 && playerOneSetScore - 2 >= playerTwoSetScore)
		{
			playerOneSetWins = playerOneSetWins + 1;
		} 
		if (playerOneSetWins == requiredSets)
		{
			//TODO have Player one win
		}	
	
	}
	
	public void PlayerTwoScoring() 
	{
		
		if (playerTwoGameScore == 0) 
		{
			playerTwoGameScore = playerTwoGameScore + 15;
		}
		else if (playerTwoGameScore == 15) 
		{
			playerTwoGameScore = playerTwoGameScore + 15;
		}
		else if(playerTwoGameScore == 30) 
		{
			playerTwoGameScore = playerTwoGameScore + 10;
		}
		else if (playerTwoGameScore == 40 && playerOneGameScore < 40)
		{
			playerTwoSetScore = playerTwoSetScore + 1;
			playerOneGameScore = 0;
			playerTwoGameScore = 0;
			playerOneServe = !playerOneServe;
			playerTwoServe = !playerTwoServe;
		}
		else if (playerTwoSetScore == 6 && playerTwoSetScore - 2 >= playerOneSetScore || playerTwoSetScore == 7)
		{
			
		}
		else if (playerOneSetWins == requiredSets)
		{
			//TODO have Player Two win
		}	
			
	}
	
	public void gameTieBreaker()
	{
		tie = true;

		if(playerOneAdvantage == true)
		{
			tie = false;
			playerTwoAdvantage = false;
		}
		else if(playerOneAdvantage == true && playerTwoAdvantage == false)
		{
			playerOneSetScore = playerOneSetScore + 1;
		}
		else if(playerOneAdvantage == true && playerTwoAdvantage == true)
		{
			tie = true;
			playerOneAdvantage = false;
			playerTwoAdvantage = false;
		}
		else if(playerTwoAdvantage == true)
		{
			tie = false;
			playerTwoAdvantage = false;
		}
		else if(playerOneAdvantage == true && playerTwoAdvantage == false)
		{
			playerTwoSetScore = playerTwoSetScore + 1;
		}

	}
	
	public void setTieBreaker()
	{
		if (playerOneSetScore == 6 && playerOneSetScore == 6) 
		{
			playerOneServe = !playerOneServe;
			playerTwoServe = !playerTwoServe;
		}
	}

	


}
