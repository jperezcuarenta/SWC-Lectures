package week07;
import java.util.Scanner;
import java.io.*;

public class Attempt {
	public static void main(String[] args) throws IOException {
//		String fileString = "C:\\Users\\Jesus Perez Cuarenta\\eclipse-workspace\\Labs\\Irreplaceable.txt";
		String fileString = ""; // Modify this line with the right path!
		File fileInstance = new File(fileString);
		Scanner fileIn = new Scanner(fileInstance);
		String currentWord;
		int wordCounter = 0;
		while (fileIn.hasNext()) {
			currentWord = fileIn.next();
			if (currentWord.contains(",")) {
				System.out.println(currentWord);
				currentWord = currentWord.replace(",", "");
				System.out.println(currentWord);
				}
			if (currentWord.equalsIgnoreCase("left")) {
				wordCounter++;
				}
			}
		System.out.print(wordCounter);
		fileIn.close();
		}
	}
