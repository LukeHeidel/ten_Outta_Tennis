

import tennisGame.TennisStart;
import tennisProgram.GatherPrelim;
import tennisProgram.NewPlayers;
import tennisProgram.Player;
import tennisProgram.PreliminaryInfo;
import tennisProgram.Stadium;

public class TennisMain 
{
	
	private Player player;
	private Stadium stadium;

	
	public Player getPlayer() 
	{
		return player;
		
	}

	public void setPlayer(Player player) 
	{
		this.player = player;
	}

	public Stadium getStadium()
	{
		return stadium;
	}

	public void setStadium(Stadium stadium) 
	{
		this.stadium = stadium;
	}

	public void prelim(PreliminaryInfo info) 
	{
		player = info.createPlayer();
		stadium = info.createStadium();
	}


	public static void main(String[] args) 
	{
		System.out.println("Enter Preliminary info:");
		TennisMain tennis = new TennisMain();
		TennisStart start = new TennisStart();
		
		//start.startGameWindow();
		
		tennis.prelim(new GatherPrelim());
		for (int i = 0; i < 2; i++) 
		{
		System.out.println(tennis.getPlayer() + " " + (i + 1) + ":");
		System.out.println("Name: " + tennis.getPlayer().getName());
		System.out.println("Gender: " + tennis.getPlayer().getGender());
		System.out.println("Country: " + tennis.getPlayer().getCountry()+ "\n");
		}
		
		System.out.println(tennis.getStadium() + " :");
		System.out.println("Stadium Name: " + tennis.getStadium().getStadName());
		System.out.println("Location: " + tennis.getStadium().getStadLocation());
		System.out.println("Court Type: " + tennis.getStadium().getStadCourtType());
		
		
		
		start.startGameWindow();
	}

}
