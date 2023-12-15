package week08;

public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle box = new Rectangle();
		System.out.println(box.getWidth());
		System.out.println(box.getLength());
		System.out.println(box.getArea());
		box.setWidth(1.0);
		box.setLength(5.0);
		System.out.println(box.getWidth());
		System.out.println(box.getLength());		
		System.out.println(box.getArea());
		
		System.out.println("Initializing another Rectangle object...");
		Rectangle box1 = new Rectangle();
		System.out.println(box1.getWidth());
		System.out.println(box1.getLength());
		System.out.println(box1.getArea());
		box1.setWidth(100.0);
		box1.setLength(2.0);
		System.out.println(box1.getWidth());
		System.out.println(box1.getLength());		
		System.out.println(box1.getArea());
		}
	}
