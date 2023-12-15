package week05;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int inputNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a number: ");
		inputNumber = keyboard.nextInt();
		System.out.print("Output: ");
		if (inputNumber%2 == 0) {
			System.out.print(inputNumber / 2);
			}
		else {
			System.out.print(3 * inputNumber + 1);
			}
		keyboard.close();
		}
	}
