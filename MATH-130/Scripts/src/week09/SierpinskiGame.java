package week09;
import java.util.Random;
import java.io.*;

public class SierpinskiGame {
	public static void main(String[] args) throws IOException {
		final long TOTAL_ITERATIONS = 1000;
		Point initPoint = new Point(0.5, 0.4);
		ChaoticTriangle tri = new ChaoticTriangle(initPoint);

		for (int idx = 0; idx < TOTAL_ITERATIONS; idx++) {
			tri.appendToTxtFile();
			tri.getNewPoint();
			}
		}
	}

class Point {
		private double x;
		private double y;
		
		public Point(double xCoordinate, double yCoordinate) {
			x = xCoordinate;
			y = yCoordinate;
			}
			
		public void updatePointCoordinates(double xNew, double yNew) {
			x = xNew;
			y = yNew;
			}
		
		public double getXCoordinate() {
			return x;
			}
		
		public double getYCoordinate() {
			return y;
			}
	}

class ChaoticTriangle {
	Point currentPoint;
	Point vertexLeft;
	Point vertexTop;
	Point vertexRight;
	String outputTextFile;
	Random randGenerator;
	
	public ChaoticTriangle(Point initialPoint) throws IOException {
		vertexLeft = new Point(-1, 0);
		vertexTop = new Point(0, Math.sqrt(3));
		vertexRight = new Point(1, 0);
		currentPoint = initialPoint;
		outputTextFile = "TrianglePoints.txt";
		PrintWriter outputFile = new PrintWriter(outputTextFile);
		outputFile.close();
		randGenerator = new Random(1);
		}
	
	public void appendToTxtFile() throws IOException {
		FileWriter fwriter = new FileWriter(outputTextFile, true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		outputFile.printf("%.8f,%.8f\n", currentPoint.getXCoordinate(), currentPoint.getYCoordinate());
		outputFile.close();
		}
		
	public void getNewPoint() {
		int vertexSelect = randGenerator.nextInt(3) + 1;
		Point referencePoint;
		double newX;
		double newY;
		if (vertexSelect == 1) {
			referencePoint = vertexLeft;
			}
		else if (vertexSelect == 2) { 
			referencePoint = vertexTop;
			}
		else {
			referencePoint = vertexRight;
			}
		newX = 0.5 * (referencePoint.getXCoordinate() + currentPoint.getXCoordinate());
		newY = 0.5 * (referencePoint.getYCoordinate() + currentPoint.getYCoordinate());
		currentPoint.updatePointCoordinates(newX, newY);
		}
	}