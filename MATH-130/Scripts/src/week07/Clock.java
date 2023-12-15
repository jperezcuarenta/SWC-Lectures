package week07;

public class Clock {
	public static void main(String[] args) {
		double outNum, denom;
		int numTerms, stopNum;
		numTerms = 20;
		outNum = 1;
		for (int idx = 1; idx <= numTerms; idx ++) {
			denom = 1;
			stopNum = idx;
			while (stopNum > 1) {
				denom = denom * stopNum;
				stopNum -= 1;
				}
			outNum = outNum + (1 / denom);
			System.out.println(outNum);
			}

		}
	}
