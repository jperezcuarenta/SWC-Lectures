package week08;

public class Circle {
	private double radius;
	public void setRadius(double r) {
		radius = r; // update class field
		}
	public double getRadius() {
		return radius;
		}
	public double getArea() {
		return Math.PI * radius * radius;
//		return Math.PI * Math.pow(radius, 2);
		}
	public double getCircumference() {
		return 2 * Math.PI * radius;
		}
	}