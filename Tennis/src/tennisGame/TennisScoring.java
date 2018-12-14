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
	
	
	public int PlayerOneScoring() 
	{
		System.out.println("Player one score +1");
		if (playerOneGameScore == 0) 
		{
			playerOneGameScore = playerOneGameScore + 15;
			System.out.println(playerOneGameScore);
			return playerOneGameScore;	
		}
		else if (playerOneGameScore == 15) 
		{
			playerOneGameScore = playerOneGameScore + 15;
			System.out.println(playerOneGameScore);
			return playerOneGameScore;	
		}
		else if(playerOneGameScore == 30) 
		{
			playerOneGameScore = playerOneGameScore + 10;
			System.out.println(playerOneGameScore);
			return playerOneGameScore;	
		}
		else if (playerOneGameScore == 40 && playerTwoGameScore < 40)
		{
			playerOneSetScore = playerOneSetScore + 1;
			playerOneGameScore = 0;
			playerTwoGameScore = 0;
			playerOneServe = !playerOneServe;
			playerTwoServe = !playerTwoServe;
		}
		else if (playerOneSetScore == 6 && playerOneSetScore - 2 >= playerTwoSetScore)
		{
			playerOneSetWins = playerOneSetWins + 1;
		} 
		else if (playerOneSetWins == requiredSets)
		{
			//TODO have Player one win
		}
		return playerOneGameScore;	
	
	}
	
	public int PlayerTwoScoring() 
	{
		System.out.println("Player two score +1");
		if (playerTwoGameScore == 0) 
		{
			playerTwoGameScore = playerTwoGameScore + 15;
			System.out.println(playerTwoGameScore);
			return(playerTwoGameScore);
		}
		else if (playerTwoGameScore == 15) 
		{
			playerTwoGameScore = playerTwoGameScore + 15;
			System.out.println(playerTwoGameScore);
			return(playerTwoGameScore);
		}
		else if(playerTwoGameScore == 30) 
		{
			playerTwoGameScore = playerTwoGameScore + 10;
			System.out.println(playerTwoGameScore);
			return(playerTwoGameScore);
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
		return playerTwoGameScore;	
			
	}
	
	public void gameTieBreaker()
	{
		System.out.println("tie breaker");
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
		System.out.println("set tie breaker");
		if (playerOneSetScore == 6 && playerOneSetScore == 6) 
		{
			playerOneServe = !playerOneServe;
			playerTwoServe = !playerTwoServe;
		}
	}

	


}
