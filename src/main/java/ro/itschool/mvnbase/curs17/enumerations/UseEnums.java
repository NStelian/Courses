package ro.itschool.mvnbase.curs17.enumerations;

import static ro.itschool.mvnbase.curs17.enumerations.Days.FRIDAY;
import static ro.itschool.mvnbase.curs17.enumerations.Days.TUESDAY;

public class UseEnums {
    public static void main(String[] args) {
        DayName dayName = new DayName();
        System.out.println(dayName.sayMyName(FRIDAY));

        System.out.println(FRIDAY + " day in week is " + FRIDAY.getNumber());
        System.out.println(dayName.sayMyNumber(TUESDAY));
        System.out.println(dayName.sayMyNameAgain(TUESDAY));

        for (Days day : Days.values()) {
            System.out.println(day.getName());
        }

        //System.out.println(Days.valueOf("MONDAY").getName());

        for (Days day : Days.values()) {
            if(day.bestDay()){
                System.out.print("Best day is ");
                System.out.print(day.getName());
            }
        }
    }
}
