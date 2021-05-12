package tttgame.phase2;


//Nebil Weber
//CS 2336
//Professor: Dr Mehra Borazjany
//2/14/2021


/*                       					-Analysis
This program will be a tic-tac-toe game for phase 2. The majority of the code was provided, however the task was 
to implement the code to be more of a object oriented programming. We wanted to see if we could borrow a board class
from someone else and implement it in out code. 
*/



/*											-Design-
* The majority of the code was provided however, I will design a Aplayer abstact class, and enum mark, a 
* HumanPlayer class and a Iboard interface. 
*/


public class DriverMain {
	public static void main (String[] args) {
		//create object game 
		TTTGame game = new TTTGame();
		game.setBoard(new OtherBoardWrapper());
		game.setPlayers(new ComputerPlayer("Player1", Mark.X.getMark()), new HumanPlayer("Player2", Mark.O.getMark()));
        game.start();  // calling start to begin the game

	} 

}

 