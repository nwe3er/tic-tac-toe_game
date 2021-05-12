
package tttgame.phase0;


	//Nebil Weber
	//CS 2336
	//Professor: Dr Mehra Borazjany
	//2/08/2021


	/*                       -Analysis
	 This program will be a tic-tac-toe game. The majority of the code was provided, however the task was to figure
	 out on how to end the game, whether there is a draw (tie), or a specific player (X or 0) that wins.
	 */


	/*                     -Design-
	 I will create the variable boolean gameEnded to determine on when the game needs to end. Variable count will keep track
	 of the number of available dashes left, so the game could to end with a draw if no one wins. After asking the user to input the row&col,
	 The program will validate the input to make sure that its between the range of (0-2). Every time it's either X's or
	 0's turn, I will use a for loop to go in the board array to see if there is a win. If there is, the endGame will be
	 flagged and the loop will break to end the game. If not, the count variable will increment each time after a player
	 makes a move. Eventually an if statement will execute the draw statement and terminate.
	 */




	import java.util.*;

	public class TTTBoard_phase0 {
	    public static void main (String args[]){
	        //input from the keyboard
	        Scanner input = new Scanner(System.in);
	        //array board to create a tik tac toe game and store X's and 0's
	        char board[][] = new char[3][3];
	        
	        for(int row = 0; row < board.length; row++){
	            for(int col = 0; col < board[row].length; col++){
	                board[row][col] = '-';
	            }
	        }
	        
	        char player = 'X';
	        int rowNum = -1;
	        int colNum = -1;
	        //flags when the game ends
	        boolean gameEnded = false;
	        int count = 0;
	        
	        do{
	            System.out.println("Printing the board info...");
	        
	            for(int row = 0; row < board.length; row++){
	                for(int col = 0; col < board[row].length; col++){
	                    System.out.print(board[row][col] + " ");
	                }
	                System.out.println();
	            }
	            
	            
	            //Prompts the user, then Verifies that row and col are in bound.
	            while(true){
	                System.out.print("Player " + player + ", please select a row number (0-2): ");
	                rowNum = input.nextInt();
	                System.out.print("Player " + player + ", please select a column number (0-2): ");
	                colNum = input.nextInt();
	            
	                if(rowNum < 0 || colNum < 0 || rowNum > 2 || colNum > 2) {
	                    //rowNum & colNum invalid.
	                    System.out.println("Your row and col are out of bounds! Please try again.");
	                } else if(board[rowNum][colNum] != '-'){
	                    //Board postion has X or 0
	                    System.out.println("Someone has already made a move there!");
	                } else {
	                    break; //rowNum and col are valid
	                }
	            }
	            
	            
	            if(board[rowNum][colNum] == '-')
	                //make the move
	                board[rowNum][colNum] = player;

	            
	            //Check row to see if there is a win for player X.
	            if(player == 'X'){
	                for(int row = 0; row < board.length; row++){
	                    if(board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != '-'){
	                        //Player X has Won
	                        System.out.println("Player X has won!!!");
	                        gameEnded = true;
	                        break;
	                    }
	                }
	            }

	                //Check col to see if there is a win for player X.
	                if(player == 'X'){
	                    for(int col = 0; col < board.length; col++){
	                        if(board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != '-'){
	                            //Player X has Won
	                            System.out.println("Player X has won!!!");
	                            gameEnded = true;
	                            break;
	                        }
	                    }
	               }

	                //Check diagonals to see if there is a win for player X.
	                if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-'){
	                    //Player X has Won
	                    System.out.println("Player X has won!!!");
	                    gameEnded = true;
	                    break;
	                }

	                if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-'){
	                    //Player X has Won
	                    System.out.println("Player X has won!!!");
	                    gameEnded = true;
	                    break;
	                }
	                
	    
	            //Check row to see if there is a win for player 0.
	            if(player == '0'){
	                for(int row = 0; row < board.length; row++){
	                    if(board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != '-'){
	                        //Player X has Won
	                        System.out.println("Player 0 has won!!!");
	                        gameEnded = true;
	                        break;
	                    }
	                }
	             }

	                //Check col to see if there is a win for player 0.
	                if(player == '0'){
	                    for(int col = 0; col < board.length; col++){
	                        if(board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != '-'){
	                            //Player 0 has Won
	                            System.out.println("Player 0 has won!!!");
	                            gameEnded = true;
	                            break;
	                        }
	                    }
	                }
	                    

	                //Check diagonals to see if there is a win for player 0.
	                if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-'){
	                    //Player 0 has Won
	                    System.out.println("Player 0 has won!!!");
	                    gameEnded = true;
	                    break;
	                }

	                if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-'){
	                    //Player 0 has Won
	                    System.out.println("Player 0 has won!!!");
	                    gameEnded = true;
	                    break;
	                }
	        
	        //Checks to see if there is a tie in the game
	            count++;
	            if (count == 9){
	                System.out.println("The game ended with a draw.");
	                gameEnded = true;
	                break;
	            }
	            
	            
	            //goes to the next player
	            if(player == 'X') player = '0';
	            else player = 'X';
	            
	        }while (!gameEnded);
	        
	     }
	}
	   
	    



