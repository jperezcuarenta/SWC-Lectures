package week14;

public class ProtectedDemo {
    public static void main(String[] args) {
    	GenericClass_ obj = new GenericClass_();
        System.out.println(obj.num);
        obj.printNum();
        }
    }

class GenericClass_ {
    protected int num = 2023;
    protected void printNum() {
        System.out.println(num);
        }
    }