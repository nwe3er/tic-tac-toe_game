package tttgame.phase1;

/*							-Design-
 * This class is for the Player. The player has a string name and string mark for a symbol. 
 * The randomNumber method will be created and used to generate random numbers for the 
 * computer to select a row and column.
 */

public class ComputerPlayer {

	private String name;  	//Player name
	private String mark;	//player mark
	
	//constructor
	 public ComputerPlayer(String name, String mark) {
		this.setName(name);
		this.setMark(mark);
	}
	 
	 //Getter for name
	String getName() {
		return name;
	}
	
	//Setter for name
	void setName(String name) {
		this.name = name;
	}
	
	//Getter for mark
	String getMark() {
		return mark;
	}
	
	//Setter for mark
	void setMark(String mark) {
		this.mark = mark;
	}
	
	//Generates random number for AI to select a row/col
	public int randomNumber(int range) {
		return (int) (Math.random() * range); //Returns an cast double value to an integer
	}
	
}
