package week11;

public class PassObjectReferenceDemo {
	public static void main(String[] args) {
		boringClass instanceObject = new boringClass();
		someMethod(instanceObject);
		}
	public static void someMethod(boringClass inputObject) {
		inputObject.someDisplayMethod();
		}
	}
class boringClass {
	private double someInstanceField = 1;
	public void someDisplayMethod() {
		System.out.println(someInstanceField);
		}
	}
