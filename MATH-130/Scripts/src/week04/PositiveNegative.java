package week04;
import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		int inputNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Type in a number: ");
		inputNumber = keyboard.nextInt();
		if (inputNumber > 0) {
			System.out.print(inputNumber + " is positive.");
			}
		else if (inputNumber < 0) {
			System.out.print(inputNumber + " is negative.");
			}
		else {
			System.out.print(inputNumber + " is neither positive or negative.");
			}
		keyboard.close();
		}
	}
