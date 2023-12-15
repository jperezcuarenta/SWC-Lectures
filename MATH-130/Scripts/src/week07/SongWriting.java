package week07;
import java.io.*;

public class SongWriting {
	public static void main(String[] args) throws IOException {
		String filename = "SomeSong.txt";
		PrintWriter outputFile = new PrintWriter(filename);
		outputFile.println("And as you stay for the play, fantasy, has in store for you");
		outputFile.println("A glowing light will see you through");
		outputFile.println("It's your day, shining day, all your dreams come true");
		outputFile.println("As you glide, in your stride with the wind, as you fly away");
		outputFile.println("Give a smile, from your lips, and say");
		outputFile.println("I am free, yes I'm free, now I'm on my way");
		outputFile.close();
		}
	}
