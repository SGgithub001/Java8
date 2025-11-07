package Enum;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a day of Week : ");
        String response = scn.nextLine().toUpperCase();
        try {
            Day d = Day.valueOf(response);
            switch (d){
                case MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THURSDAY,
                        FRIDAY -> System.out.println("It is a Weekday");
                case SATURDAY,
                        SUNDAY-> System.out.println("It is a WeekEnd !!");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Please enter a Valid day");
        }
        scn.close();
    }
}
