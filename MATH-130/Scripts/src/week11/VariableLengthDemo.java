package week11;


public class VariableLengthDemo {
	public static void main(String[] args) {
		int output;
		int firstVal, secondVal, thirdVal, fourthVal;
		firstVal = 5; secondVal = 3; thirdVal = 10; fourthVal = 20;
		output = sum(10, 20);
		System.out.printf("The output is %d\n", output);
		output = sum(firstVal, secondVal, thirdVal, fourthVal);
		System.out.printf("The output is %d\n", output);
		}
	public static int sum(int... numbers) {
		int total = 0;
		for (int val : numbers)
			total += val;
		return total;
		}
	}
