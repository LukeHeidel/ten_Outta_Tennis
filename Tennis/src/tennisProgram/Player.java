package tennisProgram;

import java.util.Scanner;

public abstract class Player 
{
	Scanner kbd = new Scanner(System.in);
	private String gender = "GG";
	private String country = "Soviet Russia";
	private String name = "Rasputin";
	
	
	@Override
	public String toString() 
	{
		return "Player Parent";
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public String getName() 
	{
		return name;
	}
	
}
