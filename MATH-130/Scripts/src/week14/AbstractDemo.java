package week14;

public class AbstractDemo {
	public static void main(String[] args) {
		CompSciStudent csStudent = new CompSciStudent("Jake", "1", 2020);
		csStudent.setMathHours(10);
		csStudent.setCsHours(10);
		csStudent.setGenHours(10);
		System.out.println(csStudent.toString());
		}
    }

abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;
    public Student(String name, String idNumber, int yearAdmitted) {
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;
        }
    public String toString() {
        String str;
        str = "Name: " + this.name
            + "\nID Number: " + this.idNumber
            + "\nYear Admitted: " + yearAdmitted;
        return str;
        }
    public abstract int getRemainingHours();
    }

class CompSciStudent extends Student {
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;
    private int mathHours;
    private int csHours;
    private int genEdHours;
    public CompSciStudent(String name, String idNumber, int yearAdmitted) {
        super(name, idNumber, yearAdmitted);
        }
    public void setMathHours(int mathHours) {
        this.mathHours = mathHours;
        }
    public void setCsHours(int csHours) {
        this.csHours = csHours;
        }
    public void setGenHours(int genEdHours) {
        this.genEdHours = genEdHours;
        }
    @Override
    public int getRemainingHours() {
        int reqHours, remainingHours;
        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
        remainingHours = reqHours - (this.mathHours + this.csHours);
        return remainingHours;
        }
    @Override
    public String toString() {
        String str;
        str = super.toString()
            + "\nMajor: Computer Science"
            + "\nMath Hours Taken: " + this.mathHours
            + "\nComputer Science Hours Taken: " + this.csHours
            + "\nGeneral Ed Hours Taken: " + this.genEdHours;
        return str;
        }
    }