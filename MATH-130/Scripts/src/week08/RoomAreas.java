package week08;
public class RoomAreas {
	public static void main(String[] args) {
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		kitchen.setLength(10.0);
		kitchen.setWidth(14.0);
		bedroom.setLength(15.0);
		bedroom.setWidth(12.0);
		den.setLength(20.0);
		den.setWidth(30.0);
		System.out.print(
			"The total area of"
			+ " the rooms is "
			+ (kitchen.getArea() + bedroom.getArea() + den.getArea())
			+ " units squared."
			);
		}
	}
