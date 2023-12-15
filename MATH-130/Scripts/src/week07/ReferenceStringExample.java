package week07;
import java.io.*;
import javax.swing.*;

public class ReferenceStringExample {
	public static void main(String[] args) throws IOException {
		String filename;
		filename = JOptionPane.showInputDialog(
			"Enter the "
			+ "filename.");
		PrintWriter outputFile = new PrintWriter(filename);
		outputFile.close();
		}
	}