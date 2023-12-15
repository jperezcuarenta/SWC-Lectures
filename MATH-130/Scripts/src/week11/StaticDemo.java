package week11;

public class StaticDemo {
	public static void main(String[] args) {
		int objectCount;
		System.out.println(Countable.instanceCount);
		Countable object1 = new Countable();
		Countable object2 = new Countable();
		Countable object3 = new Countable();
		objectCount = object1.getInstanceCount();
		System.out.println(objectCount + " instances created.");
		}}

class Countable {
	public static int instanceCount = 1;
	public Countable() {
		instanceCount++;
		}
	public int getInstanceCount() {
		return instanceCount;
		}
	}