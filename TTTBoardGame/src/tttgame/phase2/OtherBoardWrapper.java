package tttgame.phase2;

public class OtherBoardWrapper implements Iboard{

	OtherBoard otherBoard = new OtherBoard();
	
	@Override
	public void print() {
		otherBoard.printMyBoard();
	}
	
	@Override
	public void reset() {
		//TODO
	}
	
	@Override
	public String getMark(int row, int col) {
		return otherBoard.getMark(row, col);		//forwarding
	}
	
	@Override
	public boolean makeMove (String player, int row, int col) {
		return otherBoard.setMark(row, col, player);
	}
	
	@Override
	public void setSize(int row, int col) {
		 otherBoard.setSize(row, col);
	}
	
	@Override
	public int getColSize() {
		return otherBoard.getColSize();
	}
	
	@Override
	public int getRowSize() {
		return otherBoard.getRowSize();
	}
	
	@Override
	public String getName() {
		return otherBoard.getname();
	}
	
	@Override
	public boolean isFull() {
		return (otherBoard.emptyCells().length==0);
	}
	
	
	
}
