package tennisProgram;


public class NewPlayers extends Player {
	
	@Override
	public String toString() 
	{
		return "Player";
	}

	public String getGender()
	{
		return kbd.nextLine();
	}
	
	public String getCountry()
	{
		return kbd.nextLine();
	}
	
	public String getName()
	{
		return kbd.nextLine();
	}
}
