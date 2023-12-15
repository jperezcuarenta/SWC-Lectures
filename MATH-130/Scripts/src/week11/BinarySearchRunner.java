package week11;

public class BinarySearchRunner {
	public static void main(String[] args) {
		int[] arrayIn = {1, 3, 4, 6, 7, 8, 10, 13, 14};
		int valueIn = 4;
		int indexOfInterest;
		indexOfInterest = binarySearch(arrayIn, valueIn);
		System.out.printf("The value %d is at position %d", valueIn, indexOfInterest);
		}
	
	public static int binarySearch(int[] array, int value) {
		int first, last, middle, position;
		boolean found;
		first = 0; last = array.length - 1; position = -1; found = false;
		while (!found && first <= last) {
			middle = (first + last) / 2;
			if (array[middle] == value) {
				found = true;
				position = middle;
				}
			else if (array[middle] > value)
				last = middle - 1;
			else
				first = middle + 1;
			}
		return position;
		}
	}
