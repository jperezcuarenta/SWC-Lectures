package week09;
import java.util.Random;

public class Die {
	private int sides;
	private int value;
	
	public Die(int numSides) {
		// constructor
		sides = numSides; // updating the _sides_ field
		roll(); // updating the _value_ field (because of line 17)
		}
	
	public void roll() {
		// definition of the _roll_ method 
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
		}
	
	public int getSides() {
		return sides;
		}
	
	public int getValue() {
		return value;
		}
	}
