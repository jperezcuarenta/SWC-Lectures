package week07;
import java.io.*;
public class PrintWriterExample {
	public static void main(String[] args) throws IOException {
		PrintWriter outputFile = new PrintWriter("Data.txt");
		outputFile.close();
		}
	}