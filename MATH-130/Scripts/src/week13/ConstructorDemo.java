package week13;

public class ConstructorDemo {
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		}
	}
class SuperClass {
	public SuperClass() {
		System.out.println("Superclass constructor.");
		}
	}
class SubClass extends SuperClass {
	public SubClass() {
		System.out.println("Subclass constructor.");
		}
	}
