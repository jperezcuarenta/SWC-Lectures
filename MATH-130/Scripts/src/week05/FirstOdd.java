package week05;
import java.util.Scanner;

public class FirstOdd {
	public static void main(String[] args) {
		int inputNumber, currentNumber;
		boolean isOdd;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		inputNumber = keyboard.nextInt();
		currentNumber = inputNumber;
		isOdd = false;
		while (!isOdd) {
			if (currentNumber%2 == 1) {
				isOdd = true;
				}
			else {
				currentNumber = currentNumber / 2;
				}
			}
		System.out.println("Starting the Collatz sequence with input: " + inputNumber);
		System.out.println("The first odd number found in the Collatz sequence is: " + currentNumber);
		keyboard.close();
		}
	}
