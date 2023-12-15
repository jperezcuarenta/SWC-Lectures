package week07;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SongCounter {
	public static void main(String[] args) throws IOException {
		String fileString = "C:\\Users\\Jesus Perez Cuarenta\\eclipse-workspace\\Labs\\Irreplaceable.txt";
		File fileInstance = new File(fileString);
		Scanner fileIn = new Scanner(fileInstance);
		String currentWord;
		int wordCounter = 0;
		while (fileIn.hasNext()) {
			currentWord = fileIn.next();
			System.out.println(currentWord);
			if (currentWord.contains(",")) {
				currentWord = currentWord.replace(",", "");
				}
			if (currentWord.equalsIgnoreCase("left")) {
				wordCounter++;
				}
			}
		System.out.print(wordCounter);
		fileIn.close();
		}
	}
