package week02;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		double milesDriven;
		double gallonsUsed;
		double milesPerGallon;

		System.out.print("Enter the number of miles driven: ");
		milesDriven = keyboard.nextDouble();
		
		System.out.print("Enter the amount of gallons used: ");
		gallonsUsed = keyboard.nextDouble();
		
		milesPerGallon = milesDriven / gallonsUsed;
		
		System.out.print(
				"The miles per gallon calculation is: "
				+ milesPerGallon
				);
		
		keyboard.close();
	}
}
