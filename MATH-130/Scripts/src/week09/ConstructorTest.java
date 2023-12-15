package week09;

class Constructor {
	private double length;
	private double width;
	public Constructor(double x, double y) {
		length = x;
		width = y;
		}
	public void setNewValues() {
		length = 1;
		width = 1;
		}
	public void displayVals() {
		System.out.println(length);
		System.out.println(width);
		}
	}

public class ConstructorTest {
	public static void main(String[] args) {
		Constructor c = new Constructor(1, 2);
		c.displayVals();
		c.setNewValues();
		c.displayVals();
		}
	}