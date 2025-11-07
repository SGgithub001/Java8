package Enum;

public class Main {
    public static void main(String[] args) {

//        Enums = (Enumerations) A special kind of class that
//                   represents a fixed set of constants.
//                   They improve code readability and reliability.
//                   More efficient with switches than Strings.

        Day day = Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());

        switch (day){
//            case MONDAY -> System.out.println("It is a Weekday");
//            case TUESDAY -> System.out.println("It is a Weekday");
//            case WEDNESDAY -> System.out.println("It is a Weekday");
//            case THURSDAY -> System.out.println("It is a Weekday");
//            case FRIDAY -> System.out.println("It is a Weekday");
//            case SATURDAY -> System.out.println("It is a WeekEnd");
//            case SUNDAY -> System.out.println("It is a WeekEnd");

            case MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY -> System.out.println("It is a Weekday");
            case SATURDAY,
                    SUNDAY-> System.out.println("It is a WeekEnd !!");
        }
    }
}
