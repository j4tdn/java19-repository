package ex4;

public class App2 {

	public static void main(String[] args) {
		Matrix matrix = new Matrix(3, 3, new MatrixElements[] {
				new MatrixElements(0,0,47),	new MatrixElements(0,1,47),	new MatrixElements(0,2,36),
				new MatrixElements(1,0,23),	new MatrixElements(1,1,43),	new MatrixElements(1,2,31),
				new MatrixElements(2,0,46),	new MatrixElements(2,1,7),	new MatrixElements(2,2,29)
				
		});
		
		MatrixUtil.matrixPrint(matrix);
		MatrixUtil.haveSaddleElement(matrix);
	}

}
