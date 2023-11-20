package Objects;

public class FootballStatistics extends SportsStatistics{
	
	public int pointsScored() {
		return major * 7 + minor * 3;
		
	}
	
	public double pointsPerGame() {
		return pointsScored()/getGamesPlayed();
	}
	
	
}
