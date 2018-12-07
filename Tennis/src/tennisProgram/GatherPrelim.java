package tennisProgram;



public class GatherPrelim extends PreliminaryInfo {
	
	
	@Override
	public Player createPlayer() {
		// TODO Auto-generated method stub
		return new NewPlayers();
		
	}

	@Override
	public Stadium createStadium() {
		// TODO Auto-generated method stub
		return new NewStadium();
	}

}
