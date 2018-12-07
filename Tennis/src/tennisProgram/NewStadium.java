package tennisProgram;

public class NewStadium extends Stadium {
	
	@Override
	public String toString() 
	{
		return "Stadium";
	}

	@Override
	public String getStadName()
	{
		return kbd.nextLine();
	}
	
	@Override
	public String getStadLocation()
	{
		return kbd.nextLine();
	}
	
	@Override
	public String getStadCourtType()
	{
		return kbd.nextLine();
	}
	
}
