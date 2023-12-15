package week13;
public class FirstInheritDemo {
	public static void main(String[] args) {
//		FinalExam exam = new FinalExam(10, 2);
//		System.out.println(
//			"Each question counts " 
//			+ exam.getPointsEach() // defined in FinalExam
//			+ " points.\nThe exam score is "
//			+ exam.getScore() // defined in GradedActivity
//			+ "\nThe exam grade is "
//			+ exam.getGrade()); // defined in GradedActivity
		
		CurvedActivity curvedExam = new CurvedActivity(1.20);
		curvedExam.setScore(60.0);
		System.out.println("The raw score is " +
				curvedExam.getRawScore()
				+ " points.");
		System.out.println("The curved score is " 
				+ curvedExam.getScore());
		System.out.println("The exam grade is " 
				+ curvedExam.getGrade());
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

class CurvedActivity extends GradedActivity {
	double rawScore;
	double percentage;
	public CurvedActivity(double percentage) {
		this.percentage = percentage;
		this.rawScore = 0.0;
		}
	@Override
	public void setScore(double score) {
		this.rawScore = score;
		// invoke superclass version of setScore
		super.setScore(this.rawScore * this.percentage);
		}
	public double getRawScore() {
		return this.rawScore;
		}
	public double getPercentage() {
		return this.percentage;
		}
	}

class FinalExam extends GradedActivity {
	private int numQuestions;
	private int numMissed;
	private double pointsEach;
	public FinalExam(int numQuestions, int numMissed) {
		double numericScore;
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		this.pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * this.pointsEach);
		setScore(numericScore); // pay attention to this line.
		}
	public double getPointsEach() {
		return this.pointsEach;
		}
	public double getNumMissed() {
		return this.numMissed;
		}
	}