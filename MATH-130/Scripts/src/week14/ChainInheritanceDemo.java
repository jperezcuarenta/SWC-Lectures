package week14;

// class ChainInheritanceDemo {
//     public static void main(String[] args) {
////         PassFailExam exam = new PassFailExam(100, 25, 60);
////         System.out.println(
////             "Each questions counts "
////             + exam.getPointsEach()
////             + " points."
////             );
////         System.out.println(
////             "The exam score is " + exam.getScore()
////             );
////         System.out.println(
////             "The exam grade is " + exam.getGrade()
////             );
//         
////         GradedActivity activity = new GradedActivity();
////         FinalExam3 exam3 = new FinalExam3(20, 2);
////         boolean x, y;
////         x = activity instanceof GradedActivity;
////         y = exam3 instanceof GradedActivity;
////         System.out.println(x);
////         System.out.println(y);
//         
//         // Section on Polymorphism
////         GradedActivity exam1 = new PassFailExam(100, 10, 70);
////         System.out.println(exam1.getScore()); // Works.
////         System.out.println(exam1.getGrade()); // Works.
////         System.out.println(exam1.getPointsEach()); // ERROR
//         // Section on binding:
////          GradedActivity examBinding = new PassFailActivity(60);
////          exam.setScore(70);
////          System.out.println(examBinding.getGrade()); // example of dynamic binding
//         }
// 	}

// Section on interface
class ChainInheritanceDemo {
    public static void main(String[] args) {
        FinalExam3 exam1 = new FinalExam3(100, 20);
        FinalExam3 exam2 = new FinalExam3(100, 30);
        System.out.println("Exam 1: " + exam1.getScore());
        System.out.println("Exam 2: " + exam2.getScore());
        if (exam1.equals(exam2)) {
            System.out.println("The exam scores are equal.");
            }
        if (exam1.isGreater(exam2)) {
            System.out.println("The Exam 1 score is the highest.");
            }
        if (exam1.isLess(exam2)) {
            System.out.println("The Exam 1 score is the lowest.");
            }
        }
	}

class GradedActivity {
    private double score;
    public void setScore(double score) {
        this.score = score;
        }
    public double getScore() {
        return this.score;
        }
    public char getGrade() {
        char letterGrade = 'F';
        if (this.score >= 90)
            letterGrade = 'A';
        else if (this.score >= 80)
            letterGrade = 'B';
        else if (this.score >= 70)
            letterGrade = 'C';
        else if (this.score >= 60)
            letterGrade = 'D';
    	return letterGrade;
    	}
    }

class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
        }
    @Override
    public char getGrade() {
        char letterGrade;
        letterGrade = 'F';
        if (super.getScore() >= this.minPassingScore) {
            letterGrade = 'P';
            }
        return letterGrade;
        }
    }

class PassFailExam extends PassFailActivity {
    private double pointsEach;
    private int numMissed;
    public PassFailExam(int numQuestions, int numMissed, double minPassing) {
        super(minPassing);
        double numericScore;
        this.numMissed = numMissed;
        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);
        setScore(numericScore);
        }
    public double getPointsEach() {
        return this.pointsEach;
        }
    public int getNumMissed() {
        return this.numMissed;
        }
    }

interface Relatable {
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
    }

class FinalExam3 extends GradedActivity implements Relatable {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    public FinalExam3(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        double numericScore;
        this.pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * this.pointsEach);
        setScore(numericScore);
        }
    public double getPointsEach() {
        return this.pointsEach;
        }
    public int getNumMissed() {
        return this.numMissed;
        }
    public boolean equals(GradedActivity g) {
        boolean status = false;
        if (this.getScore() == g.getScore()) {
            status = true;
            }
        return status;
        }
    public boolean isGreater(GradedActivity g) {
        boolean status = false;
        if (this.getScore() > g.getScore()) {
            status = true;
            }
        return status;
        }
    public boolean isLess(GradedActivity g) {
        boolean status = false;
        if (this.getScore() < g.getScore()) {
            status = true;
            }
        return status;
        }
    }