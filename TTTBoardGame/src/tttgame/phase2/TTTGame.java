package tttgame.phase2;



/*										-Design-
 * The TTTGame class has an association class with both the board and player class. It will create two players 
 * and a board. This class will keep control of the game.
 */
 
public class TTTGame {

	private APlayer players[] = new APlayer[2];	//Creates 2 AI players
	private Iboard board;										//Board of the game
	
	private String marks[] = {"X", "0"};						//Symbols marks for the players
	private String name = "Tic-Tac-Toe";						//Name of the game
	
	private int gameRowSize = 3;								//row of the board
	private int gameColSize = 3;								//col of the board
	
	private int currentPlayerIndex = -1;						//position of player, has not be assigned yet
	
	//Constructor
	public TTTGame() { 
		setPlayers();
		setBoard();
	}
	
	//Setter for board
	private void setBoard() {
		this.board = new Board(gameRowSize, gameColSize, "TTTGame"); 
	} 
	
	//Setter for board
		public void setBoard(Iboard board) {
			System.out.println("The Other board will be used!");
			this.board = board; 
		}  
	
	private void setPlayers() {
		//Loop to assign player 1 to X and player 2 to 0
		for(int i = 0; i < players.length; i++) {
			ComputerPlayer p = new ComputerPlayer("player" + i+1, marks[i]);
			players[i] = p;
		}	
	}
	
	public void setPlayers(APlayer player1, APlayer player2) {
		players[0] = player1;
		players[1] = player2;
		}	

	
	/*The start method will start the game and prompt the user 
	 *that the game started. The user will also be told
	 * which player has a certain symbol. A do while loop
	 * will be used to control when to end the game. 
	 */
	public void start() {
		System.out.println(this.name + " Game started....");
		System.out.println("Player 1 will have mark X and player 2 will have 0.");
		System.out.println();

		do {
			switchPlayer();
			System.out.println("Player " + (this.currentPlayerIndex + 1)  + "'s turn ");
			
			while(!board.makeMove(players[this.currentPlayerIndex].getMark(), 
					players[this.currentPlayerIndex].selectRowValue(gameRowSize),
					players[this.currentPlayerIndex].selectColValue(gameColSize)));
			board.print();

			
		}while(!gameOver());
	} 
	
	//Method to switch players after each turn.
	private void switchPlayer() {
		if(this.currentPlayerIndex == -1) 
			this.currentPlayerIndex = 1;
		
		if(this.currentPlayerIndex == 1) this.currentPlayerIndex = 0;
		else this.currentPlayerIndex = 1;
	}
	
	//method to end the game when there is a winner or when the board is full.
	private boolean gameOver() {
		if(isWinner() || this.board.isFull()) {
			System.out.println("The Game is Over.");
			return true;
		}	
			return false;
	}
	
	//Method to decide if there is a row winner, column winner, 
	// right diagonal winner, or left diagonal winner.
	private boolean isWinner() {
		if(rowWin() || colWin() || rightDiagWin() || leftDiagWin())
			return true;
 
		return false;
	}
	
	//Method rowWin that returns true if there is a row winner on the board
	 private boolean rowWin() {
		 for(int i = 0; i < 2; i++) {
			 
			 //If the 1st row all equals each other, return true
			 if(this.board.getMark(0, 0).equals(marks[i]) && this.board.getMark(0,1).equals(marks[i])
			   && this.board.getMark(0, 2).equals(marks[i])){
				System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
				return true;
			 }	
			 //If the 2nd row all equal each other, return true
			 if (this.board.getMark(1, 0).equals(marks[i]) && this.board.getMark(1,1).equals(marks[i])
					 	&& this.board.getMark(1, 2).equals(marks[i])) {
						System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
						return true;
			 }
			 //If the 3rd row all equal each other, return true
			 if (this.board.getMark(2, 0).equals(marks[i]) && this.board.getMark(2,1).equals(marks[i])
					 	&& this.board.getMark(2, 2).equals(marks[i])) {
						System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
						return true;
			 }
				 
		 }	return false;	 				    		
	} 
	
	//Method colWin that returns true if there is a col winner on the board
	 private boolean colWin() {

		 for(int i = 0; i < 2; i++) {
			//If the 1st col all equal each other, return true
			 if(this.board.getMark(0, 0).equals(marks[i]) && this.board.getMark(1,0).equals(marks[i])
			   && this.board.getMark(2, 0).equals(marks[i])){
				System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
				return true;
			 }	
			//If the 2nd col all equal each other, return true
			 if (this.board.getMark(0, 1).equals(marks[i]) && this.board.getMark(1,1).equals(marks[i])
					 	&& this.board.getMark(2, 1).equals(marks[i])) {
						System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
						return true;
			 }
			//If the 3rd col all equal each other, return true
			 if (this.board.getMark(0, 2).equals(marks[i]) && this.board.getMark(1,2).equals(marks[i])
					 	&& this.board.getMark(2, 2).equals(marks[i])) {
						System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
						return true;
			 }	
		 
		 } return false;
	} 
	
	 //Method rightDiagWin that return true when there is a right diagonal winner on the board 
	 private boolean rightDiagWin() {
		for(int i = 0; i < 2; i++) {
			if(this.board.getMark(0, 0).equals(marks[i]) && this.board.getMark(1,1).equals(marks[i])
					&& this.board.getMark(2, 2).equals(marks[i])) {
				System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
				return true;
			}
		} return false;	
	} 
	
	//Method leftDiagWin that return true when there is a left diagonal winner on the board 
	 private boolean leftDiagWin() {
		 for(int i = 0; i < 2; i++) {
				if(this.board.getMark(0, 2).equals(marks[i]) && this.board.getMark(1,1).equals(marks[i])
						&& this.board.getMark(2, 0).equals(marks[i])) {
						System.out.println("Player " + (this.currentPlayerIndex + 1) + " has won the game!");
						return true;
				}
		 } return false;	
	 } 
  
}
