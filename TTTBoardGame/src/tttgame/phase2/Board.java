 package tttgame.phase2;

 
/*											-Design-
  * This class is the Board of the game. It has a ownership relationship with Box class. Board will create an object
  * Box and store all the boxes in an array boxes. The board will print elements from the array and will determine when the 
  * board is full. The board will check if the box is available and if so place the mark.
  
  */

 public class Board implements Iboard {
 	private Box boxes[];		//array boxes to create the board of the game with a Box type
     private String name;		//String name for the game
     private int boardRowSize;	//Integer for board row size
     private int boardColSize;	//Integer for board col size
     
     //Default constructor
     Board() {
         this(3, 3, "TTTGame");
     }
     
     //Custom constructor
     Board(int rowSize, int colSize, String name) {
         this.setName(name);
         this.setSize(rowSize, colSize);
     }
     
     //Setter for row and col
    public void setSize(int row, int col) {
 	    //Validates the row and col size before setting the size
         if(row < 3 || col < 3 ) {
             System.out.println("The minimun board size is 3*3");
         }else {
             this.boardColSize = col;
             this.boardRowSize = row;
             //Calls initialize method
             initialize();
         }
    }
              
     void initialize() {
 	   		//object boxes array initialized
 	   		boxes = new Box[boardColSize * boardRowSize];
 	   		//For loop to create a 1-dimensional array for the boxes to be stored in a array
             for(int i = 0; i < boxes.length; i++) {
                 Box b = new Box(i/boardColSize, i%boardColSize);
                 //assign Box b to array boxes
                 boxes[i] = b;
             }
             //Call the print method
             print();
     }
              
     
    //This method prints the board that contains the boxes 
     public void print() {
         System.out.println("Printing the " + this.name + " (" + this.boardRowSize + "*" + this.boardColSize + ")" + " Board info....");
             
         for(int i = 0; i < boxes.length; i++) {
             if(i != 0 && i%boardColSize == 0)
                 System.out.println();
                 boxes[i].print();
             }
             System.out.println();
             System.out.println();
         }
              
     //setter for name        
     public void setName(String name) {
         this.name = name;
             
     }
     
     //method to make a move on the board, if a position is available 
     public boolean makeMove(String mark, int row, int col) {
     	if(boxes[row * boardColSize + col].setPlaceHolder(mark)) {
     		return true;
     	//If not available, prompt the user on the console to try again
     	}else {
     		System.out.println("Invalid position, please try again.");
     		return false;
     	}	

     }
     
     //Method to check if the board is full 
     public boolean isFull() {
     	for(Box b : boxes)
     		if(b.isAvailable()) return false;
     		System.out.println("Tie Break!");
     		return true;
     }        
     
     //This method gets the mark and returns it
     public String getMark(int row, int col) {
     	return boxes [row * this.boardColSize + col].getPlaceHolder();
     }
 	
     
    //Override and return the col size 
    @Override 
 	public int getColSize() {
 		return this.boardColSize;
 	}
 	
 	//Override and return the row size
 	@Override
 	public int getRowSize() {
 		return this.boardRowSize;
 	}
 	
 	
 	//Override and return the name
 	@Override
 	public String getName() {
 		return this.name;
 	}

	@Override
	public void reset() {
		this.reset();
	}
    	
 }

