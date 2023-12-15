package week11;

public class MethodSignature {
    public static void main(String[] args) {
        int xNumeric = 1;
        int yNumeric = 1;
        int zNumeric;
        String xString = "1";
        String yString = "1";
        String zString;
        zNumeric = someMethod(xNumeric, yNumeric);
        zString = someMethod(xString, yString);
        System.out.println(zNumeric);
        System.out.println(zString);
        }
    public static int someMethod(int x, int y) {
        return x + y;
        }
    public static String someMethod(String x, String y) {
        return x + y;
        }
    }
