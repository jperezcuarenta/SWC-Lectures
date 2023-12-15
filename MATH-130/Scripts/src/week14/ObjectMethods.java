package week14;

public class ObjectMethods {
    public static void main(String[] args) {
        GenericClass obj = new GenericClass();
        GenericClass obj1 = new GenericClass();
        System.out.println(obj.toString()); // toString
        System.out.println(obj1.toString());
        System.out.println(obj.equals(obj1));
        }
    }
class GenericClass extends Object {
    int num = 1;
    void getNum() {
        System.out.println(this.num);
        }
    }