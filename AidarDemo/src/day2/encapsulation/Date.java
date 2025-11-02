package day2.encapsulation;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //using this(value1,value2,value3) to call other constructor

    public Date(int month, int year) {
//        this.day = 1;
//        this.month = month;
//        this.year = year;
        this(1,month,year);
    }

    public Date(int year) {
//        this.day = 1;
//        this.month = 1;
//        this.year = year;
        this(1,1,year);
    }

    public Date() {
//        this.day = 1;
//        this.month = 1;
//        this.year = 2025;
        this(1,1,2025);
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
}
