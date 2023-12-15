package week08;

public class Rectangle {
	private double length = 0;
	private double width = 0;

	public void setLength(double len) {
		length = len;
		}
	public void setWidth(double w) {
		width = w;
		}
	public double getWidth() {
		return width;
		}
	public double getLength() {
		return length;
		}
	public double getArea() {
		return length * width;
		}
	}