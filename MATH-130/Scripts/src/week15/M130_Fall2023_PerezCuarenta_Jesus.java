package week15;


public class M130_Fall2023_PerezCuarenta_Jesus {
	public static void main(String[] args) {
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println("Problem 01");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		int[] sequenceInputs = {2, 4, 6};
		for (int idx = 0; idx < sequenceInputs.length; idx++) {
			System.out.println("Input parameter (int):");
			System.out.println(sequenceInputs[idx]);
			System.out.println("Output:");
			Walk.printSequence(sequenceInputs[idx]);
			System.out.println();
			}
		
		System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println("Problem 02");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		StarPattern obj = new StarPattern();
		PascalPattern pObj = new PascalPattern();
		int[] patternInputs = {-1, 0, 1, 2, 3};
		for (int rowNum = 0; rowNum < patternInputs.length; rowNum++) {
			System.out.println("Input parameter (int):");
			System.out.println(patternInputs[rowNum]);
			System.out.println("Parent class output:");
			obj.showPattern(patternInputs[rowNum]);
			System.out.println("Child class output:");
			pObj.showPattern(patternInputs[rowNum]);
			System.out.println();
			}
		
		System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println("Problem 03");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		CyberdyneSystems terminator = new CyberdyneSystems("T800", 'N', 10, 12);
		int numSteps = 5;
		System.out.println("Input parameters for constructor:");
		System.out.println("Name (String): T800"
				+ "\n"
				+ "Initial direction (char): N"
				+ "\n"
				+ "Initial x location (int): 10"
				+ "\n"
				+ "Initial y location (int): 12"
				);
		System.out.println("Amount of iterations (int): " + numSteps);
		System.out.println("Output:");
        for (int stepNum = 0; stepNum < numSteps; stepNum++) {
            if (stepNum % 2 == 0) {
            	terminator.rot90();
                }
            else {
            	terminator.irot90();
                }
            terminator.move(3);
            System.out.println(terminator);
            }

		System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println("Problem 04");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		int[][] x = {{1, 2}, {3, 4}};
		int[][] xT = Matrix.reflectAlongDiagonal(x);
		System.out.println("Input 2D array (int[][]):");
		Matrix.show(x);
		System.out.println("Output 2D array:");
		Matrix.show(xT);
		
		System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println("Problem 05");
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		String[] hideStrings = {"hello", "the trooper", "midnight train to georgia", "just one look", "genius of love"};
		int[] hideKeys = {1, 0, 5, 7, 27};
		String hiddenString, unhiddenString;
		for (int idx = 0; idx < hideKeys.length; idx++) {
			System.out.println("Input text (String):");
			System.out.println(hideStrings[idx]);
			System.out.println("Input key (int):");
			System.out.println(hideKeys[idx]);
			hiddenString = Hider.hide(hideStrings[idx], hideKeys[idx]);
			System.out.println("Output hidden text:");
		    System.out.println(hiddenString);
		    unhiddenString = Hider.unhide(hiddenString, hideKeys[idx]);
		    System.out.println("Output unhidden text:");
		    System.out.println(unhiddenString);
		    System.out.println();
			}
		}
	}

// Problem 01
class Walk {
	public static void printSequence(int N) {
		System.out.println();
		}
	}

//Problem 02
class StarPattern {
	public String insertElement(int ii, int jj) {
		return "";
		}
    public void showPattern(int N) {
    	}
	}

class PascalPattern extends StarPattern {
    public int factorial(int num) {
    	int numOut = 0;
        return numOut;
    	}
	@Override
    public String insertElement(int ii, int jj) {
    	return "";
    	}
	}

// Problem 03
class CyberdyneSystems {
    private String name;
    private char direction;
    private int xLoc, yLoc;
    public CyberdyneSystems(String name, char direction, int xLoc, int yLoc) {
        }
    public void rot90() {
        }
    public void irot90() {
        }
    public void move(int numSteps) {
        }
    public String toString() {
    	return "";
        }
    }

// Problem 04
class Matrix {
	public static int[][] reflectAlongDiagonal(int[][] matrix){
		int[][] out = {{0, 0}, {0, 0}};
	    return out;
		}
	public static void show(int[][] matrix) {
		}
	}

// Problem 05
class Hider {
	public static String hide(String message, int shiftKey) {
		String result = "";
        return result;
	    }
	public static String unhide(String cipherText, int shiftKey) {
		return "";
		}
	}