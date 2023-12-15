package week04;
import java.util.Scanner;

public class QuadSolver {
	public static void main(String[] args) {
		// solution to ax^2+bx+c = 0 is given by
		// x = (-b+-sqrt(b^2-4ac))/(2a)
		// so ask user for a, b, c and perform calculations
		double a, b, c, discriminant, root1, root2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input coefficient a:");
		a = keyboard.nextDouble();
		System.out.println("Input coefficient b:");
		b = keyboard.nextDouble();
		System.out.println("Input coefficient c:");
		c = keyboard.nextDouble();
		discriminant = Math.pow(b * b - 4 * a * c, 0.5); // equivalent to sqrt(b^2-4ac)
		if (discriminant > 0) {
			root1 = (-b + discriminant) / (2 * a);
			root2 = (-b - discriminant) / (2 * a);
			System.out.println("The roots are " + root1 +" and " + root2 + ".");
			System.out.println("Note: the discriminant is positive.");
			}
		else if (discriminant == 0) {
			root1 = -b / (2 * a);
			root2 = root1;
			System.out.println("The roots are " + root1 +" and " + root2 + ".");
			System.out.println("Note: the discriminant is zero.");
			}
		else {
			System.out.println("The roots are complex numbers.");
			System.out.println("Note: the discriminant is negative.");
			}
		keyboard.close();
		}
	}
