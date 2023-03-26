package ex04;

public class Matrix {
	private int row;
	private int col;
	private int[][] element;
	
	public Matrix() {}
	
	public Matrix(int row,int col) {
		this.row = row;
		this.col = col;
		element = new int[row][col];
	}
	
	public int getValue(int row, int col) {
        return element[row][col];
    }

    public void setValue(int row, int col, int value) {
        element[row][col] = value;
    }

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		if(row<=0) {
			System.out.println("Invalid Row!");
		}
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		if(col<=0) {
			System.out.println("Invalid Col!");
		}
		this.col = col;
	}

	@Override
	public String toString() {
		return "Matrix [Row=" + row + ", Col=" + col + "]";
	}

}
