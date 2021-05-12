package tttgame.phase2;

/*							-Design-
 * This class is the ComputerPlayer that extends APlayer. It contains a mark, and a player name.
 * The computer player will select the row and column randomly to play the TTTgame.
 */

public class ComputerPlayer extends APlayer {

	private String name;  	//Player name
	private String mark;	//player mark 
	
	//constructor
	 public ComputerPlayer(String name, String mark) {
		super(name, mark);
	}
	 
	
	
	//generates a random number
	private int randomNumber(int range) {
		return (int) (Math.random() * range); 
	}


	//Override and return a random row
	@Override
	public int selectRowValue(int range) {
		return randomNumber(range);
	}


	//Override and return a random row
	@Override
	public int selectColValue(int range) {
		return randomNumber(range);
	}
	
}

