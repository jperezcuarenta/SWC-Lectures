package week11;
import java.util.*;


public class ArrayListDemo {
	public static void main(String[] args) {
		// create obj and store address
		ArrayList<String> nameList = new ArrayList<String>();
		// add references to String objects
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");
		System.out.println(
			"The arrayList has "
			+ nameList.size()
			+ " objects stored in it"
			);
		System.out.println(nameList.get(1));
		nameList.remove(1);
		System.out.println(nameList.get(1));
		nameList.add(1, "Catherine");
		System.out.println(nameList.get(1));
		nameList.set(1, "Jennifer");
		System.out.println(nameList.get(1));
		}
	}
