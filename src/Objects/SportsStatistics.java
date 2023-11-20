package Objects;

public class SportsStatistics {
	
	public int major;
	public int minor;
	public int gamesPlayed;
	
	//constructors
	public SportsStatistics() {
		
	}
	
	public SportsStatistics(int ma, int mi) {
		major = ma;
		minor = mi;
	}
	
	//accessor methods
	public int getMajor() {
		return major;
	}
	
	public int getMinor() {
		return minor;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
	//method
	public int pointsScored() {
		return major + minor;
	}
	
}
