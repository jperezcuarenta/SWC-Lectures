package week12;

public class SudokuRedemption {
	public static void main(String[] args) {
    	int[][] grid = {
			{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
	        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
	        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
	        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
	        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
	        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
	        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
	        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
	        { 0, 0, 5, 2, 0, 6, 3, 0, 0 },
	        };
    	showGrid(grid);
		}
	public static void showGrid(int[][] array) {
		for (int idx = 0; idx < array.length; idx++) {
			for (int jdx = 0; jdx < array[idx].length; jdx++) {
				System.out.print(array[idx][jdx] + " ");
				}
			System.out.println("");
			}
		}
	public static boolean solveSudoku(int[][] array, int row, int col) {
		// Handle edge cases:
		// Edge case A:
		// We are at second to last row AND at last column -- return true
		// Edge case B:
		// We are at the last column -- move on to the next row and reset col
		
		// If current value is non zero, call method at the next column
		// because there is nothing to do there, return solveSudoku
		
		// If we did not return, then we must figure out what value can be placed
		// for loop in [1, 10]
			// Check if the number is safe to place
				// If it is safe, place the number
				// if (call the recursion if solveSudoku at the next col)
					// return true
			// Set row/col to zero
		return false; // this means none of the [1, 10] were safe to place
		}
	
	public static boolean isSafe(int[][] grid, int row, int col, int num) {
		// check if num is a duplicate along rows
			// return false if true
		// check if num is a duplicate along cols
			// return false if true
		// check if num exists in 3 by 3 subgrid
			// return false if true
		return true;
		}
	}
	