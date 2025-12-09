package day12_exception;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
//        java.util.Date
//        java.sql.Date

        //create a date objected with current time information
        Date date = new Date();
        System.out.println(date);
        System.out.println(1900+date.getYear());
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());

        //printf    ->  print with format
        //%d    ->  int
        //%f    ->  double
        //%s    ->  String
//        System.out.printf("content1 placeholder content2 placeholder",value1,value2);
        System.out.printf("%d/%d/%d %d:%d:%d",
                date.getMonth()+1,date.getDate(),1900+date.getYear(),
                date.getHours(),date.getMinutes(),date.getSeconds());
    }
}
