package boardgame;

public class Board {

	private int rows;
	private int colummns;
	private Piece [][] pieces;

	public Board(int rows, int colummns) {
		this.rows = rows;
		this.colummns = colummns;
		pieces = new Piece [rows][colummns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColummns() {
		return colummns;
	}

	public void setColummns(int colummns) {
		this.colummns = colummns;
	}
	
	
}
