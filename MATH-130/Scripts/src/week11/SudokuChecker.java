package week11;
import java.util.Arrays;

public class SudokuChecker {
	public static void main(String[] args) {
		for (int idx = 0; idx < 9; idx++)
			System.out.println(idx - idx % 3);
//		5 - 2 
//		int[][] initialGrid = getInitialPositions();
//		showArray(initialGrid);
		}
	public static int[][] getInitialPositions() {
		int[][] out = {
		  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
		  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
		  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
		  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
		  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
		  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
		  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
		  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
		  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
			};
		return out;
		}
	public static void showArray(int[][] array) {
		for (int row_num = 0; row_num < array.length; row_num++) {
			int[] row = array[row_num];
			System.out.println(Arrays.toString(row));
			}
		}
	}
