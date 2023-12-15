package week11;
import java.util.Arrays;


public class SelectionSortRunner {
	public static void main(String[] args) {
		int[] inputArray = {19, 7 , 8, 4, 5, 6, 1, 1};
		selectionSort(inputArray);
		System.out.println(Arrays.toString(inputArray));
		}
	
	public static void selectionSort(int[] array) {
	    int startScan, index, minIndex, minValue;
	    for (startScan = 0; startScan < array.length - 1; startScan++) {
	        minIndex = startScan;
	        minValue = array[startScan];
	        for(index = startScan + 1; index < array.length; index++) {
	            if (array[index] < minValue) {
	                minValue = array[index];
	                minIndex = index; 
	                }
	            }
	        array[minIndex] = array[startScan];
	        array[startScan] = minValue;
			}
		}
	}
