package week03;
//import java.util.Scanner;

class StudyGuideExamples {
	public static void main (String[] args) {
	        String name1 = "Mark";
	        String name2 = "Mark";
	        String name3 =  new String("Mark");
	 
	        System.out.println(name1 == name2); // true
	        System.out.println(name1 == name3); // false
	        System.out.println(name1.equals(name2)); // true
	        System.out.println(name1.equals(name3)); // true
		}
	}