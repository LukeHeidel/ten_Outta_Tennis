package tennisProgram;

import java.util.Scanner;

public abstract class Stadium {

	Scanner kbd = new Scanner(System.in);
	private String stadName = "";
	private String stadLocation = "";
	private String stadCourtType = "";
	
	
	
	@Override
	public String toString() 
	{
		return "Stadium Parent";
	}
	
	public String getStadName() 
	{
		return stadName;
	}
	
	public String getStadLocation() 
	{
		return stadLocation;
	}
	
	public String getStadCourtType() 
	{
		return stadCourtType;
	}
	
}
