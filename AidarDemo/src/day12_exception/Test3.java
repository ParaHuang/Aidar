package day12_exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Date date = new Date();
        //format object:convert a date object into the correct format we want as a String
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String dateStr = sdf.format(date);
        System.out.printf(dateStr);

        for (int i = 0; i < 100; i++) {
            new Date();
        }
        //100 Date object
    }
}
