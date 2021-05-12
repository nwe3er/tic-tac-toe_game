package tttgame.phase2;

import java.util.Scanner;

public class HumanPlayer extends APlayer {
	Scanner input = new Scanner(System.in);
	
	//constructor
	public HumanPlayer(String name, String mark) {
		super(name, mark);
	}
	
	//Override and return rowvalue
	@Override
	public int selectRowValue(int range) {
		System.out.println("\nplease enter a valid row number (0 to " + range + ")");
		int row;
		do {
			row = input.nextInt();
		}while(row < 0 && row > range);
		return row;
	}

	//Override and return Colvalue
	@Override
	public int selectColValue(int range) {
		System.out.println("\nplease enter a valid col number (0 to " + range + ")");
		int col;
		do {
			col = input.nextInt();
		}while(col < 0 && col > range);
		return col;
	}

}
