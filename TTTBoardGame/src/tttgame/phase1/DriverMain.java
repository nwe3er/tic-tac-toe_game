package tttgame.phase1;
//Nebil Weber
//CS 2336
//Professor: Dr Mehra Borazjany
//2/14/2021


/*                       					-Analysis
This program will be a tic-tac-toe game for phase 1. The majority of the code was provided, however the task was to figure
out on how to set the players of the game, where it is available for a player to make a mark, and know when to end the game 
with a win or a tie.
*/



/*											-Design-
 * I will design to create a method to switch the players from 1 to 2. Then I will create a mark method 
 * that will check to see if the board has a DASH symbol that way a player can make a move and set it's 
 * position on the board. Finally, I will create a Win method to end the game with a tie break or 
 * if player 1 or player 2 wins. 
 */


public class DriverMain {

	public static void main(String[] args) {
		//create object game 
		TTTGame game = new TTTGame();
		//calling start to begin the game
        game.start();  

	} 

}

	