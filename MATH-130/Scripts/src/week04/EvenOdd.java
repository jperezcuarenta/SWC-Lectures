package week04;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int numberInput, remainder;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a whole number: ");
		numberInput = keyboard.nextInt();
		remainder = numberInput % 2;
		if (remainder == 0) {
			System.out.println("The number " + numberInput + " is even.");
			System.out.println("Note: remainder upon division by 2 is " + remainder + ".");
			}
		else {
			System.out.println("The number " + numberInput + " is odd.");
			System.out.println("Note: remainder upon division by 2 is " + remainder + ".");
			}
		keyboard.close();
		}
	}
