package ex4;

import java.util.Arrays;

public class Matrix {
	private int numberOfRow;
	private int numberOfColumn;
	private MatrixElements[] matrixElements;
	
	public Matrix() {

	}

	public Matrix(int numberOfRow, int numberOfColumn, MatrixElements[] matrixElements) {
		this.numberOfRow = numberOfRow;
		this.numberOfColumn = numberOfColumn;
		this.matrixElements = matrixElements;
	}

	public int getNumberOfRow() {
		return numberOfRow;
	}

	public void setNumberOfRow(int numberOfRow) {
		this.numberOfRow = numberOfRow;
	}

	public int getNumberOfColumn() {
		return numberOfColumn;
	}

	public void setNumberOfColumn(int numberOfColumn) {
		this.numberOfColumn = numberOfColumn;
	}

	public MatrixElements[] getMatrixElements() {
		return matrixElements;
	}

	public void setMatrixElements(MatrixElements[] matrixElements) {
		this.matrixElements = matrixElements;
	}

	@Override
	public String toString() {
		return "Matrix [numberOfRow=" + numberOfRow + ", numberOfColumn=" + numberOfColumn + ", matrixElements="
				+ Arrays.toString(matrixElements) + "]";
	}

	
}
