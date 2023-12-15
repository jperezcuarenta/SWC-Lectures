package week08;

public class CircleDemo {
	public static void main(String[] args) {
		System.out.println("Working on first object...");
		Circle circObject = new Circle();
		circObject.setRadius(1);
		System.out.println("Radius is " + circObject.getRadius());
		System.out.println("Area is " + circObject.getArea());
		System.out.println("Circumference is " + circObject.getCircumference());
		
		System.out.println("Working on second object...");	
		Circle otherCircObject = new Circle();
		otherCircObject.setRadius(5);
		System.out.println("Radius is " + otherCircObject.getRadius());
		System.out.println("Area is " + otherCircObject.getArea());
		System.out.println("Circumference is " + otherCircObject.getCircumference());
		}
	}