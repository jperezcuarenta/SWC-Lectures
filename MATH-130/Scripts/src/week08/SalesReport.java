package week08;
import java.util.Scanner;
import java.io.*;
public class SalesReport {
	public static void main(String[] args) throws IOException {
		final int NUM_DAYS = 30;
		String filename;
		double totalSales;
		double averageSales;
		filename = getFileName();
		totalSales = getTotalSales(filename);
		averageSales = totalSales / NUM_DAYS;
		displayResults(totalSales, averageSales);
		}
   
	public static String getFileName() {
		String filename;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the name of the file: ");
		filename = keyboard.nextLine();
		keyboard.close();
		return filename;
		}     
		
	public static double getTotalSales(String filename) throws IOException {
		double total = 0.0;
		double sales;
		Scanner inputFile = new Scanner(new File(filename)); 
		while (inputFile.hasNext()) {
			sales = inputFile.nextDouble();			   
			total += sales;
			}
		return total;
		}
		
	public static void displayResults(double total, double avg) {
		System.out.printf("Total sales: $%,.2f\n", total);
		System.out.printf("Average daily sales: $%,.2f\n", avg);
		}
	}
