package week09;

public class RectangleDoubleConstructor {
	public static void main(String[] args) {
		Rectangle noParamRect = new Rectangle();
		noParamRect.showAllDimensions();
		Rectangle paramRect = new Rectangle(5, 25);
		paramRect.showAllDimensions();
		}
	}

class Rectangle {
	private double width;
	private double length;
	public Rectangle() {
		width = 10;
		length = 10;
		}
	public Rectangle(double l, double w) {
		length = l;
		width = w;
		}
	public void showAllDimensions() {
		System.out.println("The length is:");
		System.out.println(length);
		System.out.println("The width is:");
		System.out.println(width);
		}
	}