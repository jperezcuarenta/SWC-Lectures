package week13;

public class EnumDemo {
    public static void main(String[] args) {
        enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
        Day workDay = Day.WEDNESDAY;
        Day vacationDay = Day.SUNDAY;
        System.out.println(workDay.toString()); // WEDNESDAY
        System.out.println(vacationDay.ordinal()); // 0
        System.out.println(workDay.equals(Day.WEDNESDAY)); // true
        System.out.println(workDay.compareTo(Day.SATURDAY)); // -3
        }
    }