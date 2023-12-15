package week12;

public class DescribeCompareCopyDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1, "John", "Chicago");
		Student s2 = new Student(2, "Jerry", "San Diego");
		System.out.println(s2);
		s2 = s1.copy();
		System.out.println(s2);
		}
	}
class Student{
	int num;
	String name, city;
	public Student(int r, String n, String c) {
		num = r;
		name = n;
		city = c;
	 	}
	 public String toString() {
		 return num + " " + name + " " + city;  
	 	}
	 public boolean equals(Student obj) {
		 boolean isEqual = false;
		 boolean numCheck, nameCheck, cityCheck;
		 numCheck = num == obj.num;
		 nameCheck = name.equals(obj.name);
		 cityCheck = city.equals(obj.city);
		 if (numCheck && nameCheck && cityCheck) {
			isEqual = true; 
		 	}
		 return isEqual;
		 }
	 public Student copy() {
		 // call the constructor 
		 // with the current object's fields
		 // to get a "copy" in a new object
		 Student objCopy = new Student(num, name, city);
		 return objCopy;
	 	}
	 }