package Objects;

public class GoalieHockeyStatistics extends HockeyStatistics{
	//HockeyStatistics is now a superclass for this class
	public double goalsAllowed() {
		//should be 
		//majorScored()/getGamesPlayed();
		return pointsScored()/getGamesPlayed();
	}
	
	
}
