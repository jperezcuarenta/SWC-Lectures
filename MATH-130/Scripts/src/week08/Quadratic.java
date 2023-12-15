package week08;
import java.lang.Math;

public class Quadratic {
	private double aCoeff;
	private double bCoeff;
	private double cCoeff;
	private double root1;
	private double root2;
	
	public void setCoeffs(double a, double b, double c) {
		aCoeff = a;
		bCoeff = b;
		cCoeff = c;
		System.out.println("Defining quadratic...");
		System.out.println("y = " + aCoeff + "x^2 + " + bCoeff + "x + " + cCoeff);
		System.out.println("");
		}
	
	public void calculateRoots() {
		double discriminant;
		discriminant = Math.pow(bCoeff, 2) - 4 * aCoeff * cCoeff;
		if (discriminant >= 0) {
			root1 = (-bCoeff + Math.pow(discriminant, 0.5)) / (2 * aCoeff);
			root2 = (-bCoeff - Math.pow(discriminant, 0.5)) / (2 * aCoeff);
			}
		else {
			System.out.println("Warning, roots are complex numbers.");
			System.out.println("Setting values to -1000");
			System.out.println("");
			root1 = -1000;
			root2 = -1000;
			}
		}
	public void showRoots() {
		System.out.println("The roots are");
		System.out.println("x0 = " + root1);
		System.out.println("and");
		System.out.println("x1 = " + root2);
		System.out.println("");
		}
	
	public void displayVertex() {
		double vertexVal = -bCoeff / (2 * aCoeff);
		System.out.println("The x coordinate of the vertex is");
		System.out.println("x = " + (vertexVal));
		System.out.println("");
		}
	
	public void showEndBehavior() {
		if (aCoeff > 0) {
			System.out.println("The end behavior is positive infinity.");
			}
		else if (aCoeff < 0) {
			System.out.println("The end behavior is negative infinity.");
			}
		else {
			System.out.println("This is not a quadratic polynomial.");			
			}
		System.out.println("");
		}
	}
