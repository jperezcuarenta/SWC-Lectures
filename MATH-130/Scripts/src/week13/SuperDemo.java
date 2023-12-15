package week13;

public class SuperDemo {
	public static void main(String[] args) {
		SubClass02 obj = new SubClass02();
			}
		}
class SuperClass02 {
	public SuperClass02() {
		System.out.println("Superclass no-arg constructor.");
		}
	public SuperClass02(int arg) {
		System.out.println(arg + " was passed to the constructor.");
		}
	}
class SubClass02 extends SuperClass02 {
	public SubClass02() {
		super(10); // calling the superclass constructor
		System.out.println("Subclass constructor.");
		}
	}
