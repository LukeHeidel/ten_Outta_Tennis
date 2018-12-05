import java.util.Scanner;

import tennisProgram.CourtType;
import tennisProgram.Location;
import tennisProgram.Player;
import tennisProgram.PreliminaryInfo;
import tennisProgram.Stadium;

public class TennisMain 
{
	
	private Player player;
	private Stadium stadium;
	private Location location;
	private CourtType courtType;
	
	
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

	public Location getLocation() 
	{
		return location;
	}

	public void setLocation(Location location) 
	{
		this.location = location;
	}

	public CourtType getCourtType() 
	{
		return courtType;
	}

	public void setCourtType(CourtType courtType)
	{
		this.courtType = courtType;
	}
	
	public void gatherPrelim(PreliminaryInfo info) 
	{
		player = info.createPlayer();
		stadium = info.createStadium();
		location = info.createLocation();
		courtType = info.createCourtType();
		
	}


	public static void main(String[] args) 
	{
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter Preliminary info:");
		PreliminaryInfo preInfo = new PreliminaryInfo() 
		{
			
			@Override
			public Stadium createStadium()
			{
				System.out.println("Stadium Name: ");
				System.out.println(kbd.nextLine());
				return null;
			}
			
			@Override
			public Player createPlayer()
			{
				createPlayer().toString();
				return null;
			}
			
			@Override
			public Location createLocation()
			{
				createLocation().toString();
				return null;
			}
			
			@Override
			public CourtType createCourtType() 
			{
				createCourtType().toString();
				return null;
			}
		};
		
		
	}

}
