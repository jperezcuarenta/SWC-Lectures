package week12;

public class ReturnObjectDemo {
	public static void main(String[] args) {
		// declare reference variable
		GenericObject obj;
		// generate object and assign the reference
		obj = getObject();
		}
	public static GenericObject getObject() {
		return new GenericObject();
		}
	}
class GenericObject {
	// Some fields and methods go here...
	}
