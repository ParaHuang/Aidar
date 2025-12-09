package day12_exception;

import java.util.Calendar;

public class Test4 {
    public static void main(String[] args) {
        //single instance pattern
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //1.get
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println("today is "+calendar.get(Calendar.DAY_OF_WEEK));

        //2.make calendar have some offset based on current time
//        calendar.add(Calendar.YEAR,1);
//
//        System.out.println(calendar);
//        System.out.println("the same day after a year "+calendar.get(Calendar.DAY_OF_WEEK));

//        calendar.add(Calendar.MONTH,-1);
//        System.out.println("a month ago, this day is "+calendar.get(Calendar.DAY_OF_WEEK));

        //3.set up some field of calendar
//        calendar.set(Calendar.YEAR,1990);

        //what day is the last day of last month?

        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println("the last day of last month, it is "+calendar.get(Calendar.DAY_OF_WEEK));
    }
}