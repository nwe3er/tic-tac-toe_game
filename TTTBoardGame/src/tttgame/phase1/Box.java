 package tttgame.phase1;


/*											-Design-
 * This class is the Box of the game. It has a two private integers, row and col to store the row/col values of a box. The Constant 
 * static String Dash will be used to initialize the String placeholder to see if a '-' symbol is within a Box
 * to determine if there is availability for a player to make a move in that particular Box. 
 */

public class Box {

	private int row;							//Integer to hold row number 
    private int col;							//Integer to hold col number
    private final static String DASH = "-";		//Constant String DASH used as a '-' symbol to initialize placeHolder.		
    private String placeHolder = Box.DASH;		//String placeHolder is assigned to default value DASH contained in Box
    
    
    //Custom Constructor for the box that assigns integers row and col
    Box(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    //Getter for placeHolder
    String getPlaceHolder() {
        return placeHolder;
    }
    
    //Setter for placeHolder
    boolean setPlaceHolder(String placeHolder) {
    	//Checks to see if that position is available
        if(isAvailable()) {
        	//assign if position is available
            this.placeHolder = placeHolder;
            return true;
        }
    //else return false 
        return false;
    }
    
    
    //Methods checks to see if placeHolder is equal DASH and returns that value.
    boolean isAvailable(){
        return this.placeHolder.equals(Box.DASH);
    }
   
    // Prints the placeholder with a space 
    void print() {
        System.out.print(placeHolder + " ");
    }
    
    
	
}
