package week08;

public class QuadraticDemo {

	public static void main(String[] args) {
		Quadratic quadObject = new Quadratic();
		quadObject.setCoeffs(3, 5, 1);
		quadObject.calculateRoots();
		quadObject.showRoots();
		quadObject.displayVertex();
		quadObject.showEndBehavior();
	}

}
