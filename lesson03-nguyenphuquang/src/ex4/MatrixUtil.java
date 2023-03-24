package ex4;

public class MatrixUtil {

	public static void matrixPrint(Matrix matrix) {
		MatrixElements[] elements = matrix.getMatrixElements();
		for (int i = 0; i < matrix.getNumberOfRow(); i++) {
			for (int j = 0; j < matrix.getNumberOfColumn(); j++) {
				for (MatrixElements id : elements) {
					if (j == id.getColumn() && i == id.getRow()) {
						System.out.print(id.getValue() + "\t");
						break;
					}

				}
			}
			System.out.print("\n");
		}
	}

	public static boolean haveSaddleElement(Matrix matrix) {
		MatrixElements[] elements = matrix.getMatrixElements();
		for (MatrixElements id : elements) {
			if (isMinOfRow(matrix, id) == true && isMaxOfColumn(matrix, id) == true) {
				System.out.println("Saddle element is: " + id);
				return true;
			}
		}

		return false;
	}

	public static boolean isMinOfRow(Matrix matrix, MatrixElements elements) {
		int row = elements.getRow();
		MatrixElements[] ids = matrix.getMatrixElements();
		for (MatrixElements id : ids) {
			if (id.getRow() == row) {
				if (elements.getValue() > id.getValue()) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isMaxOfColumn(Matrix matrix, MatrixElements elements) {
		int column = elements.getColumn();
		MatrixElements[] ids = matrix.getMatrixElements();
		for (MatrixElements id : ids) {
			if (id.getColumn() == column && elements.getValue() < id.getValue()) {
				return false;
			}
		}
		return true;
	}
}
