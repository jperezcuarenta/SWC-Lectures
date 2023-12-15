package week10;

public class Exam03StudyGuide {
	public static void main(String[] args) {
		// You can use the main method to call a specific method
		// for a given question.
		// For example:
		System.out.println("Question 01:");
		question01();
		}
	public static void question01() {
		// What is written to the monitor by the following section of code: 
		String strA = new String("Roasted");
		String strB = new String("Acorns");
		strA = strB;
		System.out.print(strA);
		System.out.println(strB);
		}
	public static void question02() {
		// What is written to the monitor by the following section of code: 
		String strA = new String("Roasted");
		String strB = new String("Acorns"); 
		strA = strB;
		if (strA == strB)
		  System.out.print("Two copies of a reference.");
		else
		  System.out.print("Two different references.");
		}
	public static void question03() {
		//  How many objects have been created?
		// After the last statement has executed, how many objects are now accessible (don't count garbage)? 
		String strA = new String("Roasted ");
		String strB = new String("Acorns "); 
		strA = strB;
		}
	public static void question04() {
		//  How many objects (total) are created?
		// After the last statement has executed, how many objects are now accessible (don't count garbage)? 
		String strA = new String("Roasted ");
		strA        = new String("Toasted ");
		strA        = new String("Fried ");
		strA        = new String("Baked ");
		strA        = new String("Beans ");
		}
	public static void question05() {
		//  How many objects (total) are created?
		// After the last statement has executed, how many objects are now accessible (don't count garbage)? 
		String strA = new String("Roasted ");
		String strB = new String("Toasted ");
		String strC = new String("Fried ");
		String strD = new String("Baked ");
		String strE = new String("Beans ");
		}
	public static void question06() {
		//  How many objects (total) are created?
		// After the last statement has executed, how many objects are now accessible (don't count garbage)? 
		String strA = new String("Roasted ");
		String strB = strA;
		String strC = strA;
		String strD = strA;
		String strE = strA;
		}
	public static void question07() {
		// How many objects have been created?
		int area;
		String name;
		}
	public static void question08() {
		// How many objects have been created?
		String strA;
		String strB = new String("Cheese");		
		}
	public static void question09() {
		// What is the result of the following:
		String ring = "One ring to rule them all,\n";
		String find = "One ring to find them.";

		if ( ring.startsWith("One") && find.startsWith("One") )
		  System.out.println( ring+find );
		else
		  System.out.println( "Different Starts" );
		}
	public static void question10() {
//		 2. Which of the following is the general scheme for a class definition: 
		}
	}
