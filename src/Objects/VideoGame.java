package Objects;

public class VideoGame extends ScrollingGame implements GameDesign, SoundDesign{
	//An interface is implemented 
	//It must implement the inherited abstract methods
	
	public void background() {
		//code
	}
	
	public void loadingBar() {
		//still put in your own methods
	}
	
	public void volume() {
		//code
	}
	
	public void fly() {
		//code
	}
	
	public int numLives() {
		return 0;
	}
	
}
