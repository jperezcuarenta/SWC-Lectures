package week08;
public class ScratchWork {
	public static void main(String[] args) {
		if (isValid(20)) {
			System.out.print("The value is in range.");
			}
		}
	public static boolean isValid(int x) {
		boolean status;
		if (x >= 1 && x <= 100) {
			status = true;
			}
		else {
			status = false;
			}
		return status;
		}
	}