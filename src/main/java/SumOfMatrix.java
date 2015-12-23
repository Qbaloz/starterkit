import Jama.Matrix;

public class SumOfMatrix {

	public Matrix addTwoMatrix(Matrix first, Matrix second) {
		Matrix sumMatrix = null;
		try {
			sumMatrix = first.plus(second);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sumMatrix;
	}

}
