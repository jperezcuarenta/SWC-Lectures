package week13;

public class FiboMatrix {
	public static void main(String[] args) {
		// transitionMatrix represents a matrix with
		// two rows and two columns.
		int[][] transitionMatrix = {{1, 1}, {1, 0}};
		// seedMatrix represents a matrix with
		// two rows and one column.
		int[][] seedMatrix = {{5}, {3}};
		// "result" is the product of the two matrices passed to matrixProduct().
		int[][] result = matrixProduct(transitionMatrix, seedMatrix);
		// This _for_ loop is here to show how we can
		// generate Fibonacci numbers without recursion.
		for (int idx = 0; idx < 50; idx++) {
			nthFibo(idx);
			}
		}
	// matrixProduct is a method for a multiplying two
	// matrices for the special case when
	// the left matrix has 2 rows and 2 columns
	// and the right matrix has 2 rows and 1 column.
	// You'll likely review matrix multiplication again in your other courses.
	// If you want to understand the formula, search Google for 
	// "how to multiply 2 matrices" or "how does matrix multiplication work".
	public static int[][] matrixProduct(int[][] matrixLeft, int[][] matrixRight) {
		int[][] matrixOut = new int[2][1];
		matrixOut[0][0] = matrixLeft[0][0] * matrixRight[0][0] + matrixLeft[0][1] * matrixRight[1][0];
		matrixOut[1][0] = matrixLeft[1][0] * matrixRight[0][0] + matrixLeft[1][1] * matrixRight[1][0];
		return matrixOut;
		}
	// nthFibo is a method that calls an equation
	// to generate the nth Fibonacci number.
	// Not much to study here, it's just an example of 
	// how mathematics can help you 
	// arrive at a more elegant solution.
	public static void nthFibo(int n) {
		double out;
		double gRatio =  Math.pow((1 + Math.sqrt(5)) / 2, n);
		double gRatioNeg = Math.pow((1 - Math.sqrt(5)) / 2, n);
		out = Math.floor((1 / Math.sqrt(5)) * (gRatio - gRatioNeg));
		System.out.println(out);
		}
	// showMatrix will loop through a 2D array
	// The outer loop iterates through the rows
	// The inner loop iterates through the columns
	// Given a fixed row, we print all the columns
	// then we print a line break so we can display the next row.
	public static void showMatrix(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
				}
			System.out.println("");
			}
		}
	}
