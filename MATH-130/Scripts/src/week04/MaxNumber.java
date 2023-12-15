package week04;
import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		double num1, num2, num3, largestNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input the first number: ");
		num1 = keyboard.nextDouble();
		System.out.println("Input the second number: ");
		num2 = keyboard.nextDouble();
		System.out.println("Input the third number: ");
		num3 = keyboard.nextDouble();
		
		if (num1 >= num2 && num1 >= num3)
			largestNum = num1;
		else if (num2 >= num3 && num2 >= num3)
			largestNum = num2;
		else
			largestNum = num3;
		System.out.print("The largest number is: " + largestNum + ".");
		keyboard.close();
		}
	}
