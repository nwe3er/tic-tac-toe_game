package tttgame.phase2;

public interface Iboard {
	
	void print();
	void reset();
	String getMark(int row, int col);
	boolean makeMove (String player, int row, int col); 
	void setSize(int row, int col);
	int getColSize();
	int getRowSize();
	String getName();
	boolean isFull();
}
