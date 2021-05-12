package tttgame.phase2;


/*
 * Aplayer is an abstract class. It contains a mark and a name
 * with the getters and setters. Lastly, there are two abstract methods for 
 * player to select a row and column from. 
 */
public abstract class APlayer {

	private String name;  	//Player name
	private String mark;	//player mark
	
	//constructor
	APlayer(String name, String mark) {
		this.setName(name);
		this.setMark(mark);
	}
	 
	 //Getter for name
	public String getName() {
		return name;
	}
	
	//Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter for mark
	public String getMark() {
		return mark;
	}
	
	//Setter for mark
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	//abstract method to select a row
	public abstract int selectRowValue(int range);
	//abstract method to select a col
	public abstract int selectColValue(int range);
	
}
