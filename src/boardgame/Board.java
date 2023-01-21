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
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
